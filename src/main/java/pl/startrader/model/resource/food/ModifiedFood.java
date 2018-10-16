package pl.startrader.model.resource.food;

import pl.startrader.model.resource.Production;
import pl.startrader.model.resource.Resource;
import pl.startrader.model.resource.ResourceParam;

public class ModifiedFood extends Resource implements Production {

    private static ModifiedFood instance;


    private ModifiedFood() {
        super(ResourceParam.MODIFIED);
    }


    public static synchronized ModifiedFood getInstance() {
        if(instance == null) {
            instance = new ModifiedFood();
        }

        return instance;
    }

}
