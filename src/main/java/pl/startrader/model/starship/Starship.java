package pl.startrader.model.starship;

import pl.startrader.model.heavenly_body.HeavenlyBody;
import pl.startrader.model.resource.Resource;

import java.util.ArrayList;
import java.util.List;

public abstract class Starship {

    private String name;
    private HullType hullType;
    private CrewClass crewClass;
    private Integer crewMembers;
    private Integer flightModification;
    private Integer maxModulesCapacity;
    private Integer modulesAvailable;
    private Boolean hyperdrive;
    private Boolean onBoardComputer;
    private Boolean armory;
    private Boolean lightWeapon;
    private Integer lightWeaponsAmount;
    private Boolean mediumWeapon;
    private Integer mediumWeaponsAmount;
    private Boolean heavyWeapon;
    private Integer heavyWeaponsAmount;
    private Integer freightModules;
    private Integer freightModulesAvailable;
    private List<Cargo> cargoList;
    private Integer passengerModules;
    private Integer passengerModulesAvailable;
    private HeavenlyBody currentlyStationed;



    public Starship(HullType hullType) {
        this.name = "";
        this.hullType = hullType;
        this.crewClass = hullType.getMinimumCrewClass();
        this.crewMembers = hullType.getMinCrewMembers();
        this.flightModification = 0;
        this.maxModulesCapacity = hullType.getModuleCapacity();
        this.modulesAvailable = hullType.getModuleCapacity();
        this.hyperdrive = false;
        this.onBoardComputer = false;
        this.armory = false;
        this.lightWeapon = false;
        this.mediumWeapon = false;
        this.heavyWeapon = false;
        this.freightModules = 0;
        this.freightModulesAvailable = freightModules;
        this.passengerModules = 0;
        this.passengerModulesAvailable = passengerModules;
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
    } //TODO: Integrate with addCrewMembers



    public Integer getCrewMembers() {
        return crewMembers;
    }

    public void addCrewMembers(Integer crewMembers) {
        this.crewMembers = crewMembers;
    }

    public void removeCrewMembers(Integer crewMembers) {

    }



    public Integer getFlightModification() {
        return flightModification;
    }

    public void setFlightModification(Integer flightModification) {
        this.flightModification = flightModification;
    }



    public Boolean isHyperdriveInstalled() {
        return hyperdrive;
    }

    //TODO: Split addHyperdrive() to "add" and "remove" methods.
    public void addHyperdrive() {
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

    public void removeHyperdirve() {

    }



    public Boolean isOnBoardComputerInstalled() {
        return onBoardComputer;
    }

    //TODO: Split addOnBoardComputer() to "add" and "remove" methods.
    public void addOnBoardComputer() {
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

    public void removeOnBoardComputer() {

    }



    public Boolean isArmoryInstalled() {
        return armory;
    }

    //TODO: Split addArmory() to "add" and "remove" methods.
    public void addArmory() {
        this.armory = armory;
    }

    public void removeArmory() {

    }



    public Boolean isLightWeaponInstalled() {
        return lightWeapon;
    }

    public void addLightWeapon(Integer amount) {
        Integer amountMod = amount * 2;

        if(this.modulesAvailable >= amountMod) {
            this.modulesAvailable -= amountMod;
            this.lightWeaponsAmount += amount;
            this.mediumWeapon = true;
            System.out.println(amount + " light weapon modules installed.");
        } else {
            System.out.println("Not enough space in a hull. Space left: " + this.modulesAvailable
                    + ". Space needed: " + amountMod + ".");
        }

    }

    public void removeLightWeapon(Integer amount) {
        Integer amountMod = amount * 2;

        if(lightWeapon.equals(true) && amount <= this.lightWeaponsAmount) {
            this.modulesAvailable += amountMod;
            this.lightWeaponsAmount -= amount;

            if(this.lightWeaponsAmount > 0) {
                this.lightWeapon = true;
            } else if (this.lightWeaponsAmount == 0) {
                this.lightWeapon = false;
            } else {
                System.out.println("Error! lightWeaponsAmount goes below 0.");
            }

            System.out.println(amount + " light weapon modules removed.");

        } else {
            System.out.println("Cannot remove such amount of modules or already removed. Modules left: "
                    + this.heavyWeaponsAmount);
        }

    }



    public Boolean isMediumWeaponInstalled() {
        return mediumWeapon;
    }

    public void addMediumWeapon(Integer amount) {
        Integer amountMod = amount * 4;

        if(this.hullType.getHullSize().equals(HullSize.XS)) {
            System.out.println("This hull is too small to install that kind of module.");
        } else {
            if(this.modulesAvailable >= amountMod) {
                this.modulesAvailable -= amountMod;
                this.mediumWeaponsAmount += amount;
                this.mediumWeapon = true;
                System.out.println(amount + " medium weapon modules installed.");
            } else {
                System.out.println("Not enough space in a hull. Space left: " + this.modulesAvailable
                        + ". Space needed: " + amountMod + ".");
            }
        }
    }

    public void removeMediumWeapon(Integer amount) {
        Integer amountMod = amount * 4;

        if(this.hullType.getHullSize().equals(HullSize.XS)) {
            System.out.println("Cannot install therefore cannot remove module from that hull.");
        } else {
            if(mediumWeapon.equals(true) && amount <= this.mediumWeaponsAmount) {
                this.modulesAvailable += amountMod;
                this.mediumWeaponsAmount -= amount;

                if(this.mediumWeaponsAmount > 0) {
                    this.mediumWeapon = true;
                } else if (this.mediumWeaponsAmount == 0) {
                    this.mediumWeapon = false;
                } else {
                    System.out.println("Error! mediumWeaponsAmount goes below 0.");
                }

                System.out.println(amount + " medium weapon modules removed.");

            } else {
                System.out.println("Cannot remove such amount of modules or already removed. Modules left: "
                        + this.heavyWeaponsAmount);
            }
        }
    }



    public Boolean isHeavyWeaponInstalled() {
        return heavyWeapon;
    }

    public void addHeavyWeapon(Integer amount) {
        Integer amountMod = amount * 8;

        if(this.hullType.getHullSize().equals(HullSize.XS) ||
            this.hullType.getHullSize().equals(HullSize.S)) {
            System.out.println("This hull is too small to install that kind of module.");
        } else {
            if(this.modulesAvailable >= amountMod) {
                this.modulesAvailable -= amountMod;
                this.heavyWeaponsAmount += amount;
                this.heavyWeapon = true;
                System.out.println(amount + " heavy weapon modules installed.");
            } else {
                System.out.println("Not enough space in a hull. Space left: " + this.modulesAvailable
                        + ". Space needed: " + amountMod + ".");
            }
        }
    }

    public void removeHeavyWeapon(Integer amount) {
        Integer amountMod = amount * 8;

        if(this.hullType.getHullSize().equals(HullSize.XS) ||
                this.hullType.getHullSize().equals(HullSize.S)) {
            System.out.println("Cannot install therefore cannot remove module from that hull.");
        } else {
            if(heavyWeapon.equals(true) && amount <= this.heavyWeaponsAmount) {
                this.modulesAvailable += amountMod;
                this.heavyWeaponsAmount -= amount;

                if(this.heavyWeaponsAmount > 0) {
                    this.heavyWeapon = true;
                } else if (this.heavyWeaponsAmount == 0) {
                    this.heavyWeapon = false;
                } else {
                    System.out.println("Error! heavyWeaponsAmount goes below 0.");
                }

                System.out.println(amount + " heavy weapon modules removed.");

            } else {
                System.out.println("Cannot remove such amount of modules or already removed. Modules left: "
                        + this.heavyWeaponsAmount);
            }
        }
    }



    public Integer getFreightModules() {
        return freightModules;
    }

    public void addFreightModule(Integer freightModule) {
        if(modulesAvailable >= freightModule) {
            this.modulesAvailable -= freightModule;
            this.freightModules = freightModule;
            this.cargoList = new ArrayList<>();
        } else {
            System.out.println("Not enough space in a hull. Space left: " + modulesAvailable);
        }
    }

    public Integer getFreightModulesAvailable() {
        return freightModulesAvailable;
    }



    public List<Cargo> getCargoList() {
        return cargoList;
    }

    public void addToCargoList(Resource resource, Integer quantity) {
        // getCargo(resource, quantity); - CargoFactory
        // cargoList.add(cargo);
        this.freightModulesAvailable -= quantity * resource.getParam().getOccupiedSpace();
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

    public Integer getPassengerModulesAvailable() {
        return passengerModulesAvailable;
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