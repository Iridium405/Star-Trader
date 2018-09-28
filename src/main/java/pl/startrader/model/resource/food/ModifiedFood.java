package pl.startrader.model.resource.food;

import pl.startrader.model.resource.Resource;
import pl.startrader.model.resource.ResourceParam;

public class Modified extends Resource {

    private static Modified instance;
    private ResourceParam param;


    private Modified() {
        this.param = ResourceParam.MODIFIED;
    }


    public static synchronized Modified getInstance() {
        if(instance == null) {
            instance = new Modified();
        }

        return instance;
    }

    @Override
    public ResourceParam getParam() {
        return param;
    }
}
