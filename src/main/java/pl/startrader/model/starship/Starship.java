package pl.startrader.model.starship;

import pl.startrader.model.heavenly_body.HeavenlyBody;

public abstract class Starship {

    private String name;
    private HullType hullType;
    private CrewClass crewClass;
    private Integer crewMembers;
    private Boolean hyperdrive;
    private Boolean onBoardComputer;
    private Boolean armory;
    private Boolean lightWeapon;
    private Boolean mediumWeapon;
    private Boolean heavyWeapon;
    private Integer maxModulesCapacity;
    private Integer modulesAvailable;
    private HeavenlyBody currentlyStationed;

    public Starship(String name, HullType hullType, Integer modulesAvailable, HeavenlyBody currentlyStationed) {
        this.name = name;
        this.hullType = hullType;
        this.crewClass = hullType.getMinimumCrewSkill();
        this.crewMembers = hullType.getMinCrewMembers();
        this.hyperdrive = false;
        this.onBoardComputer = false;
        this.armory = false;
        this.lightWeapon = false;
        this.mediumWeapon = false;
        this.heavyWeapon = false;
        this.maxModulesCapacity = hullType.getModuleCapacity();
        this.modulesAvailable = hullType.getModuleCapacity();
        this.currentlyStationed = currentlyStationed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public HullType getHullType() {
        return hullType;
    }

    public void setHullType(HullType hullType) {
        this.hullType = hullType;
    }



    public CrewClass getCrewClass() {
        return crewClass;
    }

    public void setCrewClass(CrewClass crewClass) {
        this.crewClass = crewClass;
    }



    public Boolean getHyperdrive() {
        return hyperdrive;
    }

    public void setHyperdrive(Boolean hyperdrive) {
        this.hyperdrive = hyperdrive;
    }



    public Boolean getOnBoardComputer() {
        return onBoardComputer;
    }

    public void setOnBoardComputer(Boolean onBoardComputer) {
        if(onBoardComputer){
            modulesAvailable -= 1;
        }
        this.onBoardComputer = onBoardComputer;
    }



    public Boolean getArmory() {
        return armory;
    }

    public void setArmory(Boolean armory) {
        this.armory = armory;
    }



    public Boolean getLightWeapon() {
        return lightWeapon;
    }

    public void setLightWeapon(Boolean lightWeapon) {
        this.lightWeapon = lightWeapon;
    }



    public Boolean getMediumWeapon() {
        return mediumWeapon;
    }

    public void setMediumWeapon(Boolean mediumWeapon) {
        this.mediumWeapon = mediumWeapon;
    }



    public Boolean getHeavyWeapon() {
        return heavyWeapon;
    }

    public void setHeavyWeapon(Boolean heavyWeapon) {
        this.heavyWeapon = heavyWeapon;
    }



    public Integer getMaxModulesCapacity() {
        return maxModulesCapacity;
    }

    public void setMaxModulesCapacity(Integer maxModulesCapacity) {
        this.maxModulesCapacity = maxModulesCapacity;
    }



    public HeavenlyBody getCurrentlyStationed() {
        return currentlyStationed;
    }

    public void setCurrentlyStationed(HeavenlyBody currentlyStationed) {
        this.currentlyStationed = currentlyStationed;
    }
    


    public void transport(HeavenlyBody destination){

    }

}