package pl.startrader.model.character;

import pl.startrader.model.starship.CrewClass;

public class Crew extends Character {


    private CrewClass crewClass;
    private Integer lightWeaponDamage;
    private Integer mediumWeaponDamage;
    private Integer heavyWeaponDamage;
    private Integer hullDurability;
    private Integer experience;
    private Integer level;


    public Crew(String name, Integer criminalConnections, Integer politicalConnections, Integer economicConnections) {
        super(name, Role.CREW, criminalConnections, politicalConnections, economicConnections);
        this.crewClass = null;
        this.lightWeaponDamage = 0;
        this.mediumWeaponDamage = 0;
        this.heavyWeaponDamage = 0;
        this.hullDurability = 0;
        this.experience = 0;
        this.level = 1;
    }
}
