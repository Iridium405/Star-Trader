package pl.startrader.model.resource.medicine;

import pl.startrader.model.resource.Resource;
import pl.startrader.model.resource.ResourceParam;

public class GeneticDrugs extends Resource {

    private static GeneticDrugs instance;
    private ResourceParam param;


    private GeneticDrugs() {
        this.param = ResourceParam.GENETIC_DRUGS;
    }


    public static synchronized GeneticDrugs getInstance() {
        if(instance == null) {
            instance = new GeneticDrugs();
        }

        return instance;
    }

    @Override
    public ResourceParam getParam() {
        return param;
    }
}
