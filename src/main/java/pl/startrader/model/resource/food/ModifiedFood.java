package pl.startrader.model.resource.food;

import pl.startrader.model.resource.Production;
import pl.startrader.model.resource.Resource;
import pl.startrader.model.resource.ResourceParam;

public class ModifiedFood extends Resource implements Production {

    private static ModifiedFood instance;
    private ResourceParam param;


    private ModifiedFood() {
        this.param = ResourceParam.MODIFIED;
    }


    public static synchronized ModifiedFood getInstance() {
        if(instance == null) {
            instance = new ModifiedFood();
        }

        return instance;
    }

    @Override
    public ResourceParam getParam() {
        return param;
    }
}
