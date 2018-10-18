package pl.startrader.model.character;

import pl.startrader.model.starship.CrewClass;

import static pl.startrader.model.starship.CrewClass.*;

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
    private Double salary;
    private Double travelBonus;



    public Crew(String name, Integer criminalConnections, Integer politicalConnections, Integer economicConnections) {
        super(name, Role.CREW, criminalConnections, politicalConnections, economicConnections);
        this.crewClass = E;
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
        this.salary = crewClass.getMinSalary();
        this.travelBonus = crewClass.getMinTravelBonus();
    }



    public CrewClass getCrewClass() {
        return crewClass;
    }

    public void upgradeCrewClass() {
        if (this.crewClass != U) {
            if (this.crewClass == E) {
                this.crewClass = D;
            } else if (this.crewClass == D) {
                this.crewClass = C;
            } else if (this.crewClass == C) {
                this.crewClass = B;
            } else if (this.crewClass == B) {
                this.crewClass = A;
            } else if (this.crewClass == A) {
                this.crewClass = U;
            }

            System.out.println("Crew class upgraded to " + this.crewClass);
        } else {
            System.out.println("Crew class cannot be upgraded more.");
        }

        if (this.travelBonus < this.crewClass.getMinTravelBonus()) {
            this.travelBonus = this.crewClass.getMinTravelBonus();
        }
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
            System.out.println("Skill point distributed. Light weapons damage increased.");
        }
    }



    public Integer getMediumWeaponDamage() {
        return mediumWeaponDamage;
    }

    public void addSkillPoint_MediumWeaponDamage() {
        if (this.skillPoints >= 1) {
            this.mediumWeaponDamage += 1;
            this.skillPoints -= 1;
            System.out.println("Skill point distributed. Medium weapons damage increased.");
        }
    }



    public Integer getHeavyWeaponDamage() {
        return heavyWeaponDamage;
    }

    public void addSkillPoint_HeavyWeaponDamage() {
        if (this.skillPoints >= 1) {
            this.heavyWeaponDamage += 1;
            this.skillPoints -= 1;
            System.out.println("Skill point distributed. Heavy weapons damage increased.");
        }
    }



    public Integer getHullDurability() {
        return hullDurability;
    }

    public void addSkillPoint_HullDurabiity() {
        if (this.skillPoints >= 1) {
            this.hullDurability += 1;
            this.skillPoints -= 1;
            System.out.println("Skill point distributed. Hull durability increased.");
        }
    }



    public Integer getMechanics() {
        return mechanics;
    }

    public void addSkillPoint_Mechanics() {
        if (this.skillPoints >= 1) {
            this.mechanics += 1;
            this.skillPoints -= 1;
            System.out.println("Skill point distributed. Mechanics upgraded.");
        }
    }



    public Integer getHitPoints() {
        return hitPoints;
    }

    public void addSkillPoint_HitPoints() {
        if (this.skillPoints >= 1) {
            this.hitPoints += 1;
            this.skillPoints -= 1;
            System.out.println("Skill point distributed. Hit Point added.");
        }
    }

    public void removeHitPoint() {
        if (this.hitPoints >= 1) {
            this.hitPoints -= 1;
            System.out.println(this.getName() + " lost Hit Point.");
            if (this.hitPoints == 0) {
                this.alive = false;
                System.out.println(this.getName() + " died.");
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
            System.out.println("Skill point distributed. Character Attack increased.");
        }
    }



    public Integer getDefence() {
        return defence;
    }

    public void addSkillPoint_Defence() {
        if (this.skillPoints >= 1) {
            this.defence += 1;
            this.skillPoints -= 1;
            System.out.println("Skill point distributed. Character Defence increased.");
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

        if (this.level < crewClass.getMaxLevel()) {
            if (this.experience >= 20) {
                this.level += 1;
                System.out.println("Level up! " + this.getName() + " promoted " + tempLevel + " >>> " + this.level);
                this.skillPoints += 1;
                System.out.println(("New skill point acquired."));
                this.experience -= 20;
            }
        } else {
            System.out.println("Experience lost. Maximum level reached. ");
            this.experience = 0;
        }
    }



    public Integer getLevel() {
        return level;
    }

    public Integer getSkillPoints() {
        return skillPoints;
    }

    public Double getSalary() {
        return salary;
    }

    public Double getTravelBonus() {
        return travelBonus;
    }

}
