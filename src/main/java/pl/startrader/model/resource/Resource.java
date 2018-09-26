package pl.startrader.model.resource;


public abstract class Resource {


    private Integer globalQuantity;

    private Integer quantityGammaLeporis;
    private Double priceGammaLeporis;

    private Integer quantityEpsilonEridani;
    private Double priceEpsilonEridani;

    private Integer quantityTauCeti;
    private Double priceTauCeti;

    private Integer quantityBetaHydri;
    private Double priceBetaHydri;

    private Integer quantitySigmaDraconis;
    private Double priceSigmaDraconis;

    private Integer quantityMuHerculis;
    private Double priceMuHerculis;

    private Integer quantityLambdaArietis;
    private Double priceLambdaArietis;

    private Integer quantityThetaTauri;
    private Double priceThetaTauri;

    private Integer quantityAlphaVolantis;
    private Double priceAlphaVolantis;


    public Resource() {
        this.globalQuantity = 0;
        this.quantityGammaLeporis = 0;
        this.priceGammaLeporis = 0.0;
        this.quantityEpsilonEridani = 0;
        this.priceEpsilonEridani = 0.0;
        this.quantityTauCeti = 0;
        this.priceTauCeti = 0.0;
        this.quantityBetaHydri = 0;
        this.priceBetaHydri = 0.0;
        this.quantitySigmaDraconis = 0;
        this.priceSigmaDraconis = 0.0;
        this.quantityMuHerculis = 0;
        this.priceMuHerculis = 0.0;
        this.quantityLambdaArietis = 0;
        this.priceLambdaArietis = 0.0;
        this.quantityThetaTauri = 0;
        this.priceThetaTauri = 0.0;
        this.quantityAlphaVolantis = 0;
        this.priceAlphaVolantis = 0.0;
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


}