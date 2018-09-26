package pl.startrader.model.resource.mineral;

import pl.startrader.model.resource.Resource;
import pl.startrader.model.resource.ResourceParam;

public class Rhodonite extends Resource {

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


    public ResourceParam getParam() {
        return param;
    }
}
