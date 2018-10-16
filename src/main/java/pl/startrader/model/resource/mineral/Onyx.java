package pl.startrader.model.resource.mineral;

import pl.startrader.model.resource.Extraction;
import pl.startrader.model.resource.Resource;
import pl.startrader.model.resource.ResourceParam;

public class Onyx extends Resource implements Extraction {

    private static Onyx instance;


    private Onyx() {
        super(ResourceParam.ONYX);
    }


    public static synchronized Onyx getInstance() {
        if(instance == null) {
            instance = new Onyx();
        }

        return instance;
    }


}
