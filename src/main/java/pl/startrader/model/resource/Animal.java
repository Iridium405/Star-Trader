package pl.startrader.model.resource;

public class Animal extends Resource {

    private String type;
    private String name;
    private int quantity;

    public Animal(String type, String name, int quantity) {
        this.type = type;
        this.name = name;
        this.quantity = quantity;
    }

    public String getType() {
        return this.type;
    }

    public String getName() {
        return this.name;
    }

    public int getQuantity() {
        return this.quantity;
    }
}
