package pl.startrader.model.resource.animal;

import pl.startrader.model.resource.Breed;
import pl.startrader.model.resource.Resource;
import pl.startrader.model.resource.ResourceParam;

public class Endangered extends Resource implements Breed {

    private static Endangered instance;
    private ResourceParam param;


    private Endangered() {
        this.param = ResourceParam.ENDANGERED;
    }


    public static synchronized Endangered getInstance() {
        if(instance == null) {
            instance = new Endangered();
        }

        return instance;
    }

    @Override
    public ResourceParam getParam() {
        return param;
    }
}
