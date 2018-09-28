package pl.startrader.model.resource.component;

import pl.startrader.model.resource.Production;
import pl.startrader.model.resource.Resource;
import pl.startrader.model.resource.ResourceParam;

public class Prototype extends Resource implements Production {

    private static Prototype instance;
    private ResourceParam param;


    private Prototype() {
        this.param = ResourceParam.PROTOTYPE;
    }


    public static synchronized Prototype getInstance() {
        if(instance == null) {
            instance = new Prototype();
        }

        return instance;
    }

    @Override
    public ResourceParam getParam() {
        return param;
    }
}
