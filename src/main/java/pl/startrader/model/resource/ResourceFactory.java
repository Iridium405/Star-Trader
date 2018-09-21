package pl.startrader.model.resource;

public class ResourceFactory {

    public static Resource getResource(String type, String name, int quantity) {

        if("Animal".equalsIgnoreCase(type)) {
            return new Animal(type, name, quantity);
        } else if ("Component".equalsIgnoreCase(type)) {
            return new Component(type, name, quantity);
        } else if ("Food".equalsIgnoreCase(type)) {
            return new Food(type, name, quantity);
        } else if ("Medicine".equalsIgnoreCase(type)) {
            return new Medicine(type, name, quantity);
        } else if ("Metal".equalsIgnoreCase(type)) {
            return new Metal(type, name, quantity);
        } else if ("Mineral".equalsIgnoreCase(type)) {
            return new Mineral(type, name, quantity);
        } else if ("Polymer".equalsIgnoreCase(type)) {
            return new Polymer(type, name, quantity);
        } else {
            return null;
        }
    }

}
