package pl.startrader.model.resource.mineral;

import pl.startrader.model.resource.Extraction;
import pl.startrader.model.resource.Resource;
import pl.startrader.model.resource.ResourceParam;

public class Jade extends Resource implements Extraction {

    private static Jade instance;


    private Jade() {
        super(ResourceParam.JADE);
    }


    public static synchronized Jade getInstance() {
        if(instance == null) {
            instance = new Jade();
        }

        return instance;
    }

}
