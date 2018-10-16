package pl.startrader.model.resource.component;

import pl.startrader.model.resource.Production;
import pl.startrader.model.resource.Resource;
import pl.startrader.model.resource.ResourceParam;

public class Circuit extends Resource implements Production {

    private static Circuit instance;


    private Circuit() {
        super(ResourceParam.CIRCUIT);
    }


    public static synchronized Circuit getInstance() {
        if(instance == null) {
            instance = new Circuit();
        }

        return instance;
    }

}
