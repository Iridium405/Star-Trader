package pl.startrader.model.resource.metal;

import pl.startrader.model.resource.Resource;
import pl.startrader.model.resource.ResourceParam;

public class Antimatter extends Resource {

    private static Antimatter instance;
    private ResourceParam param;


    private Antimatter() {
        this.param = ResourceParam.ANTIMATTER;
    }


    public static synchronized Antimatter getInstance() {
        if(instance == null) {
            instance = new Antimatter();
        }

        return instance;
    }

    @Override
    public ResourceParam getParam() {
        return param;
    }
}
