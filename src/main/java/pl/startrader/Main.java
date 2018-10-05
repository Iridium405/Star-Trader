package pl.startrader;

import pl.startrader.model.character.Character;
import pl.startrader.model.character.CharacterFactory;
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

        HeavenlyBody earth = HeavenlyBodyFactory.getHeavenlyBody("Planet", "Earth", 10, 5, 6, 0);
        System.out.println(earth.toString());

        System.out.println(Dice.getInstance().throwModifiedDice(6,-2, false));
        System.out.println(Dice.getInstance().throwModifiedDice(6,-3, true));

        System.out.println(Dice.getInstance().throwDice(-5));

        System.out.println(Dice.getInstance().throwMultipleDices(3,6));

        System.out.println("Minimum crew class for " +
                HullType.HARP.getName() + " hulls is: " +
                HullType.HARP.getMinCrewMembers() + "x " +
                HullType.HARP.getMinimumCrewClass()
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

        Character crew = CharacterFactory.getCharacter("Crew", 5, 5,5);
        Character administrator = CharacterFactory.generateCharacter("Administrator", "Mediocre");
        Character spy = CharacterFactory.generateCharacter("Spy", "Superior");
        Character randomCrew = CharacterFactory.generateCharacter("Crew", "Random");
        Character randomCrew2 = CharacterFactory.generateCharacter("Crew", "Random");

        System.out.println("\nCORRECT CHARACTERS:");
        System.out.println(crew);
        System.out.println(administrator);
        System.out.println(spy);
        System.out.println(randomCrew);
        System.out.println(randomCrew2);

        System.out.println("\nWRONG CHARACTERS:");
        Character wrongCharacter1 = CharacterFactory.getCharacter("Spy", 12, -5, 9);
        Character wrongCharacter2 = CharacterFactory.generateCharacter("Spy", "Wrong");
        Character wrongCharacter3 = CharacterFactory.generateCharacter("Wrong", "Mediocre");

    }

}
