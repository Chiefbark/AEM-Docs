package com.<project>.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.InjectionStrategy;
import org.apache.sling.models.annotations.injectorspecific.SlingObject;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import javax.annotation.PostConstruct;

import static org.apache.sling.api.resource.ResourceResolver.PROPERTY_RESOURCE_TYPE;

@Model(adaptables = Resource.class)
public class TextfieldController {

    @ValueMapValue(name = PROPERTY_RESOURCE_TYPE, injectionStrategy = InjectionStrategy.OPTIONAL)
    @Default(values = "No resourceType")
    protected String resourceType;

    @SlingObject
    private Resource currentResource;

    private String text;

    @PostConstruct
    protected void init() {
        if (currentResource.getValueMap().containsKey("text"))
            this.text = currentResource.getValueMap().get("text", String.class);
    }

    public String getText() {
        return this.text;
    }
}
