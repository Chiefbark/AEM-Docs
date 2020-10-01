package com.<project>.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.SlingObject;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Iterator;

@Model(adaptables = Resource.class)
public class PruebaMultiModel {

    @SlingObject
    private Resource currentResource;

    private ArrayList<String> lista;

    public ArrayList<String> getLista() {
        return lista;
    }

    @PostConstruct
    protected void init() {
        this.lista = new ArrayList<>();
        String text;

        Resource multi = currentResource.getChild("list");
        if (multi != null) {
            Iterator<Resource> children = multi.listChildren();
            while (children.hasNext()) {
                text = children.next().getValueMap().get("text", String.class);
                lista.add(text);
            }
        }



    }

}