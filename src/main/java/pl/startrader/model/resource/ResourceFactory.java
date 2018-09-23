package pl.startrader.model.resource;

public class ResourceFactory {

    public static Resource getResource(String type, String name, int quantity) {

        if("Animal".equalsIgnoreCase(type)) {
            return new Animal(name, quantity);
        } else if ("Component".equalsIgnoreCase(type)) {
            return new Component(name, quantity);
        } else if ("Food".equalsIgnoreCase(type)) {
            return new Food(name, quantity);
        } else if ("Medicine".equalsIgnoreCase(type)) {
            return new Medicine(name, quantity);
        } else if ("Metal".equalsIgnoreCase(type)) {
            return new Metal(name, quantity);
        } else if ("Mineral".equalsIgnoreCase(type)) {
            return new Mineral(name, quantity);
        } else if ("Polymer".equalsIgnoreCase(type)) {
            return new Polymer(name, quantity);
        } else {
            return null;
        }
    }

}
