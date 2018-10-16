package pl.startrader.model.resource.mineral;

import pl.startrader.model.resource.Extraction;
import pl.startrader.model.resource.Resource;
import pl.startrader.model.resource.ResourceParam;

public class Fluorite extends Resource implements Extraction {

    private static Fluorite instance;


    private Fluorite() {
        super(ResourceParam.FLUORITE);
    }


    public static synchronized Fluorite getInstance() {
        if(instance == null) {
            instance = new Fluorite();
        }

        return instance;
    }

}
