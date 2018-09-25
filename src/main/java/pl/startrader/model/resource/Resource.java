package pl.startrader.model.resource;

public abstract class Resource {

//    public abstract String getType();
//    public abstract int getQuantity();
//
//    @Override
//    public String toString() {
//        return this.getType() + ". " + this.getQuantity() + " pcs created.";
//    }


    public abstract ResourceType getResourceType();

    public abstract Integer getQuantityGammaLeporis();
    public abstract void addQuantityGammaLeporis(Integer quantity);
    public abstract Double getPriceGammaLeporis();
    public abstract void setPriceGammaLeporis();

    public abstract Integer getQuantityEpsilonEridani();
    public abstract void addQuantityEpsilonEridani(Integer quantity);
    public abstract Double getPriceEpsilonEridani();
    public abstract void setPriceEpsilonEridani();

    public abstract Integer getQuantityTauCeti();
    public abstract void addQuantityTauCeti(Integer quantity);
    public abstract Double getPriceTauCeti();
    public abstract void setPriceTauCeti();

    public abstract Integer getQuantityBetaHydri();
    public abstract void addQuantityBetaHydri(Integer quantity);
    public abstract Double getPriceBetaHydri();
    public abstract void setPriceBetaHydri();

    public abstract Integer getQuantitySigmaDraconis();
    public abstract void addQuantitySigmaDraconis(Integer quantity);
    public abstract Double getPriceSigmaDraconis();
    public abstract void setPriceSigmaDraconis();

    public abstract Integer getQuantityMuHerculis();
    public abstract void addQuantityMuHerculis(Integer quantity);
    public abstract Double getPriceMuHerculis();
    public abstract void setPriceMuHerculis();

    public abstract Integer getQuantityLambdaArietis();
    public abstract void addQuantityLambdaArietis(Integer quantity);
    public abstract Double getPriceLambdaArietis();
    public abstract void setPriceLambdaArietis();

    public abstract Integer getQuantityThetaTauri();
    public abstract void addQuantityThetaTauri(Integer quantity);
    public abstract Double getPriceThetaTauri();
    public abstract void setPriceThetaTauri();

    public abstract Integer getQuantityAlphaVolantis();
    public abstract void addQuantityAlphaVolantis(Integer quantity);
    public abstract Double getPriceAlphaVolantis();
    public abstract void setPriceAlphaVolantis();

}