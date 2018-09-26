package pl.startrader.model.resource.mineral;

import pl.startrader.model.resource.Resource;
import pl.startrader.model.resource.ResourceParam;

public class Dioptase extends Resource {

    private static Dioptase instance;
    private ResourceParam param;


    private Dioptase() {
        this.param = ResourceParam.DIOPTASE;
    }


    public static synchronized Dioptase getInstance() {
        if(instance == null) {
            instance = new Dioptase();
        }

        return instance;
    }

    @Override
    public ResourceParam getParam() {
        return param;
    }
}
