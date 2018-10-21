package pl.startrader.model.heavenly_body;

public class PlanetGenerator {

    public static Planet generatePlanet(String name, Integer size, Double locationX, Double locationY, Double locationZ){
        return new Planet(name, size, locationX, locationY, locationZ);
    }

    // generateCustomPlanet


}
