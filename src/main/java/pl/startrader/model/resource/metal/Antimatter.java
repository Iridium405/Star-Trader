package pl.startrader.model.resource.metal;

import pl.startrader.model.resource.Extraction;
import pl.startrader.model.resource.Resource;
import pl.startrader.model.resource.ResourceParam;

public class Antimatter extends Resource implements Extraction {

    private static Antimatter instance;


    private Antimatter() {
        super(ResourceParam.ANTIMATTER);
    }


    public static synchronized Antimatter getInstance() {
        if(instance == null) {
            instance = new Antimatter();
        }

        return instance;
    }

}
