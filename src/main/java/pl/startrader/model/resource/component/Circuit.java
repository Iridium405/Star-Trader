package pl.startrader.model.resource.component;

import pl.startrader.model.resource.Resource;
import pl.startrader.model.resource.ResourceParam;

public class Circuit extends Resource {

    private static Circuit instance;
    private ResourceParam param;


    private Circuit() {
        this.param = ResourceParam.CIRCUIT;
    }


    public static synchronized Circuit getInstance() {
        if(instance == null) {
            instance = new Circuit();
        }

        return instance;
    }

    @Override
    public ResourceParam getParam() {
        return param;
    }
}
