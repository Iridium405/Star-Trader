package pl.startrader.model.resource.medicine;

import pl.startrader.model.resource.Production;
import pl.startrader.model.resource.Resource;
import pl.startrader.model.resource.ResourceParam;

public class Chemotherapeutics extends Resource implements Production {

    private static Chemotherapeutics instance;


    private Chemotherapeutics() {
        super(ResourceParam.CHEMOTHERAPEUTICS);
    }


    public static synchronized Chemotherapeutics getInstance() {
        if(instance == null) {
            instance = new Chemotherapeutics();
        }

        return instance;
    }

}
