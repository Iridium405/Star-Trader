package pl.startrader.model.resource.polymer;

import pl.startrader.model.resource.Production;
import pl.startrader.model.resource.Resource;
import pl.startrader.model.resource.ResourceParam;

public class Biopolymer extends Resource implements Production {

    private static Biopolymer instance;


    private Biopolymer() {
        super(ResourceParam.BIOPOLYMER);
    }


    public static synchronized Biopolymer getInstance() {
        if(instance == null) {
            instance = new Biopolymer();
        }

        return instance;
    }

}
