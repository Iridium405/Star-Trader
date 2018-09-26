package pl.startrader.model.resource.metal;

import pl.startrader.model.resource.Resource;
import pl.startrader.model.resource.ResourceParam;

public class Iridium extends Resource {

    private static Iridium instance;
    private ResourceParam param;


    private Iridium() {
        this.param = ResourceParam.IRIDIUM;
    }


    public static synchronized Iridium getInstance() {
        if(instance == null) {
            instance = new Iridium();
        }

        return instance;
    }

    @Override
    public ResourceParam getParam() {
        return param;
    }
}
