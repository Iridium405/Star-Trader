package pl.startrader.model.heavenly_body;

import pl.startrader.model.resource.Resource;

import java.util.List;

public class Asteroid extends HeavenlyBody{

    private String type;
    private String name;
    private Integer size;
    private Double locationX;
    private Double locationY;
    private Double locationZ;
    private List<Resource> mainAsteroidResource;


    public Asteroid(String name, Integer size, Double locationX, Double locationY, Double locationZ) {
        this.type = "Asteroid";
        this.name = name;
        this.size = size;
        this.locationX = locationX;
        this.locationY = locationY;
        this.locationZ = locationZ;
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

    @Override
    public List<Resource> getMainResources() {
        return mainAsteroidResource;
    }
}
