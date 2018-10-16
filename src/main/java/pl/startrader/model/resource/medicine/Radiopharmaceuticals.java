package pl.startrader.model.resource.medicine;

import pl.startrader.model.resource.Production;
import pl.startrader.model.resource.Resource;
import pl.startrader.model.resource.ResourceParam;

public class Radiopharmaceuticals extends Resource implements Production {

    private static Radiopharmaceuticals instance;


    private Radiopharmaceuticals() {
        super(ResourceParam.RADIOPHARMACEUTICALS);
    }


    public static synchronized Radiopharmaceuticals getInstance() {
        if(instance == null) {
            instance = new Radiopharmaceuticals();
        }

        return instance;
    }

}
