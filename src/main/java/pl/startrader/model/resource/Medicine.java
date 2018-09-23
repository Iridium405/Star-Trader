package pl.startrader.model.resource;

public class Medicine extends Resource {

    private String type;
    private int quantity;

    public Medicine(int quantity) {
        this.type = "Medicine";
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
