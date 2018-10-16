package pl.startrader.model.resource.polymer;

import pl.startrader.model.resource.Production;
import pl.startrader.model.resource.Resource;
import pl.startrader.model.resource.ResourceParam;

public class Ptfe extends Resource implements Production {

    private static Ptfe instance;


    private Ptfe() {
        super(ResourceParam.PTFE);
    }


    public static synchronized Ptfe getInstance() {
        if(instance == null) {
            instance = new Ptfe();
        }

        return instance;
    }

}
