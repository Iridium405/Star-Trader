package pl.startrader;

import pl.startrader.model.heavenly_body.HeavenlyBody;
import pl.startrader.model.heavenly_body.HeavenlyBodyFactory;
import pl.startrader.model.resource.Resource;
import pl.startrader.model.resource.ResourceFactory;

public class Main {

    public static void main(String[] args) {

        Resource titanium = ResourceFactory.getResource("Metal", "Titanium", 15);
        System.out.println(titanium.toString());

        HeavenlyBody earth = HeavenlyBodyFactory.getHeavenlyBody("Planet", "Earth", 10);
        System.out.println(earth.toString());

        System.out.println(Dice.getDice().throwModifiedDice(6,-2, false));
        System.out.println(Dice.getDice().throwModifiedDice(8,-3, true));

        System.out.println(Dice.getDice().throwDice(-5));

        System.out.println(Dice.getDice().throwMultipleDices(3,6));
    }

}
