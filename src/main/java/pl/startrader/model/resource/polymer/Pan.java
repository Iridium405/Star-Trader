package pl.startrader.model.resource.polymer;

import pl.startrader.model.resource.Resource;
import pl.startrader.model.resource.ResourceParam;

public class Pan extends Resource {

    private static Pan instance;
    private ResourceParam param;


    private Pan() {
        this.param = ResourceParam.PAN;
    }


    public static synchronized Pan getInstance() {
        if(instance == null) {
            instance = new Pan();
        }

        return instance;
    }


    public ResourceParam getParam() {
        return param;
    }
}
