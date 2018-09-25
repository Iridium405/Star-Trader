package pl.startrader.model.resource.mineral;

import pl.startrader.model.resource.Resource;
import pl.startrader.model.resource.ResourceType;

public class Onyx extends Resource {

    private static Onyx instance;

    private String name;
    private ResourceType resourceType;
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



    public Onyx() {
        this.name = "Onyx";
        this.resourceType = ResourceType.MINERAL;
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

    public static synchronized Onyx getInstance() {
        if(instance == null) {
            instance = new Onyx();
        }

        return instance;
    }


    public String getName() {
        return this.name;
    }

    @Override
    public ResourceType getResourceType() {
        return this.resourceType;
    }

    @Override
    public Integer getGlobalQuantity() {
        return this.globalQuantity;
    }





    @Override
    public Integer getQuantity_GammaLeporis() {
        return this.quantityGammaLeporis;
    }

    @Override
    public void addQuantity_GammaLeporis(Integer quantity) {
        quantityGammaLeporis += quantity;
        globalQuantity += quantity;
    }

    @Override
    public Double getPrice_GammaLeporis() {
        return this.priceGammaLeporis;
    }

    @Override
    public void setPrice_GammaLeporis(Double price) {
        this.priceGammaLeporis = price;
    }





    @Override
    public Integer getQuantity_EpsilonEridani() {
        return this.quantityEpsilonEridani;
    }

    @Override
    public void addQuantity_EpsilonEridani(Integer quantity) {
        quantityEpsilonEridani += quantity;
        globalQuantity += quantity;
    }

    @Override
    public Double getPrice_EpsilonEridani() {
        return this.priceEpsilonEridani;
    }

    @Override
    public void setPrice_EpsilonEridani(Double price) {
        this.priceEpsilonEridani = price;
    }





    @Override
    public Integer getQuantity_TauCeti() {
        return this.quantityTauCeti;
    }

    @Override
    public void addQuantity_TauCeti(Integer quantity) {
        quantityTauCeti += quantity;
        globalQuantity += quantity;
    }

    @Override
    public Double getPrice_TauCeti() {
        return this.priceTauCeti;
    }

    @Override
    public void setPrice_TauCeti(Double price) {
        this.priceTauCeti = price;
    }





    @Override
    public Integer getQuantity_BetaHydri() {
        return this.quantityBetaHydri;
    }

    @Override
    public void addQuantity_BetaHydri(Integer quantity) {
        quantityBetaHydri += quantity;
        globalQuantity += quantity;
    }

    @Override
    public Double getPrice_BetaHydri() {
        return this.priceBetaHydri;
    }

    @Override
    public void setPrice_BetaHydri(Double price) {
        this.priceBetaHydri = price;
    }





    @Override
    public Integer getQuantity_SigmaDraconis() {
        return this.quantitySigmaDraconis;
    }

    @Override
    public void addQuantity_SigmaDraconis(Integer quantity) {
        quantitySigmaDraconis += quantity;
        globalQuantity += quantity;
    }

    @Override
    public Double getPrice_SigmaDraconis() {
        return this.priceSigmaDraconis;
    }

    @Override
    public void setPrice_SigmaDraconis(Double price) {
        this.priceSigmaDraconis += price;
    }





    @Override
    public Integer getQuantity_MuHerculis() {
        return this.quantityMuHerculis;
    }

    @Override
    public void addQuantity_MuHerculis(Integer quantity) {
        quantityMuHerculis += quantity;
        globalQuantity += quantity;
    }

    @Override
    public Double getPrice_MuHerculis() {
        return this.priceMuHerculis;
    }

    @Override
    public void setPrice_MuHerculis(Double price) {
        this.priceMuHerculis = price;
    }





    @Override
    public Integer getQuantity_LambdaArietis() {
        return this.quantityLambdaArietis;
    }

    @Override
    public void addQuantity_LambdaArietis(Integer quantity) {
        quantityLambdaArietis += quantity;
        globalQuantity += quantity;
    }

    @Override
    public Double getPrice_LambdaArietis() {
        return this.priceLambdaArietis;
    }

    @Override
    public void setPrice_LambdaArietis(Double price) {
        this.priceLambdaArietis = price;
    }





    @Override
    public Integer getQuantity_ThetaTauri() {
        return this.quantityThetaTauri;
    }

    @Override
    public void addQuantity_ThetaTauri(Integer quantity) {
        quantityThetaTauri += quantity;
        globalQuantity += quantity;
    }

    @Override
    public Double getPrice_ThetaTauri() {
        return this.priceThetaTauri;
    }

    @Override
    public void setPrice_ThetaTauri(Double price) {
        this.priceThetaTauri = price;
    }





    @Override
    public Integer getQuantity_AlphaVolantis() {
        return this.quantityAlphaVolantis;
    }

    @Override
    public void addQuantity_AlphaVolantis(Integer quantity) {
        quantityAlphaVolantis += quantity;
        globalQuantity += quantity;
    }

    @Override
    public Double getPrice_AlphaVolantis() {
        return this.priceAlphaVolantis;
    }

    @Override
    public void setPrice_AlphaVolantis(Double price) {
        this.priceAlphaVolantis = price;
    }

}
