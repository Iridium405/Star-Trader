package pl.startrader.model.heavenly_body;

import pl.startrader.model.resource.Resource;

import java.util.ArrayList;
import java.util.List;

public class Planet extends HeavenlyBody {

    private String type;
    private String name;
    private Integer size;
    private Double locationX;
    private Double locationY;
    private Double locationZ;

    private Character administrator;

    private Integer portClass;
    private Integer security;
    private Integer militaryPower;

    private List<Resource> mainPlanetResources;

    private List<Resource> productionPermitted;
    private List<Resource> productionForbidden;

    private List<Resource> tradePermitted;
    private List<Resource> tradeForbidden;



    public Planet(String name, Integer size, Double locationX, Double locationY, Double locationZ) {
        this.type = "Planet";
        this.name = name;
        this.size = size;
        this.locationX = locationX;
        this.locationY = locationY;
        this.locationZ = locationZ;

        this.administrator = null;

        this.portClass = 0;
        this.security = 0;
        this.militaryPower = 0;

        this.mainPlanetResources = new ArrayList<>();
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
    public Integer getSize() {
        return this.size;
    }

    @Override
    public Double getLocationX() {
        return locationX;
    }

    @Override
    public Double getLocationY() {
        return locationY;
    }

    @Override
    public Double getLocationZ() {
        return locationZ;
    }



    public Character getAdministrator() {
        return administrator;
    }

    public Integer getPortClass() {
        return portClass;
    }

    public Integer getSecurity() {
        return security;
    }

    public Integer getMilitaryPower() {
        return militaryPower;
    }


    @Override
    public List<Resource> getMainResources() {
        return mainPlanetResources;
    }



    public List<Resource> getProductionPermitted() {
        return productionPermitted;
    }


    public List<Resource> getProductionForbidden() {
        return productionForbidden;
    }


    public List<Resource> getTradePermitted() {
        return tradePermitted;
    }


    public List<Resource> getTradeForbidden() {
        return tradeForbidden;
    }
}
