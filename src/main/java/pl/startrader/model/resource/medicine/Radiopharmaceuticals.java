package pl.startrader.model.resource.medicine;

import pl.startrader.model.resource.Resource;
import pl.startrader.model.resource.ResourceParam;

public class Radiopharmaceuticals extends Resource {

    private static Radiopharmaceuticals instance;
    private ResourceParam param;


    private Radiopharmaceuticals() {
        this.param = ResourceParam.RADIOPHARMACEUTICALS;
    }


    public static synchronized Radiopharmaceuticals getInstance() {
        if(instance == null) {
            instance = new Radiopharmaceuticals();
        }

        return instance;
    }

    @Override
    public ResourceParam getParam() {
        return param;
    }
}
