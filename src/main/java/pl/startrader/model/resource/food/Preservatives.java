package pl.startrader.model.resource.food;

import pl.startrader.model.resource.Production;
import pl.startrader.model.resource.Resource;
import pl.startrader.model.resource.ResourceParam;

public class Preservatives extends Resource implements Production {

    private static Preservatives instance;
    private ResourceParam param;


    private Preservatives() {
        this.param = ResourceParam.PRESERVATIVES;
    }


    public static synchronized Preservatives getInstance() {
        if(instance == null) {
            instance = new Preservatives();
        }

        return instance;
    }

    @Override
    public ResourceParam getParam() {
        return param;
    }
}
