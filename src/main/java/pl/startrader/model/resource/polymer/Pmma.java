package pl.startrader.model.resource.polymer;

import pl.startrader.model.resource.Resource;
import pl.startrader.model.resource.ResourceParam;

public class Pmma extends Resource {

    private static Pmma instance;
    private ResourceParam param;


    public Pmma() {
        this.param = ResourceParam.PMMA;
    }


    public static synchronized Pmma getInstance() {
        if(instance == null) {
            instance = new Pmma();
        }

        return instance;
    }

    @Override
    public ResourceParam getParam() {
        return param;
    }
}
