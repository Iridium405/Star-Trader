package pl.startrader.model.resource.mineral;

import pl.startrader.model.resource.Extraction;
import pl.startrader.model.resource.Resource;
import pl.startrader.model.resource.ResourceParam;

public class Rhodonite extends Resource implements Extraction {

    private static Rhodonite instance;
    private ResourceParam param;


    private Rhodonite() {
        this.param = ResourceParam.RHODONITE;
    }


    public static synchronized Rhodonite getInstance() {
        if(instance == null) {
            instance = new Rhodonite();
        }

        return instance;
    }

    @Override
    public ResourceParam getParam() {
        return param;
    }
}
