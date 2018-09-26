package pl.startrader.model.resource.mineral;

import pl.startrader.model.resource.Resource;
import pl.startrader.model.resource.ResourceParam;

public class Onyx extends Resource {

    private static Onyx instance;
    private ResourceParam param;


    private Onyx() {
        this.param = ResourceParam.ONYX;
    }


    public static synchronized Onyx getInstance() {
        if(instance == null) {
            instance = new Onyx();
        }

        return instance;
    }


    public ResourceParam getParam() {
        return param;
    }

}
