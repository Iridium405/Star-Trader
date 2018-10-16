package pl.startrader.model.resource.food;

import pl.startrader.model.resource.Production;
import pl.startrader.model.resource.Resource;
import pl.startrader.model.resource.ResourceParam;

public class Spices extends Resource implements Production {

    private static Spices instance;


    private Spices() {
        super(ResourceParam.SPICES);
    }


    public static synchronized Spices getInstance() {
        if(instance == null) {
            instance = new Spices();
        }

        return instance;
    }

}
