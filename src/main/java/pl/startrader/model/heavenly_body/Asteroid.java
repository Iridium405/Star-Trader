package pl.startrader.model.heavenly_body;

public class Asteroid extends HeavenlyBody{

    private String type;
    private String name;
    private Integer size;
    private Integer locationX;
    private Integer locationY;
    private Integer locationZ;



    public Asteroid(String name, Integer size, Integer locationX, Integer locationY, Integer locationZ) {
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
    public Integer getLocationX() {
        return locationX;
    }

    @Override
    public Integer getLocationY() {
        return locationY;
    }

    @Override
    public Integer getLocationZ() {
        return locationZ;
    }
}
