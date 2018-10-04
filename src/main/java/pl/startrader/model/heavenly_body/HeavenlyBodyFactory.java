package pl.startrader.model.heavenly_body;

public class HeavenlyBodyFactory {

    public static HeavenlyBody getHeavenlyBody(String type, String name, Integer size,
                                               Integer locationX, Integer locationY, Integer locationZ) {

        if("Planet".equalsIgnoreCase(type)) {
            return new Planet(name, size, locationX, locationY, locationZ);
        } else if ("Asteroid".equalsIgnoreCase(type)) {
            return new Asteroid(name, size, locationX, locationY, locationZ);
        } else {
            return null;
        }
    }
}
