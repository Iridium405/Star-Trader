package pl.startrader.model.resource.polymer;

import pl.startrader.model.resource.Production;
import pl.startrader.model.resource.Resource;
import pl.startrader.model.resource.ResourceParam;

public class Pan extends Resource implements Production {

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

    @Override
    public ResourceParam getParam() {
        return param;
    }
}
