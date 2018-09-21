package pl.startrader.model.resource;

public class Polymer extends Resource {

    private String type;
    private String name;
    private int quantity;

    public Polymer(String type, String name, int quantity) {
        this.type = type;
        this.name = name;
        this.quantity = quantity;
    }

    @Override
    public String getType() {
        return this.type;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getQuantity() {
        return this.quantity;
    }
}
