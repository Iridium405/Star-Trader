package pl.startrader.model.resource.component;

import pl.startrader.model.resource.Production;
import pl.startrader.model.resource.Resource;
import pl.startrader.model.resource.ResourceParam;

public class Accumulator extends Resource implements Production {

    private static Accumulator instance;
    private ResourceParam param;


    private Accumulator() {
        this.param = ResourceParam.ACCUMULATOR;
    }


    public static synchronized Accumulator getInstance() {
        if(instance == null) {
            instance = new Accumulator();
        }

        return instance;
    }

    @Override
    public ResourceParam getParam() {
        return param;
    }
}
