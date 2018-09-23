package pl.startrader.model.resource;

public class Food extends Resource {

    private String type;
    private int quantity;

    public Food(int quantity) {
        this.type = "Food";
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
