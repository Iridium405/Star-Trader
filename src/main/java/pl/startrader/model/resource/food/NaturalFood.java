package pl.startrader.model.resource.food;

import pl.startrader.model.resource.Production;
import pl.startrader.model.resource.Resource;
import pl.startrader.model.resource.ResourceParam;

public class NaturalFood extends Resource implements Production {

    private static NaturalFood instance;


    private NaturalFood() {
        super(ResourceParam.NATURAL);
    }


    public static synchronized NaturalFood getInstance() {
        if(instance == null) {
            instance = new NaturalFood();
        }

        return instance;
    }

}
