package pl.startrader.model.heavenly_body;

import pl.startrader.model.resource.Resource;

import java.util.List;

public abstract class HeavenlyBody {

    public abstract String getName();
    public abstract String getType();
    public abstract Integer getSize();
    public abstract Double getLocationX();
    public abstract Double getLocationY();
    public abstract Double getLocationZ();
    public abstract List<Resource> getMainResources();

    @Override
    public String toString() {
        return this.getType() + ": " + this.getName() + " (size: " + this.getSize() + ") created.";
    }
}