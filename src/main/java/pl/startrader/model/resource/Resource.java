package pl.startrader.model.resource;


public abstract class Resource {


    private Integer globalQuantity;

    private Integer quantityGammaLeporis;
    private Double priceGammaLeporis;
    private Boolean demandedGammaLeporis;

    private Integer quantityEpsilonEridani;
    private Double priceEpsilonEridani;
    private Boolean demandedEpsilonEridani;

    private Integer quantityTauCeti;
    private Double priceTauCeti;
    private Boolean demandedTauCeti;

    private Integer quantityBetaHydri;
    private Double priceBetaHydri;
    private Boolean demandedBetaHydri;

    private Integer quantitySigmaDraconis;
    private Double priceSigmaDraconis;
    private Boolean demandedSigmaDraconis;

    private Integer quantityMuHerculis;
    private Double priceMuHerculis;
    private Boolean demandedMuHerculis;

    private Integer quantityLambdaArietis;
    private Double priceLambdaArietis;
    private Boolean demandedLambdaArietis;

    private Integer quantityThetaTauri;
    private Double priceThetaTauri;
    private Boolean demandedThetaTauri;

    private Integer quantityAlphaVolantis;
    private Double priceAlphaVolantis;
    private Boolean demandedAlphaVolantis;


    public Resource() {
        this.globalQuantity = 0;

        this.quantityGammaLeporis = 0;
        this.priceGammaLeporis = 0.0;
        this.demandedGammaLeporis = false;

        this.quantityEpsilonEridani = 0;
        this.priceEpsilonEridani = 0.0;
        this.demandedEpsilonEridani = false;

        this.quantityTauCeti = 0;
        this.priceTauCeti = 0.0;
        this.demandedTauCeti = false;

        this.quantityBetaHydri = 0;
        this.priceBetaHydri = 0.0;
        this.demandedBetaHydri = false;

        this.quantitySigmaDraconis = 0;
        this.priceSigmaDraconis = 0.0;
        this.demandedSigmaDraconis = false;

        this.quantityMuHerculis = 0;
        this.priceMuHerculis = 0.0;
        this.demandedMuHerculis = false;

        this.quantityLambdaArietis = 0;
        this.priceLambdaArietis = 0.0;
        this.demandedLambdaArietis = false;

        this.quantityThetaTauri = 0;
        this.priceThetaTauri = 0.0;
        this.demandedThetaTauri = false;

        this.quantityAlphaVolantis = 0;
        this.priceAlphaVolantis = 0.0;
        this.demandedAlphaVolantis = false;
    }


    public abstract ResourceParam getParam();


    public Integer getGlobalQuantity() {
        return this.globalQuantity;
    }



    public Integer getQuantity_GammaLeporis() {
        return this.quantityGammaLeporis;
    }

    public void addQuantity_GammaLeporis(Integer quantity) {
        this.quantityGammaLeporis += quantity;
        this.globalQuantity += quantity;
    }

    public Double getPrice_GammaLeporis() {
        return this.priceGammaLeporis;
    }

    public void setPrice_GammaLeporis(Double price) {
        this.priceGammaLeporis = price;
    }

    public Boolean isDemanded_GammaLeporis() {
        return demandedGammaLeporis;
    }

    public void setDemanded_GammaLeporis(Boolean demandedOnGammaLeporis) {
        this.demandedGammaLeporis = demandedOnGammaLeporis;
    }





    public Integer getQuantity_EpsilonEridani() {
        return this.quantityEpsilonEridani;
    }

    public void addQuantity_EpsilonEridani(Integer quantity) {
        this.quantityEpsilonEridani += quantity;
        this.globalQuantity += quantity;
    }

    public Double getPrice_EpsilonEridani() {
        return this.priceEpsilonEridani;
    }

    public void setPrice_EpsilonEridani(Double price) {
        this.priceEpsilonEridani = price;
    }

    public Boolean isDemanded_EpsilonEridani() {
        return demandedEpsilonEridani;
    }

    public void setDemanded_EpsilonEridani(Boolean demandedOnEpsilonEridani) {
        this.demandedEpsilonEridani = demandedOnEpsilonEridani;
    }





    public Integer getQuantity_TauCeti() {
        return this.quantityTauCeti;
    }

    public void addQuantity_TauCeti(Integer quantity) {
        this.quantityTauCeti += quantity;
        this.globalQuantity += quantity;
    }

    public Double getPrice_TauCeti() {
        return this.priceTauCeti;
    }

    public void setPrice_TauCeti(Double price) {
        this.priceTauCeti = price;
    }

    public Boolean isDemanded_TauCeti() {
        return demandedTauCeti;
    }

    public void setDemanded_TauCeti(Boolean demandedOnTauCeti) {
        this.demandedTauCeti = demandedOnTauCeti;
    }





    public Integer getQuantity_BetaHydri() {
        return this.quantityBetaHydri;
    }

    public void addQuantity_BetaHydri(Integer quantity) {
        this.quantityBetaHydri += quantity;
        this.globalQuantity += quantity;
    }

    public Double getPrice_BetaHydri() {
        return this.priceBetaHydri;
    }

    public void setPrice_BetaHydri(Double price) {
        this.priceBetaHydri = price;
    }

    public Boolean isDemanded_BetaHydri() {
        return demandedBetaHydri;
    }

    public void setDemanded_BetaHydri(Boolean demandedOnBetaHydri) {
        this.demandedBetaHydri = demandedOnBetaHydri;
    }





    public Integer getQuantity_SigmaDraconis() {
        return this.quantitySigmaDraconis;
    }

    public void addQuantity_SigmaDraconis(Integer quantity) {
        this.quantitySigmaDraconis += quantity;
        this.globalQuantity += quantity;
    }

    public Double getPrice_SigmaDraconis() {
        return this.priceSigmaDraconis;
    }

    public void setPrice_SigmaDraconis(Double price) {
        this.priceSigmaDraconis += price;
    }

    public Boolean isDemanded_SigmaDraconis() {
        return demandedSigmaDraconis;
    }

    public void setDemanded_SigmaDraconis(Boolean demandedOnSigmaDraconis) {
        this.demandedSigmaDraconis = demandedOnSigmaDraconis;
    }





    public Integer getQuantity_MuHerculis() {
        return this.quantityMuHerculis;
    }

    public void addQuantity_MuHerculis(Integer quantity) {
        this.quantityMuHerculis += quantity;
        this.globalQuantity += quantity;
    }

    public Double getPrice_MuHerculis() {
        return this.priceMuHerculis;
    }

    public void setPrice_MuHerculis(Double price) {
        this.priceMuHerculis = price;
    }

    public Boolean isDemanded_MuHerculis() {
        return demandedMuHerculis;
    }

    public void setDemanded_MuHerculis(Boolean demandedOnMuHerculis) {
        this.demandedMuHerculis = demandedOnMuHerculis;
    }





    public Integer getQuantity_LambdaArietis() {
        return this.quantityLambdaArietis;
    }

    public void addQuantity_LambdaArietis(Integer quantity) {
        this.quantityLambdaArietis += quantity;
        this.globalQuantity += quantity;
    }

    public Double getPrice_LambdaArietis() {
        return this.priceLambdaArietis;
    }

    public void setPrice_LambdaArietis(Double price) {
        this.priceLambdaArietis = price;
    }

    public Boolean isDemanded_LambdaArietis() {
        return demandedLambdaArietis;
    }

    public void setDemanded_LambdaArietis(Boolean demandedOnLambdaArietis) {
        this.demandedLambdaArietis = demandedOnLambdaArietis;
    }





    public Integer getQuantity_ThetaTauri() {
        return this.quantityThetaTauri;
    }

    public void addQuantity_ThetaTauri(Integer quantity) {
        this.quantityThetaTauri += quantity;
        this.globalQuantity += quantity;
    }

    public Double getPrice_ThetaTauri() {
        return this.priceThetaTauri;
    }

    public void setPrice_ThetaTauri(Double price) {
        this.priceThetaTauri = price;
    }

    public Boolean isDemanded_ThetaTauri() {
        return demandedThetaTauri;
    }

    public void setDemanded_ThetaTauri(Boolean demandedOnThetaTauri) {
        this.demandedThetaTauri = demandedOnThetaTauri;
    }





    public Integer getQuantity_AlphaVolantis() {
        return this.quantityAlphaVolantis;
    }

    public void addQuantity_AlphaVolantis(Integer quantity) {
        this.quantityAlphaVolantis += quantity;
        this.globalQuantity += quantity;
    }

    public Double getPrice_AlphaVolantis() {
        return this.priceAlphaVolantis;
    }

    public void setPrice_AlphaVolantis(Double price) {
        this.priceAlphaVolantis = price;
    }

    public Boolean isDemanded_AlphaVolantis() {
        return demandedAlphaVolantis;
    }

    public void setDemanded_AlphaVolantis(Boolean demandedOnAlphaVolantis) {
        this.demandedAlphaVolantis = demandedOnAlphaVolantis;
    }
}