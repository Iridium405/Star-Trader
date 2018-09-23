package pl.startrader.model.resource;

public class Mineral extends Resource {

    private String type;
    private int quantity;

    public Mineral(int quantity) {
        this.type = "Mineral";
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
