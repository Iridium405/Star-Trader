package pl.startrader.model.resource.metal;

import pl.startrader.model.resource.Extraction;
import pl.startrader.model.resource.Resource;
import pl.startrader.model.resource.ResourceParam;

public class Plutonium extends Resource implements Extraction {

    private static Plutonium instance;


    private Plutonium() {
        super(ResourceParam.PLUTONIUM);
    }


    public static synchronized Plutonium getInstance() {
        if(instance == null) {
            instance = new Plutonium();
        }

        return instance;
    }

}
