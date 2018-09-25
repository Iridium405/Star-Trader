package pl.startrader.model.resource.metal;

import pl.startrader.model.resource.Resource;
import pl.startrader.model.resource.ResourceType;

public class Iridium extends Resource {

    private static Iridium instance;

    private String name = "Iridium";
    private ResourceType resourceType = ResourceType.METAL;
    private Integer globalQuantity = 0;

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

    private Iridium(){}

    public static synchronized Iridium getInstance() {
        if(instance == null) {
            instance = new Iridium();
        }

        return instance;
    }

    @Override
    public ResourceType getResourceType() {
        return this.resourceType;
    }

    @Override
    public Integer getQuantityGammaLeporis() {
        return this.quantityGammaLeporis;
    }

    @Override
    public void addQuantityGammaLeporis(Integer quantity) {

    }

    @Override
    public Double getPriceGammaLeporis() {
        return null;
    }

    @Override
    public void setPriceGammaLeporis() {

    }

    @Override
    public Integer getQuantityEpsilonEridani() {
        return null;
    }

    @Override
    public void addQuantityEpsilonEridani(Integer quantity) {

    }

    @Override
    public Double getPriceEpsilonEridani() {
        return null;
    }

    @Override
    public void setPriceEpsilonEridani() {

    }

    @Override
    public Integer getQuantityTauCeti() {
        return null;
    }

    @Override
    public void addQuantityTauCeti(Integer quantity) {

    }

    @Override
    public Double getPriceTauCeti() {
        return null;
    }

    @Override
    public void setPriceTauCeti() {

    }

    @Override
    public Integer getQuantityBetaHydri() {
        return null;
    }

    @Override
    public void addQuantityBetaHydri(Integer quantity) {

    }

    @Override
    public Double getPriceBetaHydri() {
        return null;
    }

    @Override
    public void setPriceBetaHydri() {

    }

    @Override
    public Integer getQuantitySigmaDraconis() {
        return null;
    }

    @Override
    public void addQuantitySigmaDraconis(Integer quantity) {

    }

    @Override
    public Double getPriceSigmaDraconis() {
        return null;
    }

    @Override
    public void setPriceSigmaDraconis() {

    }

    @Override
    public Integer getQuantityMuHerculis() {
        return null;
    }

    @Override
    public void addQuantityMuHerculis(Integer quantity) {

    }

    @Override
    public Double getPriceMuHerculis() {
        return null;
    }

    @Override
    public void setPriceMuHerculis() {

    }

    @Override
    public Integer getQuantityLambdaArietis() {
        return null;
    }

    @Override
    public void addQuantityLambdaArietis(Integer quantity) {

    }

    @Override
    public Double getPriceLambdaArietis() {
        return null;
    }

    @Override
    public void setPriceLambdaArietis() {

    }

    @Override
    public Integer getQuantityThetaTauri() {
        return null;
    }

    @Override
    public void addQuantityThetaTauri(Integer quantity) {

    }

    @Override
    public Double getPriceThetaTauri() {
        return null;
    }

    @Override
    public void setPriceThetaTauri() {

    }

    @Override
    public Integer getQuantityAlphaVolantis() {
        return null;
    }

    @Override
    public void addQuantityAlphaVolantis(Integer quantity) {

    }

    @Override
    public Double getPriceAlphaVolantis() {
        return null;
    }

    @Override
    public void setPriceAlphaVolantis() {

    }
}
