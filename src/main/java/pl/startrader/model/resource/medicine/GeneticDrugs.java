package pl.startrader.model.resource.medicine;

import pl.startrader.model.resource.Production;
import pl.startrader.model.resource.Resource;
import pl.startrader.model.resource.ResourceParam;

public class GeneticDrugs extends Resource implements Production {

    private static GeneticDrugs instance;


    private GeneticDrugs() {
        super(ResourceParam.GENETIC_DRUGS);
    }


    public static synchronized GeneticDrugs getInstance() {
        if(instance == null) {
            instance = new GeneticDrugs();
        }

        return instance;
    }

}
