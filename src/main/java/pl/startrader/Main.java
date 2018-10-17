package pl.startrader;


import pl.startrader.model.character.CharacterGenerator;
import pl.startrader.model.character.Crew;
import pl.startrader.model.heavenly_body.Asteroid;
import pl.startrader.model.heavenly_body.HeavenlyBody;
import pl.startrader.model.heavenly_body.HeavenlyBodyFactory;
import pl.startrader.model.resource.component.Prototype;
import pl.startrader.model.resource.metal.Iridium;
import pl.startrader.model.resource.metal.Platinum;
import pl.startrader.model.resource.mineral.Jade;
import pl.startrader.model.resource.polymer.Pmma;
import pl.startrader.model.starship.HullType;
import pl.startrader.model.starship.Starship;

public class Main {

    public static void main(String[] args) {

        HeavenlyBody earth = HeavenlyBodyFactory.getHeavenlyBody("Planet", "Earth", 10, 5.0, 6.0, 0.0);
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

        Iridium.getInstance().addQuantity_ThetaTauri(10, true);
        Iridium.getInstance().addQuantity_BetaHydri(5, true);
        System.out.println("Global " + Iridium.getInstance().getParam().getName() + " storage (15): " + Iridium.getInstance().getGlobalQuantity());

        Platinum.getInstance().addQuantity_AlphaVolantis(20, true);
        Platinum.getInstance().addQuantity_BetaHydri(10, true);
        System.out.println("Global " + Platinum.getInstance().getParam().getName() + " storage (30): " + Platinum.getInstance().getGlobalQuantity());

        System.out.println(Jade.getInstance().getParam().getType());
        System.out.println(Pmma.getInstance().getParam().getType());

        Prototype.getInstance().addQuantity_AlphaVolantis(5, true);
        Prototype.getInstance().addQuantity_BetaHydri(7, true);
        System.out.println(Prototype.getInstance().getParam().getName() + " (Global): " +Prototype.getInstance().getGlobalQuantity());


        Crew crewMember_1 = CharacterGenerator.generateCrew("Janusz Mechanik");
        System.out.println();
        System.out.println(crewMember_1.getName() + " LVL: " + crewMember_1.getLevel());
        System.out.println(crewMember_1.getName() + " SKILL POINTS: " + crewMember_1.getSkillPoints());
        System.out.println(crewMember_1.getName() + " EXP: " + crewMember_1.getExperience());
        crewMember_1.addExperience(5);
        System.out.println(crewMember_1.getName() + " EXP: " + crewMember_1.getExperience());
        crewMember_1.addExperience(17);
        System.out.println(crewMember_1.getName() + " LVL: " + crewMember_1.getLevel());
        System.out.println(crewMember_1.getName() + " EXP: " + crewMember_1.getExperience());
        System.out.println(crewMember_1.getName() + " SKILL POINTS: " + crewMember_1.getSkillPoints());
        crewMember_1.addExperience(18);
        System.out.println(crewMember_1.getName() + " LVL: " + crewMember_1.getLevel());
        System.out.println(crewMember_1.getName() + " SKILL POINTS: " + crewMember_1.getSkillPoints());
        System.out.println(crewMember_1.getName() + " EXP: " + crewMember_1.getExperience());
        System.out.println();

        System.out.println(crewMember_1.getName() + " MECHANICS: " + crewMember_1.getMechanics());
        System.out.println(crewMember_1.getName() + " HIT POINTS: " + crewMember_1.getHitPoints());

        crewMember_1.addSkillPoint_Mechanics();
        crewMember_1.addSkillPoint_Mechanics();
        crewMember_1.addSkillPoint_HitPoints();

        System.out.println(crewMember_1.getName() + " MECHANICS: " + crewMember_1.getMechanics());
        System.out.println(crewMember_1.getName() + " HIT POINTS: " + crewMember_1.getHitPoints());
        System.out.println(crewMember_1.getName() + " SKILL POINTS: " + crewMember_1.getSkillPoints());

        System.out.println();
        crewMember_1.removeHitPoint();
        System.out.println(crewMember_1.getName() + " HIT POINTS: " + crewMember_1.getHitPoints());
        crewMember_1.removeHitPoint();

        System.out.println();
        Crew crewMember_2 = CharacterGenerator.generateCrew("Zdzichu Pilot");
        crewMember_2.addExperience(20);
        System.out.println(crewMember_2.getName() + " LVL: " + crewMember_2.getLevel());
        crewMember_2.addExperience(20);
        crewMember_2.addExperience(20);
        crewMember_2.addExperience(20);
        crewMember_2.addExperience(1);
        System.out.println(crewMember_2.getName() + " EXP: " + crewMember_2.getExperience());
        System.out.println(crewMember_2.getName() + " LVL: " + crewMember_2.getLevel());
        System.out.println(crewMember_2.getName() + " CREW CLASS: " + crewMember_2.getCrewClass());
        crewMember_2.upgradeCrewClass();
        System.out.println(crewMember_2.getName() + " CREW CLASS: " + crewMember_2.getCrewClass());
        crewMember_2.addExperience(20);
        System.out.println(crewMember_2.getName() + " SKILL POINTS: " + crewMember_2.getSkillPoints());

        System.out.println();
        Asteroid asteroid01 = new Asteroid("AST-X001",1,3.0,-2.0,-5.0);
        Starship ship1 = new Starship("Harmony-01", HullType.HARMONY);

        ship1.setCurrentlyStationed(earth);
        System.out.println(ship1.getName() + " currently stations on " + ship1.getCurrentlyStationed().getName());
        ship1.travelDistance(asteroid01);
        System.out.println(ship1.getName() + " travel distance to " + asteroid01.getName() + " equals " + ship1.travelDistance(asteroid01));

        System.out.println();
        ship1.setCurrentlyStationed(asteroid01);
        System.out.println(ship1.getName() + " currently stations on " + ship1.getCurrentlyStationed().getName());
        ship1.travelDistance(earth);
        System.out.println(ship1.getName() + " travel distance to " + earth.getName() + " equals " + ship1.travelDistance(earth));



    }

}
