package pl.startrader.model.resource.animal;

import pl.startrader.model.heavenly_body.Planet;
import pl.startrader.model.resource.Breed;
import pl.startrader.model.resource.Resource;
import pl.startrader.model.resource.ResourceParam;

public class Cattle extends Resource implements Breed {


    private static Cattle instance;


    private Cattle() {
        super(ResourceParam.CATTLE);

    }


    public static synchronized Cattle getInstance() {
        if(instance == null) {
            instance = new Cattle();
        }

        return instance;
    }



    @Override
    public void addQuantity(Planet planet, Integer quantity, Boolean newlyCreated) {
        if (quantity > 0) {
            if (newlyCreated) {
                create(quantity);
            }

            planet.changeQuantity_Cattle(quantity);
            System.out.println(quantity + "pcs of " + getParam().getName() + " added to stock on " + planet.getName());
        }
    }



    @Override
    public void subtractQuantity(Planet planet, Integer quantity) {
        if(quantity < 0) {
            planet.changeQuantity_Cattle(quantity);
            System.out.println(quantity + "pcs of " + getParam().getName() + " added to stock on " + planet.getName());
        }
    }



    @Override
    public void setDemanded(Planet planet) {
        if(planet.isDemanded_Cattle().equals(false)) {
            planet.setDemanded_Cattle(true);
            System.out.println(getParam().getName() + " is now demanded on " + planet.getName());
        } else {
            System.out.println(getParam().getName() + " is already demanded on " + planet.getName());
        }
    }



    @Override
    public void setNotDemanded(Planet planet) {
        if(planet.isDemanded_Cattle().equals(true)) {
            planet.setDemanded_Cattle(false);
            System.out.println(getParam().getName() + " is no longer in demand on " + planet.getName());
        } else {
            System.out.println(getParam().getName() + " is not in demand on " + planet.getName() + " anyway.");
        }
    }
}
