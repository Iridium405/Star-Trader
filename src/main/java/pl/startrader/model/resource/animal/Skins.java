package pl.startrader.model.resource.animal;

import pl.startrader.model.resource.Breed;
import pl.startrader.model.resource.Resource;
import pl.startrader.model.resource.ResourceParam;

public class Skins extends Resource implements Breed {

    private static Skins instance;


    private Skins() {
        super(ResourceParam.SKINS);
    }


    public static synchronized Skins getInstance() {
        if(instance == null) {
            instance = new Skins();
        }

        return instance;
    }

}
