package pl.startrader.model.resource;

public class Metal extends Resource {

    private String type;
    private String name;
    private int quantity;

    public Metal(String name, int quantity) {
        this.type = "Metal";
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
