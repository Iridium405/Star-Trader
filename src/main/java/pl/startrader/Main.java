package pl.startrader;


import pl.startrader.model.character.CharacterGenerator;
import pl.startrader.model.character.Crew;
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


        Crew crewMember_1 = CharacterGenerator.generateCrew();
        crewMember_1.setName("Janusz Mechanik");
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

    }

}
