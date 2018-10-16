package pl.startrader.model.resource.metal;

import pl.startrader.model.resource.Extraction;
import pl.startrader.model.resource.Resource;
import pl.startrader.model.resource.ResourceParam;

public class Platinum extends Resource implements Extraction {

    private static Platinum instance;


    private Platinum() {
        super(ResourceParam.PLATINUM);
    }


    public static synchronized Platinum getInstance() {
        if(instance == null) {
            instance = new Platinum();
        }

        return instance;
    }

}
