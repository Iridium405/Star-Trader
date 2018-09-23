package pl.startrader.model.resource;

public class Animal extends Resource {

    private String type;
    private int quantity;

    public Animal(int quantity) {
        this.type = "Animal";
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
