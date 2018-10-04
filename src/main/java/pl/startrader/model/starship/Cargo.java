package pl.startrader.model.starship;

import pl.startrader.model.heavenly_body.HeavenlyBody;
import pl.startrader.model.resource.Resource;

public abstract class Cargo {

    private HeavenlyBody takenFrom;
    private Resource resource;
    private Integer quantity;

    public Cargo(HeavenlyBody takenFrom, Resource resource, Integer quantity) {
        this.takenFrom = takenFrom;
        this.resource = resource;
        this.quantity = quantity;
    }
}
