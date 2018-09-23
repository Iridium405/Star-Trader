package pl.startrader.model.heavenly_body;

public class Asteroid extends HeavenlyBody{

    private String type;
    private String name;
    private int size;

    public Asteroid(String name, int size) {
        this.type = "Asteroid";
        this.name = name;
        this.size = size;
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
    public int getSize() {
        return this.size;
    }
}
