package pl.startrader.model.resource.component;

import pl.startrader.model.resource.Production;
import pl.startrader.model.resource.Resource;
import pl.startrader.model.resource.ResourceParam;

public class Photodetector extends Resource implements Production {

    private static Photodetector instance;


    private Photodetector() {
        super(ResourceParam.PHOTODETECTOR);
    }


    public static synchronized Photodetector getInstance() {
        if(instance == null) {
            instance = new Photodetector();
        }

        return instance;
    }

}
