package pl.startrader;

import pl.startrader.model.heavenly_body.HeavenlyBody;
import pl.startrader.model.heavenly_body.HeavenlyBodyFactory;
import pl.startrader.model.resource.component.Prototype;
import pl.startrader.model.resource.metal.Iridium;
import pl.startrader.model.resource.metal.Platinum;
import pl.startrader.model.resource.mineral.Jade;
import pl.startrader.model.resource.polymer.Pmma;
import pl.startrader.model.starship.HullType;

public class Main {

    public static void main(String[] args) {

        HeavenlyBody earth = HeavenlyBodyFactory.getHeavenlyBody("Planet", "Earth", 10);
        System.out.println(earth.toString());

        System.out.println(Dice.getInstance().throwModifiedDice(6,-2, false));
        System.out.println(Dice.getInstance().throwModifiedDice(6,-3, true));

        System.out.println(Dice.getInstance().throwDice(-5));

        System.out.println(Dice.getInstance().throwMultipleDices(3,6));

        System.out.println("Minimum crew class for " +
                HullType.HARP.getName() + " hulls is: " +
                HullType.HARP.getMinimumCrewSquads() + "x " +
                HullType.HARP.getMinimumCrewSkill()
        );

        Player.getInstance().addDiceRoll(6);
        System.out.println(Player.getInstance().getDiceRolls());

        Player.getInstance().addMultipleDiceRolls(5, 6);
        System.out.println(Player.getInstance().getDiceRolls());

        Iridium.getInstance().addQuantity_ThetaTauri(10);
        Iridium.getInstance().addQuantity_BetaHydri(5);
        System.out.println("Global " + Iridium.getInstance().getParam().getName() + " storage (15): " + Iridium.getInstance().getGlobalQuantity());

        Platinum.getInstance().addQuantity_AlphaVolantis(20);
        Platinum.getInstance().addQuantity_BetaHydri(10);
        System.out.println("Global " + Platinum.getInstance().getParam().getName() + " storage (30): " + Platinum.getInstance().getGlobalQuantity());

        System.out.println(Jade.getInstance().getParam().getType());
        System.out.println(Pmma.getInstance().getParam().getType());

        Prototype.getInstance().addQuantity_AlphaVolantis(5);
        Prototype.getInstance().addQuantity_BetaHydri(7);
        System.out.println(Prototype.getInstance().getParam().getName() + " (Global): " +Prototype.getInstance().getGlobalQuantity());




    }

}
