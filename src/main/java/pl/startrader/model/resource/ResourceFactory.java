package pl.startrader.model.resource;

public class ResourceFactory {

    public static Resource getResource(String type, int quantity) {

        if("Animal".equalsIgnoreCase(type)) {
            return new Animal(quantity);
        } else if ("Component".equalsIgnoreCase(type)) {
            return new Component(quantity);
        } else if ("Food".equalsIgnoreCase(type)) {
            return new Food(quantity);
        } else if ("Medicine".equalsIgnoreCase(type)) {
            return new Medicine(quantity);
        } else if ("Metal".equalsIgnoreCase(type)) {
            return new Metal(quantity);
        } else if ("Mineral".equalsIgnoreCase(type)) {
            return new Mineral(quantity);
        } else if ("Polymer".equalsIgnoreCase(type)) {
            return new Polymer(quantity);
        } else {
            return null;
        }
    }

}
