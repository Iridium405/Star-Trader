package pl.startrader.model.character;

import pl.startrader.model.starship.CrewClass;

public class Crew extends Character {


    private CrewClass crewClass;
    private Boolean alive;
    private Integer lightWeaponDamage;
    private Integer mediumWeaponDamage;
    private Integer heavyWeaponDamage;
    private Integer hullDurability;
    private Integer mechanics;
    private Integer hitPoints;
    private Integer attack;
    private Integer defence;
    private Integer experience;
    private Integer level;
    private Integer skillPoints;



    public Crew(String name, Integer criminalConnections, Integer politicalConnections, Integer economicConnections) {
        super(name, Role.CREW, criminalConnections, politicalConnections, economicConnections);
        this.crewClass = null;
        this.alive = true;
        this.lightWeaponDamage = 0;
        this.mediumWeaponDamage = 0;
        this.heavyWeaponDamage = 0;
        this.hullDurability = 0;
        this.mechanics = 0;
        this.hitPoints = 1;
        this.attack = 1;
        this.defence = 3;
        this.experience = 0;
        this.level = 1;
        this.skillPoints = 1;
    }



    public CrewClass getCrewClass() {
        return crewClass;
    }

    public Boolean isAlive() {
        return alive;
    }

    public Integer getLightWeaponDamage() {
        return lightWeaponDamage;
    }

    public void addSkillPoint_LightWeaponDamage() {
        if (this.skillPoints >= 1) {
            this.lightWeaponDamage += 1;
            this.skillPoints -= 1;
            System.out.println("Skill point distributed.");
        }
    }



    public Integer getMediumWeaponDamage() {
        return mediumWeaponDamage;
    }

    public void addSkillPoint_MediumWeaponDamage() {
        if (this.skillPoints >= 1) {
            this.mediumWeaponDamage += 1;
            this.skillPoints -= 1;
            System.out.println("Skill point distributed.");
        }
    }



    public Integer getHeavyWeaponDamage() {
        return heavyWeaponDamage;
    }

    public void addSkillPoint_HeavyWeaponDamage() {
        if (this.skillPoints >= 1) {
            this.heavyWeaponDamage += 1;
            this.skillPoints -= 1;
            System.out.println("Skill point distributed.");
        }
    }



    public Integer getHullDurability() {
        return hullDurability;
    }

    public void addSkillPoint_HullDurabiity() {
        if (this.skillPoints >= 1) {
            this.hullDurability += 1;
            this.skillPoints -= 1;
            System.out.println("Skill point distributed.");
        }
    }



    public Integer getMechanics() {
        return mechanics;
    }

    public void addSkillPoint_Mechanics() {
        if (this.skillPoints >= 1) {
            this.mechanics += 1;
            this.skillPoints -= 1;
            System.out.println("Skill point distributed.");
        }
    }



    public Integer getHitPoints() {
        return hitPoints;
    }

    public void addSkillPoint_HitPoints() {
        if (this.skillPoints >= 1) {
            this.hitPoints += 1;
            this.skillPoints -= 1;
            System.out.println("Skill point distributed.");
        }
    }

    public void removeHitPoint() {
        if (this.hitPoints >= 1) {
            this.hitPoints -= 1;
            System.out.println(this.getName() + " lost 1hp.");
            if (this.hitPoints == 0) {
                this.alive = false;
                System.out.println(this.getName() + " has died.");
            }
        }
    }



    public Integer getAttack() {
        return attack;
    }

    public void addSkillPoint_Attack() {
        if (this.skillPoints >= 1) {
            this.attack += 1;
            this.skillPoints -= 1;
            System.out.println("Skill point distributed.");
        }
    }



    public Integer getDefence() {
        return defence;
    }

    public void addSkillPoint_Defence() {
        if (this.skillPoints >= 1) {
            this.defence += 1;
            this.skillPoints -= 1;
            System.out.println("Skill point distributed.");
        }
    }



    public Integer getExperience() {
        return experience;
    }

    public void addExperience(Integer experience) {
        Integer tempLevel = this.level;

        if (experience > 0) {
            this.experience += experience;
            System.out.println(experience + " exp. added.");
        }

        if (this.level <= 30) {
            if (this.experience >= 20) {
                this.level += 1;
                System.out.println("Level up! " + tempLevel + " >>> " + this.level);
                this.skillPoints += 1;
                System.out.println(("New skill point aquired."));
                this.experience -= 20;
            }
        } else {
            System.out.println("Maximum level reached.");
        }
    }

    public Integer getLevel() {
        return level;
    }

    public Integer getSkillPoints() {
        return skillPoints;
    }

}
