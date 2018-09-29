package pl.startrader.model.starship;

import pl.startrader.model.heavenly_body.HeavenlyBody;

public abstract class Starship {

    private String name;
    private HullType hullType;
    private CrewClass crewClass;
    private Integer crewMembers;
    private Integer flightModification;
    private Boolean hyperdrive;
    private Boolean onBoardComputer;
    private Boolean armory;
    private Boolean lightWeapon;
    private Boolean mediumWeapon;
    private Boolean heavyWeapon;
    private Integer freightModules;
    private Integer passengerModules;
    private Integer maxModulesCapacity;
    private Integer modulesAvailable;
    private HeavenlyBody currentlyStationed;



    public Starship(HullType hullType) {
        this.name = "";
        this.hullType = hullType;
        this.crewClass = hullType.getMinimumCrewClass();
        this.crewMembers = hullType.getMinCrewMembers();
        this.flightModification = 0;
        this.hyperdrive = false;
        this.onBoardComputer = false;
        this.armory = false;
        this.lightWeapon = false;
        this.mediumWeapon = false;
        this.heavyWeapon = false;
        this.freightModules = 0;
        this.passengerModules = 0;
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



    public Integer getFlightModification() {
        return flightModification;
    }



    public Boolean isHyperdriveInstalled() {
        return hyperdrive;
    }

    public void setHyperdrive(Boolean hyperdrive) {
        if(hyperdrive) {
            if(this.modulesAvailable >= 2) {
                this.modulesAvailable -= 2;
                System.out.println("Hyperdrive installed.");
            } else {
                System.out.println("Not enough space in a hull.");
            }
        } else {
            this.modulesAvailable += 2;
            System.out.println("Hyperdrive uninstalled.");
        }
        this.hyperdrive = hyperdrive;
    }



    public Boolean isOnBoardComputerInstalled() {
        return onBoardComputer;
    }

    public void setOnBoardComputer(Boolean onBoardComputer) {
        if(!onBoardComputer) {
            if(this.modulesAvailable >= 1) {
                this.modulesAvailable -= 1;
                System.out.println("On-board computer installed.");
            } else {
                System.out.println("Not enough space in a hull.");
            }
        } else {
            this.modulesAvailable += 1;
            System.out.println("On-board computer uninstalled.");
        }
        this.onBoardComputer = onBoardComputer;
    }



    public Boolean isArmoryInstalled() {
        return armory;
    }

    public void setArmory(Boolean armory) {
        this.armory = armory;
    }



    public Boolean isLightWeaponInstalled() {
        return lightWeapon;
    }

    public void setLightWeapon(Boolean lightWeapon) {
        this.lightWeapon = lightWeapon;
    }



    public Boolean isMediumWeaponInstalled() {
        return mediumWeapon;
    }

    public void setMediumWeapon(Boolean mediumWeapon) {
        this.mediumWeapon = mediumWeapon;
    }



    public Boolean isHeavyWeaponInstalled() {
        return heavyWeapon;
    }

    public void setHeavyWeapon(Boolean heavyWeapon) {
        this.heavyWeapon = heavyWeapon;
    }



    public Integer getFreightModules() {
        return freightModules;
    }

    public void addFreightModule(Integer freightModule) {
        if(modulesAvailable >= freightModule) {
            this.modulesAvailable -= freightModule;
            this.freightModules = freightModule;
        } else {
            System.out.println("Not enough space in a hull. Space left: " + modulesAvailable);
        }
    }



    public Integer getPassengerModules() {
        return passengerModules;
    }

    public void addPassengerModule(Integer passengerModule) {
        if(modulesAvailable >= passengerModule) {
            this.modulesAvailable -= passengerModule;
            this.passengerModules = passengerModule;
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