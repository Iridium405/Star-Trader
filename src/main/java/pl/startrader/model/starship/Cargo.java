package pl.startrader.model.starship;

import pl.startrader.model.resource.Resource;

public class Cargo {


    private Resource resource;
    private Integer quantity;

    public Cargo(Resource resource, Integer quantity) {
        this.resource = resource;
        this.quantity = quantity;
    }

    public Resource getResource() {
        return resource;
    }

    public Integer getQuantity() {
        return quantity;
    }
}
