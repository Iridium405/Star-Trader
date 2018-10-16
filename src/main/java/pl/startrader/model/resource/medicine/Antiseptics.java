package pl.startrader.model.resource.medicine;

import pl.startrader.model.resource.Production;
import pl.startrader.model.resource.Resource;
import pl.startrader.model.resource.ResourceParam;

public class Antiseptics extends Resource implements Production {

    private static Antiseptics instance;


    private Antiseptics() {
        super(ResourceParam.ANTISEPTICS);
    }


    public static synchronized Antiseptics getInstance() {
        if(instance == null) {
            instance = new Antiseptics();
        }

        return instance;
    }

}
