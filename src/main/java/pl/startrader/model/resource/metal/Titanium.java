package pl.startrader.model.resource.metal;

import pl.startrader.model.resource.Extraction;
import pl.startrader.model.resource.Resource;
import pl.startrader.model.resource.ResourceParam;

public class Titanium extends Resource implements Extraction {

    private static Titanium instance;
    private ResourceParam param;


    private Titanium() {
        this.param = ResourceParam.TITANIUM;
    }


    public static synchronized Titanium getInstance() {
        if(instance == null) {
            instance = new Titanium();
        }

        return instance;
    }

    @Override
    public ResourceParam getParam() {
        return param;
    }
}
