package co.dlighthouse.aem.reactsimpleexample.core.models;

import javax.annotation.PostConstruct;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.InjectionStrategy;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;


@Model(adaptables = Resource.class)
public class BasicModel {
    @ValueMapValue(injectionStrategy=InjectionStrategy.OPTIONAL)
    protected String text;
    @ValueMapValue(injectionStrategy=InjectionStrategy.OPTIONAL)
    protected Boolean checkbox;

    public String getText() {
        return text;
    }
    public Boolean isCheckbox() {
        return checkbox;
    }
}
