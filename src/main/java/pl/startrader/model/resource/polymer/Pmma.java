package pl.startrader.model.resource.polymer;

import pl.startrader.model.resource.Production;
import pl.startrader.model.resource.Resource;
import pl.startrader.model.resource.ResourceParam;

public class Pmma extends Resource implements Production {

    private static Pmma instance;


    public Pmma() {
        super(ResourceParam.PMMA);
    }


    public static synchronized Pmma getInstance() {
        if(instance == null) {
            instance = new Pmma();
        }

        return instance;
    }

}
