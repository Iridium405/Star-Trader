package pl.startrader.model.resource.animal;

import pl.startrader.model.resource.Resource;
import pl.startrader.model.resource.ResourceParam;

public class Cattle extends Resource {

    private static Cattle instance;
    private ResourceParam param;


    private Cattle() {
        this.param = ResourceParam.CATTLE;
    }


    public static synchronized Cattle getInstance() {
        if(instance == null) {
            instance = new Cattle();
        }

        return instance;
    }

    @Override
    public ResourceParam getParam() {
        return param;
    }
}
