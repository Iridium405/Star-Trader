package pl.startrader.model.resource.medicine;

import pl.startrader.model.resource.Resource;
import pl.startrader.model.resource.ResourceParam;

public class Vaccines extends Resource {

    private static Vaccines instance;
    private ResourceParam param;


    private Vaccines() {
        this.param = ResourceParam.VACCINES;
    }


    public static synchronized Vaccines getInstance() {
        if(instance == null) {
            instance = new Vaccines();
        }

        return instance;
    }

    @Override
    public ResourceParam getParam() {
        return param;
    }
}
