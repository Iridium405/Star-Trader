package pl.startrader.model.resource;

public class Component extends Resource {

    private String type;
    private int quantity;

    public Component(int quantity) {
        this.type = "Component";
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
