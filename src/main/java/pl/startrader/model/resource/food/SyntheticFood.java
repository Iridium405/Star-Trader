package pl.startrader.model.resource.food;

import pl.startrader.model.resource.Production;
import pl.startrader.model.resource.Resource;
import pl.startrader.model.resource.ResourceParam;

public class SyntheticFood extends Resource implements Production {

    private static SyntheticFood instance;


    private SyntheticFood() {
        super(ResourceParam.SYNTHETIC);
    }


    public static synchronized SyntheticFood getInstance() {
        if(instance == null) {
            instance = new SyntheticFood();
        }

        return instance;
    }

}
