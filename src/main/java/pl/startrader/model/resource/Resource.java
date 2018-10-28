package pl.startrader.model.resource;


import pl.startrader.model.heavenly_body.Planet;

import java.util.ArrayList;

public abstract class Resource {


    private ResourceParam param;

    private Integer globalQuantity;


    public Resource(ResourceParam param) {
        this.param = param;
        this.globalQuantity = 0;
    }


    public ResourceParam getParam() {
        return param;
    }


    public void create(Integer quantity) {
        if(quantity > 0) {
            this.globalQuantity += quantity;
            System.out.println(quantity + "pcs of " + this.param.getName() + " created (added globally).");
        }
    }

    public void destroy(Integer quantity) {
        if(quantity > 0 && this.globalQuantity - quantity >= 0) {
            this.globalQuantity -= quantity;
        }
    }

    public Integer getGlobalQuantity() {
        return this.globalQuantity;
    }



    /**
     * Used for adding resources to stock and globally if needed.
     *
     * @param planet        Planet, where the change occure.
     * @param quantity      Quantity of resource. Must be positive.
     * @param newlyCreated  If false - resources WILL NOT be added globally.
     *                      Used while trading or moving resources in or out of the planet.
     *                      If true - resources WILL be added globally as well.
     *                      Used while extracting/ producing/ breeding new resources.
     */
    public abstract void addQuantity(Planet planet, Integer quantity, Boolean newlyCreated);



    /**
     * Used for subtracting resource to stock.
     *
     * @param planet    Existing planet where the change occure.
     * @param quantity  Quantity of resource. Must be negative.
     */
    public abstract void subtractQuantity(Planet planet, Integer quantity);


    //TODO
    public ArrayList<Planet> demandedList() {
        return new ArrayList<>();
    }



    public abstract void setDemanded(Planet planet);

    public abstract void setNotDemanded(Planet planet);

}