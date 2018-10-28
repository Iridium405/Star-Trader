package pl.startrader.model.resource.mineral;

import pl.startrader.model.heavenly_body.Planet;
import pl.startrader.model.resource.Extraction;
import pl.startrader.model.resource.Resource;
import pl.startrader.model.resource.ResourceParam;

public class Onyx extends Resource implements Extraction {

    private static Onyx instance;


    private Onyx() {
        super(ResourceParam.ONYX);
    }


    public static synchronized Onyx getInstance() {
        if(instance == null) {
            instance = new Onyx();
        }

        return instance;
    }

    @Override
    public void addQuantity(Planet planet, Integer quantity, Boolean newlyCreated) {
        if (quantity > 0) {
            if (newlyCreated) {
                create(quantity);
            }

            planet.changeQuantity_Onyx(quantity);
            System.out.println(quantity + "pcs of " + getParam().getName() + " added to stock on " + planet.getName());
        }
    }



    @Override
    public void subtractQuantity(Planet planet, Integer quantity) {
        if(quantity < 0) {
            planet.changeQuantity_Onyx(quantity);
            System.out.println(quantity + "pcs of " + getParam().getName() + " added to stock on " + planet.getName());
        }
    }



    @Override
    public void setDemanded(Planet planet) {
        if(planet.isDemanded_Onyx().equals(false)) {
            planet.setDemanded_Onyx(true);
            System.out.println(getParam().getName() + " is now demanded on " + planet.getName());
        } else {
            System.out.println(getParam().getName() + " is already demanded on " + planet.getName());
        }
    }



    @Override
    public void setNotDemanded(Planet planet) {
        if(planet.isDemanded_Onyx().equals(true)) {
            planet.setDemanded_Onyx(false);
            System.out.println(getParam().getName() + " is no longer in demand on " + planet.getName());
        } else {
            System.out.println(getParam().getName() + " is not in demand on " + planet.getName() + " anyway.");
        }
    }


}
