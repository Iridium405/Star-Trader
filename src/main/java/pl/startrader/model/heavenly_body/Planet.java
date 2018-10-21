package pl.startrader.model.heavenly_body;

import pl.startrader.model.character.Administrator;
import pl.startrader.model.character.CharacterGenerator;
import pl.startrader.model.resource.Resource;
import pl.startrader.model.resource.animal.Decorative;

import java.util.ArrayList;
import java.util.List;

public class Planet extends HeavenlyBody {

    private String type;
    private String name;
    private Integer size;
    private Double locationX;
    private Double locationY;
    private Double locationZ;

    private Administrator administrator;

    private Integer portClass;
    private Integer security;
    private Integer militaryPower;

    private List<Resource> mainResources;

    private List<Resource> productionPermitted;
    private List<Resource> productionForbidden;

    private List<Resource> tradePermitted;
    private List<Resource> tradeForbidden;

    private Double price_Cattle;
    private Double price_Decorative;
    private Double price_Endangered;
    private Double price_Experimental;
    private Double price_Skins;

    private Double price_Accumulator;
    private Double price_Circuit;
    private Double price_Nanoelectronics;
    private Double price_Photodetector;
    private Double price_Prototype;

    private Double price_ModifiedFood;
    private Double price_NaturalFood;
    private Double price_Preservatives;
    private Double price_Spices;
    private Double price_SyntheticFood;

    private Double price_Antiseptics;
    private Double price_Chemoterapeutics;
    private Double price_Genetics_Drugs;
    private Double price_Radiopharmaceuticals;
    private Double price_Vaccines;

    private Double price_Antimatter;
    private Double price_Iridium;
    private Double price_Platinium;
    private Double price_Plutonium;
    private Double price_Titianium;

    private Double price_Dioptase;
    private Double price_Fluorite;
    private Double price_Jade;
    private Double price_Onyx;
    private Double price_Rhodonite;

    private Double price_Biopolymer;
    private Double price_PAN;
    private Double price_PMMA;
    private Double price_POM;
    private Double price_PTFE;





    public Planet(String name, Integer size, Double locationX, Double locationY, Double locationZ) {
        this.type = "Planet";
        this.name = name;
        this.size = size;
        this.locationX = locationX;
        this.locationY = locationY;
        this.locationZ = locationZ;
        this.administrator = CharacterGenerator.generateAdministrator();
        this.portClass = 0;
        this.security = 0;
        this.militaryPower = 0;
        this.mainResources = new ArrayList<>();

        this.productionPermitted = new ArrayList<>();
        this.productionForbidden = new ArrayList<>();
        this.tradePermitted = new ArrayList<>();
        this.tradeForbidden = new ArrayList<>();



        this.price_Cattle = 0.0;
        this.price_Decorative = 0.0;
        this.price_Endangered = 0.0;
        this.price_Experimental = 0.0;
        this.price_Skins = 0.0;

        this.price_Accumulator = 0.0;
        this.price_Circuit = 0.0;
        this.price_Nanoelectronics = 0.0;
        this.price_Photodetector = 0.0;
        this.price_Prototype = 0.0;

        this.price_ModifiedFood = 0.0;
        this.price_NaturalFood = 0.0;
        this.price_Preservatives = 0.0;
        this.price_Spices = 0.0;
        this.price_SyntheticFood = 0.0;

        this.price_Antiseptics = 0.0;
        this.price_Chemoterapeutics = 0.0;
        this.price_Genetics_Drugs = 0.0;
        this.price_Radiopharmaceuticals = 0.0;
        this.price_Vaccines = 0.0;

        this.price_Antimatter = 0.0;
        this.price_Iridium = 0.0;
        this.price_Platinium = 0.0;
        this.price_Plutonium = 0.0;
        this.price_Titianium = 0.0;

        this.price_Dioptase = 0.0;
        this.price_Fluorite = 0.0;
        this.price_Jade = 0.0;
        this.price_Onyx = 0.0;
        this.price_Rhodonite = 0.0;

        this.price_Biopolymer = 0.0;
        this.price_PAN = 0.0;
        this.price_PMMA = 0.0;
        this.price_POM = 0.0;
        this.price_PTFE = 0.0;
    }

    @Override
    public String getType() {
        return this.type;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Integer getSize() {
        return this.size;
    }

    @Override
    public Double getLocationX() {
        return locationX;
    }

    @Override
    public Double getLocationY() {
        return locationY;
    }

    @Override
    public Double getLocationZ() {
        return locationZ;
    }



    public Administrator getAdministrator() {
        return administrator;
    }

    public void changeAdministrator(Administrator administrator) {
        this.administrator = administrator;
    }



    public Integer getPortClass() {
        return portClass;
    }

    public void setPortClass(Integer portClass) {
        this.portClass = portClass;
    }



    public Integer getSecurity() {
        return security;
    }

    public void setSecurity(Integer security) {
        this.security = security;
    }



    public Integer getMilitaryPower() {
        return militaryPower;
    }

    public void setMilitaryPower(Integer militaryPower) {
        this.militaryPower = militaryPower;
    }



    @Override
    public List<Resource> getMainResources() {
        return mainResources;
    }

    public void addMainResource(Resource resource) {
        if(mainResources.size() < 3 && !this.mainResources.contains(resource)) {
            this.mainResources.add(resource);
            System.out.println(resource.getParam().getName() + " added as main resource on " + getName());
            System.out.println("Size: " + this.getMainResources().size());
        } else {
            System.out.println("Resource cannot be added.");
        }
    }



    public List<Resource> getProductionPermitted() {
        return productionPermitted;
    }


    public List<Resource> getProductionForbidden() {
        return productionForbidden;
    }


    public List<Resource> getTradePermitted() {
        return tradePermitted;
    }


    public List<Resource> getTradeForbidden() {
        return tradeForbidden;
    }


    //TODO
    public void createStarship() {}
}
