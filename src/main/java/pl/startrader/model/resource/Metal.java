package pl.startrader.model.resource;

public class Metal extends Resource {

    private String type;
    private int quantity;

    public Metal(int quantity) {
        this.type = "Metal";
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
