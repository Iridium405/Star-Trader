package pl.startrader.model.starship;

import pl.startrader.model.character.Crew;
import pl.startrader.model.heavenly_body.HeavenlyBody;
import pl.startrader.model.resource.Resource;

import java.util.ArrayList;
import java.util.List;

public class Starship {

    private String name;
    private HullType hullType;

    private CrewClass crewClass;
    private Integer crewMembers;
    private List<Crew> crewList;

    private Integer flightModification;

    private Integer maxModulesCapacity;
    private Integer modulesAvailable;

    private Boolean hyperdriveInstalled;

    private Boolean onBoardComputerInstalled;

    private Boolean armoryInstalled;

    private Integer basicDamage;

    private Boolean lightWeaponInstalled;
    private Integer lightWeaponsAmount;

    private Boolean mediumWeaponInstalled;
    private Integer mediumWeaponsAmount;

    private Boolean heavyWeaponInstalled;
    private Integer heavyWeaponsAmount;

    private Integer freightModules;
    private Integer freightModulesAvailable;
    private List<Cargo> cargoList;

    private Integer passengerModules;
    private Integer passengerModulesAvailable;

    private Double travelCostFactor;

    private HeavenlyBody currentlyStationed;



    public Starship(String name, HullType hullType) {
        this.name = name;
        this.hullType = hullType;
        this.crewClass = hullType.getMinimumCrewClass();
        this.crewMembers = hullType.getMinCrewMembers();
        this.crewList = new ArrayList<>();
        this.flightModification = 0;
        this.maxModulesCapacity = hullType.getModuleCapacity();
        this.modulesAvailable = hullType.getModuleCapacity();
        this.hyperdriveInstalled = false;
        this.onBoardComputerInstalled = false;
        this.armoryInstalled = false;
        this.basicDamage = 0;
        this.lightWeaponInstalled = false;
        this.mediumWeaponInstalled = false;
        this.heavyWeaponInstalled = false;
        this.freightModules = 0;
        this.freightModulesAvailable = freightModules;
        this.passengerModules = 0;
        this.passengerModulesAvailable = passengerModules;
        this.travelCostFactor = this.hullType.getHullSize().getBasicTravelCostFactor();
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



    public Integer getCrewMembers() {
        return crewMembers;
    }

    //Basic method. TODO: Change according to specification.
    public void addCrewMember(Crew crewMember) {
        crewList.add(crewMember);
        this.crewMembers++;
        System.out.println(crewMember.getName() + " has been assigned to " + this.name);

//        if (crewMembers > 0 && this.crewMembers + crewMembers <= this.hullType.getMaxCrewMembers()) {
//            if (this.crewMembers >= this.hullType.getMinCrewMembers()) {
//                this.flightModification += this.crewClass.getSkillModifier();
//            } else if (this.crewMembers < this.hullType.getMinCrewMembers() && crewMembers > 0) {
//                this.flightModification += -5;
//            } else {
//                System.err.println("Not enough crew members to run that ship.");
//            }
//        } else {
//            System.err.println("Error! Not enough or too many crew members.");
//        }
    }

    public void removeCrewMember(Integer crewMembers) {

    }



    public Integer getFlightModification() {
        return flightModification;
    }



    public Boolean isHyperdriveInstalled() {
        return hyperdriveInstalled;
    }

    //TODO: Split addHyperdrive() to different hull sizes the same as addOnBoardComputer().
    public void addHyperdrive() {
        if (!this.hullType.getHullSize().equals(HullSize.XS) || !this.hullType.getHullSize().equals(HullSize.S)) {
            if (!hyperdriveInstalled) {
                if (this.modulesAvailable >= 2) {
                    this.modulesAvailable -= 2;
                    this.hyperdriveInstalled = true;
                    this.flightModification += 2;
                    System.out.println("Hyperdrive installed.");
                } else {
                    System.err.println("Not enough space in a hull.");
                }
            } else {
                System.err.println("Hyperdrive already installed.");
            }
        } else {
            System.err.println("This hull is too small to install hyperdrive on it.");
        }
    }

    public void removeHyperdirve() {
        if (hyperdriveInstalled) {
            this.modulesAvailable += 2;
            this.hyperdriveInstalled = false;
            this.flightModification -= 2;
            System.out.println("Hyperdrive uninstalled.");
        } else {
            System.err.println("Install hyperdrive first to uninstall it later.");
        }
    }



    public Boolean isOnBoardComputerInstalled() {
        return onBoardComputerInstalled;
    }

    public void addOnBoardComputer() {
        if (!this.hullType.getHullSize().equals(HullSize.XS)) {
            if (!onBoardComputerInstalled) {
                if (this.hullType.getHullSize().equals(HullSize.S)) {
                    if (this.modulesAvailable >= 1) {
                        this.modulesAvailable -= 1;
                        this.flightModification += 1;
                    } else {
                        System.err.println("Not enough space in a hull");
                    }
                } else if (this.hullType.getHullSize().equals(HullSize.M)) {
                    if (this.modulesAvailable >= 2) {
                        this.modulesAvailable -= 2;
                        this.flightModification += 2;
                    } else {
                        System.err.println("Not enough space in a hull");
                    }
                } else if (this.hullType.getHullSize().equals(HullSize.L)) {
                    if (this.modulesAvailable >= 4) {
                        this.modulesAvailable -= 4;
                        this.flightModification += 2;
                    } else {
                        System.err.println("Not enough space in a hull");
                    }
                } else if (this.hullType.getHullSize().equals(HullSize.XL)) {
                    if (this.modulesAvailable >= 6) {
                        this.modulesAvailable -= 6;
                        this.flightModification += 3;
                    } else {
                        System.err.println("Not enough space in a hull");
                    }
                } else if (this.hullType.getHullSize().equals(HullSize.XXL)) {
                    if (this.modulesAvailable >= 8) {
                        this.modulesAvailable -= 8;
                        this.flightModification += 3;
                    } else {
                        System.err.println("Not enough space in a hull");
                    }
                }

                this.onBoardComputerInstalled = true;
                System.out.println("On-board computer assistance installed.");

            } else {
                System.err.println("On-board computer assisstance already installed.");
            }
        } else {
            System.err.println("Cannot install on-board computer assisstance in such a small hull.");
        }
    }

    public void removeOnBoardComputer() {
        if (onBoardComputerInstalled) {
            if (this.hullType.getHullSize().equals(HullSize.S)) {
                 this.modulesAvailable += 1;
                 this.flightModification -= 1;
            } else if (this.hullType.getHullSize().equals(HullSize.M)) {
                 this.modulesAvailable += 2;
                 this.flightModification -= 2;
            } else if (this.hullType.getHullSize().equals(HullSize.L)) {
                 this.modulesAvailable += 4;
                 this.flightModification -= 2;
            } else if (this.hullType.getHullSize().equals(HullSize.XL)) {
                 this.modulesAvailable += 6;
                 this.flightModification -= 3;
            } else if (this.hullType.getHullSize().equals(HullSize.XXL)) {
                 this.modulesAvailable += 8;
                 this.flightModification -= 3;
            }
            System.out.println("On-board computer assisstance uninstalled.");
        } else {
            System.err.println("Must install on-board computer assisstance first.");
        }
    }



    public Boolean isArmoryInstalled() {
        return armoryInstalled;
    }

    //TODO: Split addArmory() to "add" and "remove" methods.
    public void addArmory() {

    }

    public void removeArmory() {

    }



    public Integer getBasicDamage() {
        return basicDamage;
    }



    public Boolean isLightWeaponInstalled() {
        return lightWeaponInstalled;
    }

    public void addLightWeapon(Integer amount) {
        Integer amountMod = amount * 2;

        if(this.modulesAvailable >= amountMod) {
            this.modulesAvailable -= amountMod;
            this.lightWeaponsAmount += amount;
            this.lightWeaponInstalled = true;
            this.basicDamage += amount;
            System.out.println(amount + " light weapon modules installed.");
        } else {
            System.err.println("Not enough space in a hull. Space left: " + this.modulesAvailable
                    + ". Space needed: " + amountMod + ".");
        }

    }

    public void removeLightWeapon(Integer amount) {
        Integer amountMod = amount * 2;

        if(lightWeaponInstalled && amount <= this.lightWeaponsAmount) {
            this.modulesAvailable += amountMod;
            this.lightWeaponsAmount -= amount;
            this.basicDamage -= amount;

            if(this.lightWeaponsAmount > 0) {
                this.lightWeaponInstalled = true;
            } else if (this.lightWeaponsAmount == 0) {
                this.lightWeaponInstalled = false;
            } else {
                System.err.println("Error! lightWeaponsAmount goes below 0.");
            }

            System.out.println(amount + " light weapon modules removed.");

        } else {
            System.err.println("Cannot remove such amount of modules or already removed. Modules left: "
                    + this.heavyWeaponsAmount);
        }

    }



    public Boolean isMediumWeaponInstalled() {
        return mediumWeaponInstalled;
    }

    public void addMediumWeapon(Integer amount) {
        Integer amountMod = amount * 4;

        if(this.hullType.getHullSize().equals(HullSize.XS)) {
            System.err.println("This hull is too small to install that kind of module.");
        } else {
            if(this.modulesAvailable >= amountMod) {
                this.modulesAvailable -= amountMod;
                this.mediumWeaponsAmount += amount;
                this.mediumWeaponInstalled = true;
                this.basicDamage += amount * 4;
                System.out.println(amount + " medium weapon modules installed.");
            } else {
                System.err.println("Not enough space in a hull. Space left: " + this.modulesAvailable
                        + ". Space needed: " + amountMod + ".");
            }
        }
    }

    public void removeMediumWeapon(Integer amount) {
        Integer amountMod = amount * 4;

        if(this.hullType.getHullSize().equals(HullSize.XS)) {
            System.err.println("Cannot install therefore cannot remove module from that hull.");
        } else {
            if(mediumWeaponInstalled && amount <= this.mediumWeaponsAmount) {
                this.modulesAvailable += amountMod;
                this.mediumWeaponsAmount -= amount;
                this.basicDamage -= amount * 4;

                if(this.mediumWeaponsAmount > 0) {
                    this.mediumWeaponInstalled = true;
                } else if (this.mediumWeaponsAmount == 0) {
                    this.mediumWeaponInstalled = false;
                } else {
                    System.err.println("Error! mediumWeaponsAmount goes below 0.");
                }

                System.out.println(amount + " medium weapon modules removed.");

            } else {
                System.err.println("Cannot remove such amount of modules or already removed. Modules left: "
                        + this.heavyWeaponsAmount);
            }
        }
    }



    public Boolean isHeavyWeaponInstalled() {
        return heavyWeaponInstalled;
    }

    public void addHeavyWeapon(Integer amount) {
        Integer amountMod = amount * 8;

        if(this.hullType.getHullSize().equals(HullSize.XS) ||
            this.hullType.getHullSize().equals(HullSize.S)) {
            System.err.println("This hull is too small to install that kind of module.");
        } else {
            if(this.modulesAvailable >= amountMod) {
                this.modulesAvailable -= amountMod;
                this.heavyWeaponsAmount += amount;
                this.heavyWeaponInstalled = true;
                this.basicDamage += amount * 8;
                System.out.println(amount + " heavy weapon modules installed.");
            } else {
                System.err.println("Not enough space in a hull. Space left: " + this.modulesAvailable
                        + ". Space needed: " + amountMod + ".");
            }
        }
    }

    public void removeHeavyWeapon(Integer amount) {
        Integer amountMod = amount * 8;

        if(this.hullType.getHullSize().equals(HullSize.XS) ||
                this.hullType.getHullSize().equals(HullSize.S)) {
            System.err.println("Cannot install therefore cannot remove module from that hull.");
        } else {
            if(heavyWeaponInstalled && amount <= this.heavyWeaponsAmount) {
                this.modulesAvailable += amountMod;
                this.heavyWeaponsAmount -= amount;
                this.basicDamage -= amount * 8;

                if(this.heavyWeaponsAmount > 0) {
                    this.heavyWeaponInstalled = true;
                } else if (this.heavyWeaponsAmount == 0) {
                    this.heavyWeaponInstalled = false;
                } else {
                    System.err.println("Error! heavyWeaponsAmount goes below 0.");
                }

                System.out.println(amount + " heavy weapon modules removed.");

            } else {
                System.err.println("Cannot remove such amount of modules or already removed. Modules left: "
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
            System.out.println("Freight module(s) added.");
        } else {
            System.err.println("Not enough space in a hull. Space left: " + modulesAvailable);
        }
    }

    public Integer getFreightModulesAvailable() {
        return freightModulesAvailable;
    }



    public List<Cargo> getCargoList() {
        return cargoList;
    }

    public void addToCargoList(Resource resource, Integer quantity) {
        Integer occupiedSpace = resource.getParam().getOccupiedSpace();
        // getCargo(resource, quantity); - CargoFactory
        // cargoList.add(cargo);
        this.freightModulesAvailable -= quantity * occupiedSpace;

        Integer freightModulesTaken = this.freightModules - freightModulesAvailable;
        this.travelCostFactor += 0.33 * freightModulesTaken;
    }

    public void removeFromCargoList(Resource resource, Integer quantity){}



    public Integer getPassengerModules() {
        return passengerModules;
    }

    public void addPassengerModule(Integer passengerModule) {
        if(modulesAvailable >= passengerModule) {
            this.modulesAvailable -= passengerModule;
            this.passengerModules = passengerModule;
        } else {
            System.err.println("Not enough space in a hull. Space left: " + modulesAvailable);
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



    public Double travelDistance_Calculation(HeavenlyBody destination) {
        Double station_X = this.currentlyStationed.getLocationX();
        Double station_Y = this.currentlyStationed.getLocationY();
        Double station_Z = this.currentlyStationed.getLocationZ();
        Double destination_X = destination.getLocationX();
        Double destination_Y = destination.getLocationY();
        Double destination_Z = destination.getLocationZ();

        Double courseLength = Math.sqrt(
               (Math.pow(destination_X - station_X, 2)) +
               (Math.pow(destination_Y - station_Y, 2)) +
               (Math.pow(destination_Z - station_Z, 2))
        );

        courseLength = Math.round(courseLength*100)/100.0d;

        return courseLength;
    }



    public Double travelCost_Calculation(HeavenlyBody destination) {
        Double crewTravelBonus = 0.0;

        for (Crew crewMember : crewList) {
            crewTravelBonus += crewMember.getTravelBonus();
        }

        return travelDistance_Calculation(destination)
                * this.hullType.getHullSize().getBasicTravelCostFactor()
                + crewTravelBonus;
    }



    public void travel(HeavenlyBody destination) {

    }
    
}