package pl.startrader.model.resource.metal;

import pl.startrader.model.resource.Resource;
import pl.startrader.model.resource.ResourceType;

public class Platinium extends Resource {

    private static Platinium instance;

    private String name;
    private ResourceType resourceType;



    private Platinum() {
        this.name = "Platinium";
        this.resourceType = ResourceType.METAL;

    }



    public static synchronized Platinium getInstance() {
        if(instance == null) {
            instance = new Platinium();
        }

        return instance;
    }



    public String getName() {
        return this.name;
    }

    public ResourceType getResourceType() {
        return this.resourceType;
    }


}
