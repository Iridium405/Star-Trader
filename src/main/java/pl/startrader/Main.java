package pl.startrader;

import pl.startrader.model.heavenlyBody.HeavenlyBody;
import pl.startrader.model.heavenlyBody.HeavenlyBodyFactory;
import pl.startrader.model.resource.Resource;
import pl.startrader.model.resource.ResourceFactory;

public class Main {

    public static void main(String[] args) {

        Resource titanium = ResourceFactory.getResource("Metal", "Titanium", 15);
        System.out.println(titanium.toString());

        HeavenlyBody earth = HeavenlyBodyFactory.getHeavenlyBody("Planet", "Earth", 10);
        System.out.println(earth.toString());

    }

}
