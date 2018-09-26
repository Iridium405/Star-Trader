package pl.startrader.model.resource.component;

import pl.startrader.model.resource.Resource;
import pl.startrader.model.resource.ResourceParam;

public class Photodetector extends Resource {

    private static Photodetector instance;
    private ResourceParam param;


    private Photodetector() {
        this.param = ResourceParam.PHOTODETECTOR;
    }


    public static synchronized Photodetector getInstance() {
        if(instance == null) {
            instance = new Photodetector();
        }

        return instance;
    }

    @Override
    public ResourceParam getParam() {
        return param;
    }
}
