package pl.startrader.model.resource.animal;

import pl.startrader.model.resource.Breed;
import pl.startrader.model.resource.Resource;
import pl.startrader.model.resource.ResourceParam;

public class Decorative extends Resource implements Breed {

    private static Decorative instance;
    private ResourceParam param;


    private Decorative() {
        this.param = ResourceParam.DECORATIVE;
    }


    public static synchronized Decorative getInstance() {
        if(instance == null) {
            instance = new Decorative();
        }

        return instance;
    }

    @Override
    public ResourceParam getParam() {
        return param;
    }
}
