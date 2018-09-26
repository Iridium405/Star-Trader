package pl.startrader.model.resource.medicine;

import pl.startrader.model.resource.Resource;
import pl.startrader.model.resource.ResourceParam;

public class Chemotherapeutics extends Resource {

    private static Chemotherapeutics instance;
    private ResourceParam param;


    private Chemotherapeutics() {
        this.param = ResourceParam.CHEMOTHERAPEUTICS;
    }


    public static synchronized Chemotherapeutics getInstance() {
        if(instance == null) {
            instance = new Chemotherapeutics();
        }

        return instance;
    }

    @Override
    public ResourceParam getParam() {
        return param;
    }
}
