package pl.startrader.model.resource.component;

import pl.startrader.model.resource.Resource;
import pl.startrader.model.resource.ResourceParam;

public class Nanoelectronics extends Resource {

    private static Nanoelectronics instance;
    private ResourceParam param;


    private Nanoelectronics() {
        this.param = ResourceParam.NANOELECTRONICS;
    }


    public static synchronized Nanoelectronics getInstance() {
        if(instance == null) {
            instance = new Nanoelectronics();
        }

        return instance;
    }

    @Override
    public ResourceParam getParam() {
        return param;
    }
}
