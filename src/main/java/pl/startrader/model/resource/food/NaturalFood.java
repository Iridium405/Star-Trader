package pl.startrader.model.resource.food;

import pl.startrader.model.resource.Resource;
import pl.startrader.model.resource.ResourceParam;

public class Natural extends Resource {

    private static Natural instance;
    private ResourceParam param;


    private Natural() {
        this.param = ResourceParam.NATURAL;
    }


    public static synchronized Natural getInstance() {
        if(instance == null) {
            instance = new Natural();
        }

        return instance;
    }

    @Override
    public ResourceParam getParam() {
        return param;
    }
}
