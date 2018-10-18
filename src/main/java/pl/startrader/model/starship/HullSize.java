package pl.startrader.model.starship;

public enum HullSize {

    XXL (15.0),
    XL  (10.0),
    L   (6.0),
    M   (4.0),
    S   (2.0),
    XS  (1.0);

    private Double basicTravelCostFactor;

    HullSize(Double basicTravelCostFactor) {
        this.basicTravelCostFactor = basicTravelCostFactor;
    }

    public Double getBasicTravelCostFactor() {
        return basicTravelCostFactor;
    }
}
