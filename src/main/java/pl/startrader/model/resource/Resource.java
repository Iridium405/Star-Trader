package pl.startrader.model.resource;

public abstract class Resource {

    public abstract String getType();
    public abstract String getName();
    public abstract int getQuantity();

    @Override
    public String toString() {
        return this.getType() + ": " + getName() + ". Quantity: " + this.getQuantity() + " pcs created.";
    }

}