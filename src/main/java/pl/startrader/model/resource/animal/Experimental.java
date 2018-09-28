package pl.startrader.model.resource.animal;

import pl.startrader.model.resource.Breed;
import pl.startrader.model.resource.Resource;
import pl.startrader.model.resource.ResourceParam;

public class Experimental extends Resource implements Breed {

    private static Experimental instance;
    private ResourceParam param;


    private Experimental() {
        this.param = ResourceParam.EXPERIMENTAL;
    }


    public static synchronized Experimental getInstance() {
        if(instance == null) {
            instance = new Experimental();
        }

        return instance;
    }

    @Override
    public ResourceParam getParam() {
        return param;
    }
}
