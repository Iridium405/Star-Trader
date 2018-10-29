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

    public Integer getQuantity(Planet planet) {
        switch (param.getName()) {
            case "Cattle":
                return planet.getQuantity_Cattle();
            case "Decorative":
                return planet.getQuantity_Decorative();
            case "Endangered":
                return planet.getQuantity_Endangered();
            case "Experimental":
                return planet.getQuantity_Experimental();
            case "Skins":
                return planet.getQuantity_Skins();
            case "Accumulator":
                return planet.getQuantity_Accumulator();
            case "Circuit":
                return planet.getQuantity_Circuit();
            case "Nanoelectronics":
                return planet.getQuantity_Nanoelectronics();
            case "Photodetector":
                return planet.getQuantity_Photodetector();
            case "Prototype":
                return planet.getQuantity_Prototype();
            case "Modified Food":
                return planet.getQuantity_ModifiedFood();
            case "Natural Food":
                return planet.getQuantity_NaturalFood();
            case "Preservatives":
                return planet.getQuantity_Preservatives();
            case "Spices":
                return planet.getQuantity_Spices();
            case "Synthetic Food":
                return planet.getQuantity_SyntheticFood();
            case "Antiseptics":
                return planet.getQuantity_Antiseptics();
            case "Chemotherapeutics":
                return planet.getQuantity_Chemoterapeutics();
            case "Genetic Drugs":
                return planet.getQuantity_GeneticDrugs();
            case "Radiopharmaceuticals":
                return planet.getQuantity_Radiopharmaceuticals();
            case "Vaccines":
                return planet.getQuantity_Vaccines();
            case "Antimatter":
                return planet.getQuantity_Antimatter();
            case "Iridium":
                return planet.getQuantity_Iridium();
            case "Platinum":
                return planet.getQuantity_Platinum();
            case "Plutonium":
                return planet.getQuantity_Plutonium();
            case "Titanium":
                return planet.getQuantity_Titanium();
            case "Dioptase":
                return planet.getQuantity_Dioptase();
            case "Fluorite":
                return planet.getQuantity_Fluorite();
            case "Jade":
                return planet.getQuantity_Jade();
            case "Onyx":
                return planet.getQuantity_Onyx();
            case "Rhodonite":
                return planet.getQuantity_Rhodonite();
            case "Biopolymer":
                return planet.getQuantity_Biopolymer();
            case "PAN":
                return planet.getQuantity_PAN();
            case "PMMA":
                return planet.getQuantity_PMMA();
            case "POM":
                return planet.getQuantity_POM();
            case "PTFE":
                return planet.getQuantity_PTFE();
            default:
                return 0;
        }
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
     * @param quantity  Quantity of resource. Must be positive.
     */
    public abstract void subtractQuantity(Planet planet, Integer quantity);


    //TODO
    public ArrayList<Planet> demandedList() {
        return new ArrayList<>();
    }



    public abstract void setDemanded(Planet planet);

    public abstract void setNotDemanded(Planet planet);

}