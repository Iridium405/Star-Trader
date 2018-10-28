package pl.startrader.model.resource.food;

import pl.startrader.model.heavenly_body.Planet;
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

    @Override
    public void addQuantity(Planet planet, Integer quantity, Boolean newlyCreated) {
        if (quantity > 0) {
            if (newlyCreated) {
                create(quantity);
            }

            planet.changeQuantity_ModifiedFood(quantity);
            System.out.println(quantity + "pcs of " + getParam().getName() + " added to stock on " + planet.getName());
        }
    }



    @Override
    public void subtractQuantity(Planet planet, Integer quantity) {
        if(quantity < 0) {
            planet.changeQuantity_ModifiedFood(quantity);
            System.out.println(quantity + "pcs of " + getParam().getName() + " added to stock on " + planet.getName());
        }
    }



    @Override
    public void setDemanded(Planet planet) {
        if(planet.isDemanded_ModifiedFood().equals(false)) {
            planet.setDemanded_ModifiedFood(true);
            System.out.println(getParam().getName() + " is now demanded on " + planet.getName());
        } else {
            System.out.println(getParam().getName() + " is already demanded on " + planet.getName());
        }
    }



    @Override
    public void setNotDemanded(Planet planet) {
        if(planet.isDemanded_ModifiedFood().equals(true)) {
            planet.setDemanded_ModifiedFood(false);
            System.out.println(getParam().getName() + " is no longer in demand on " + planet.getName());
        } else {
            System.out.println(getParam().getName() + " is not in demand on " + planet.getName() + " anyway.");
        }
    }

}
