package pl.startrader.model.resource.mineral;

import pl.startrader.model.resource.Resource;
import pl.startrader.model.resource.ResourceParam;

public class Jade extends Resource {

    private static Jade instance;
    private ResourceParam param;


    private Jade() {
        this.param = ResourceParam.JADE;
    }


    public static synchronized Jade getInstance() {
        if(instance == null) {
            instance = new Jade();
        }

        return instance;
    }

    @Override
    public ResourceParam getParam() {
        return param;
    }
}
