package pl.startrader.model.resource.metal;

import pl.startrader.model.resource.Resource;
import pl.startrader.model.resource.ResourceParam;

public class Plutonium extends Resource {

    private static Plutonium instance;
    private ResourceParam param;


    private Plutonium() {
        this.param = ResourceParam.PLUTONIUM;
    }


    public static synchronized Plutonium getInstance() {
        if(instance == null) {
            instance = new Plutonium();
        }

        return instance;
    }


    public ResourceParam getParam() {
        return param;
    }
}
