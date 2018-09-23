package pl.startrader.model.resource;

public class Component extends Resource {

    private String type;
    private String name;
    private int quantity;

    public Component(String name, int quantity) {
        this.type = "Component";
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
