package pl.startrader.model.resource.polymer;

import pl.startrader.model.resource.Production;
import pl.startrader.model.resource.Resource;
import pl.startrader.model.resource.ResourceParam;

public class Pom extends Resource implements Production {

    private static Pom instance;
    private ResourceParam param;


    private Pom() {
        this.param = ResourceParam.POM;
    }


    public static synchronized Pom getInstance() {
        if(instance == null) {
            instance = new Pom();
        }

        return instance;
    }

    @Override
    public ResourceParam getParam() {
        return param;
    }
}
