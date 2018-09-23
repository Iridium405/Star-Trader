package pl.startrader.model.heavenly_body;

public class HeavenlyBodyFactory {

    public static HeavenlyBody getHeavenlyBody(String type, String name, int size) {

        if("Planet".equalsIgnoreCase(type)) {
            return new Planet(type, name, size);
        } else if ("Asteroid".equalsIgnoreCase(type)) {
            return new Asteroid(type, name, size);
        } else {
            return null;
        }
    }
}
