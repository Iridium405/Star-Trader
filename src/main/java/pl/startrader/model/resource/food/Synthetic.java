package pl.startrader.model.resource.food;

import pl.startrader.model.resource.Resource;
import pl.startrader.model.resource.ResourceParam;

public class Synthetic extends Resource {

    private static Synthetic instance;
    private ResourceParam param;


    private Synthetic() {
        this.param = ResourceParam.SYNTHETIC;
    }


    public static synchronized Synthetic getInstance() {
        if(instance == null) {
            instance = new Synthetic();
        }

        return instance;
    }

    @Override
    public ResourceParam getParam() {
        return param;
    }
}
