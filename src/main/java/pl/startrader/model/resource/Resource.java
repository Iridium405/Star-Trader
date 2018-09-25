package pl.startrader.model.resource;


public abstract class Resource {


    public abstract ResourceType getResourceType();
    public abstract Integer getGlobalQuantity();

    public abstract Integer getQuantity_GammaLeporis();
    public abstract void addQuantity_GammaLeporis(Integer quantity);
    public abstract Double getPrice_GammaLeporis();
    public abstract void setPrice_GammaLeporis(Double price);

    public abstract Integer getQuantity_EpsilonEridani();
    public abstract void addQuantity_EpsilonEridani(Integer quantity);
    public abstract Double getPrice_EpsilonEridani();
    public abstract void setPrice_EpsilonEridani(Double price);

    public abstract Integer getQuantity_TauCeti();
    public abstract void addQuantity_TauCeti(Integer quantity);
    public abstract Double getPrice_TauCeti();
    public abstract void setPrice_TauCeti(Double price);

    public abstract Integer getQuantity_BetaHydri();
    public abstract void addQuantity_BetaHydri(Integer quantity);
    public abstract Double getPrice_BetaHydri();
    public abstract void setPrice_BetaHydri(Double price);

    public abstract Integer getQuantity_SigmaDraconis();
    public abstract void addQuantity_SigmaDraconis(Integer quantity);
    public abstract Double getPrice_SigmaDraconis();
    public abstract void setPrice_SigmaDraconis(Double price);

    public abstract Integer getQuantity_MuHerculis();
    public abstract void addQuantity_MuHerculis(Integer quantity);
    public abstract Double getPrice_MuHerculis();
    public abstract void setPrice_MuHerculis(Double price);

    public abstract Integer getQuantity_LambdaArietis();
    public abstract void addQuantity_LambdaArietis(Integer quantity);
    public abstract Double getPrice_LambdaArietis();
    public abstract void setPrice_LambdaArietis(Double price);

    public abstract Integer getQuantity_ThetaTauri();
    public abstract void addQuantity_ThetaTauri(Integer quantity);
    public abstract Double getPrice_ThetaTauri();
    public abstract void setPrice_ThetaTauri(Double price);

    public abstract Integer getQuantity_AlphaVolantis();
    public abstract void addQuantity_AlphaVolantis(Integer quantity);
    public abstract Double getPrice_AlphaVolantis();
    public abstract void setPrice_AlphaVolantis(Double price);


}