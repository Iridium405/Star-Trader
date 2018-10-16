package pl.startrader.model.resource.metal;

import pl.startrader.model.resource.Extraction;
import pl.startrader.model.resource.Resource;
import pl.startrader.model.resource.ResourceParam;

public class Iridium extends Resource implements Extraction {

    private static Iridium instance;


    private Iridium() {
        super(ResourceParam.IRIDIUM);
    }


    public static synchronized Iridium getInstance() {
        if(instance == null) {
            instance = new Iridium();
        }

        return instance;
    }

}
