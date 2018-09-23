package pl.startrader.model.heavenly_body;

public class Planet extends HeavenlyBody {

    private String type;
    private String name;
    private int size;

    public Planet(String name, int size) {
        this.type = "Planet";
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
