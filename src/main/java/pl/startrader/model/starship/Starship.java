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
    private Integer freightModule;
    private Integer passengerModule;
    private Integer maxModulesCapacity;
    private Integer modulesAvailable;
    private HeavenlyBody currentlyStationed;

    public Starship(String name, HullType hullType) {
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
        this.freightModule = 0;
        this.passengerModule = 0;
        this.maxModulesCapacity = hullType.getModuleCapacity();
        this.modulesAvailable = hullType.getModuleCapacity();
        this.currentlyStationed = null;
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


    public Integer getCrewMembers() {
        return crewMembers;
    }

    public void setCrewMembers(Integer crewMembers) {
        this.crewMembers = crewMembers;
    }


    public Boolean getHyperdrive() {
        return hyperdrive;
    }

    public void addHyperdrive(Boolean hyperdrive) {
        if(!hyperdrive) {
            if(this.modulesAvailable >= 2) {
                this.modulesAvailable -= 2;
            } else {
                System.out.println("Not enough space in a hull.");
            }
        } else {
            System.out.println("Hyperdrive already installed.");
        }
        this.hyperdrive = hyperdrive;
    }



    public Boolean getOnBoardComputer() {
        return onBoardComputer;
    }

    public void addOnBoardComputer(Boolean onBoardComputer) {
        if(!onBoardComputer) {
            if(this.modulesAvailable >= 1) {
                this.modulesAvailable -= 1;
            } else {
                System.out.println("Not enough space in a hull.");
            }
        } else {
            System.out.println("On-board computer already installed.");
        }
        this.onBoardComputer = onBoardComputer;
    }



    public Boolean getArmory() {
        return armory;
    }

    public void addArmory(Boolean armory) {
        this.armory = armory;
    }



    public Boolean getLightWeapon() {
        return lightWeapon;
    }

    public void addLightWeapon(Boolean lightWeapon) {
        this.lightWeapon = lightWeapon;
    }



    public Boolean getMediumWeapon() {
        return mediumWeapon;
    }

    public void addMediumWeapon(Boolean mediumWeapon) {
        this.mediumWeapon = mediumWeapon;
    }



    public Boolean getHeavyWeapon() {
        return heavyWeapon;
    }

    public void addHeavyWeapon(Boolean heavyWeapon) {
        this.heavyWeapon = heavyWeapon;
    }



    public Integer getFreightModule() {
        return freightModule;
    }

    public void addFreightModule(Integer freightModule) {
        if(modulesAvailable >= freightModule) {
            this.modulesAvailable -= freightModule;
            this.freightModule = freightModule;
        } else {
            System.out.println("Not enough space in a hull. Space left: " + modulesAvailable);
        }
    }



    public Integer getPassengerModule() {
        return passengerModule;
    }

    public void addPassengerModule(Integer passengerModule) {
        if(modulesAvailable >= passengerModule) {
            this.modulesAvailable -= passengerModule;
            this.passengerModule = passengerModule;
        } else {
            System.out.println("Not enough space in a hull. Space left: " + modulesAvailable);
        }
    }



    public Integer getMaxModulesCapacity() {
        return maxModulesCapacity;
    }


    public Integer getModulesAvailable() {
        return modulesAvailable;
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