package pl.startrader.model.resource.mineral;

import pl.startrader.model.resource.Extraction;
import pl.startrader.model.resource.Resource;
import pl.startrader.model.resource.ResourceParam;

public class Dioptase extends Resource implements Extraction {

    private static Dioptase instance;


    private Dioptase() {
        super(ResourceParam.DIOPTASE);
    }


    public static synchronized Dioptase getInstance() {
        if(instance == null) {
            instance = new Dioptase();
        }

        return instance;
    }

}
