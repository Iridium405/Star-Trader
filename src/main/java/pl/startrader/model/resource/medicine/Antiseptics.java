package pl.startrader.model.resource.medicine;

import pl.startrader.model.heavenly_body.Planet;
import pl.startrader.model.resource.Production;
import pl.startrader.model.resource.Resource;
import pl.startrader.model.resource.ResourceParam;

public class Antiseptics extends Resource implements Production {

    private static Antiseptics instance;


    private Antiseptics() {
        super(ResourceParam.ANTISEPTICS);
    }


    public static synchronized Antiseptics getInstance() {
        if(instance == null) {
            instance = new Antiseptics();
        }

        return instance;
    }

    @Override
    public void addQuantity(Planet planet, Integer quantity, Boolean newlyCreated) {
        if (quantity > 0) {
            if (newlyCreated) {
                create(quantity);
            }

            planet.changeQuantity_Antiseptics(quantity);
            System.out.println(quantity + "pcs of " + getParam().getName() + " added to stock on " + planet.getName());
        }
    }



    @Override
    public void subtractQuantity(Planet planet, Integer quantity) {
        if(quantity >0) {
            planet.changeQuantity_Antiseptics(-quantity);
            System.out.println(quantity + "pcs of " + getParam().getName() + " added to stock on " + planet.getName());
        }
    }



    @Override
    public void setDemanded(Planet planet) {
        if(planet.isDemanded_Antiseptics().equals(false)) {
            planet.setDemanded_Antiseptics(true);
            System.out.println(getParam().getName() + " is now demanded on " + planet.getName());
        } else {
            System.out.println(getParam().getName() + " is already demanded on " + planet.getName());
        }
    }



    @Override
    public void setNotDemanded(Planet planet) {
        if(planet.isDemanded_Antiseptics().equals(true)) {
            planet.setDemanded_Antiseptics(false);
            System.out.println(getParam().getName() + " is no longer in demand on " + planet.getName());
        } else {
            System.out.println(getParam().getName() + " is not in demand on " + planet.getName() + " anyway.");
        }
    }

}
