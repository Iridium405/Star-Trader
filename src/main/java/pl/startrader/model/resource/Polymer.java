package pl.startrader.model.resource;

public class Polymer extends Resource {

    private String type;
    private int quantity;

    public Polymer(int quantity) {
        this.type = "Polymer";
        this.quantity = quantity;
    }

    @Override
    public String getType() {
        return this.type;
    }

    @Override
    public int getQuantity() {
        return this.quantity;
    }
}
