package com.<project>.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.InjectionStrategy;
import org.apache.sling.models.annotations.injectorspecific.SlingObject;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Iterator;

@Model(adaptables = Resource.class)
public class MultiFieldController {

    @ValueMapValue(name = PROPERTY_RESOURCE_TYPE, injectionStrategy = InjectionStrategy.OPTIONAL)
    @Default(values = "No resourceType")
    protected String resourceType;

    @SlingObject
    private Resource currentResource;

    private ArrayList<String> multi;

    @PostConstruct
    protected void init() {
        this.multi = new ArrayList<>();

        Resource res_list = currentResource.getChild("multi");
        if (res_list != null) {
            Iterator<Resource> children = res_list.listChildren();
            while (children.hasNext()) {
                Resource res_item = children.next();
                if(res_item.getValueMap().containsKey("text"))
                    this.multi.add(res_item.getValueMap().get("text", String.class));
            }
        }
    }

    public ArrayList<String> getMulti() {
        return this.multi;
    }
}