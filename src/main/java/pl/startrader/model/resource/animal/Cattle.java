package pl.startrader.model.resource.animal;

import pl.startrader.model.resource.Breed;
import pl.startrader.model.resource.Resource;
import pl.startrader.model.resource.ResourceParam;

public class Cattle extends Resource implements Breed {

    private static Cattle instance;


    public Cattle() {
        super(ResourceParam.CATTLE);

    }


    public static synchronized Cattle getInstance() {
        if(instance == null) {
            instance = new Cattle();
        }

        return instance;
    }

}
