package pl.startrader.model.resource;

public abstract class Resource {

    public abstract String getType();
    public abstract int getQuantity();

    @Override
    public String toString() {
        return this.getType() + ". " + this.getQuantity() + " pcs created.";
    }

}