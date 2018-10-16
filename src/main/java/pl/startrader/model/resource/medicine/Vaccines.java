package pl.startrader.model.resource.medicine;

import pl.startrader.model.resource.Production;
import pl.startrader.model.resource.Resource;
import pl.startrader.model.resource.ResourceParam;

public class Vaccines extends Resource implements Production {

    private static Vaccines instance;


    private Vaccines() {
        super(ResourceParam.VACCINES);
    }


    public static synchronized Vaccines getInstance() {
        if(instance == null) {
            instance = new Vaccines();
        }

        return instance;
    }

}
