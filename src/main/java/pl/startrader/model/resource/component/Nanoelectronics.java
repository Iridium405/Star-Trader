package pl.startrader.model.resource.component;

import pl.startrader.model.resource.Production;
import pl.startrader.model.resource.Resource;
import pl.startrader.model.resource.ResourceParam;

public class Nanoelectronics extends Resource implements Production {

    private static Nanoelectronics instance;


    private Nanoelectronics() {
        super(ResourceParam.NANOELECTRONICS);
    }


    public static synchronized Nanoelectronics getInstance() {
        if(instance == null) {
            instance = new Nanoelectronics();
        }

        return instance;
    }

}
