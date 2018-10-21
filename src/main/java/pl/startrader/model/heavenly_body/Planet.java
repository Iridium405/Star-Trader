package pl.startrader.model.heavenly_body;

import pl.startrader.model.character.Administrator;
import pl.startrader.model.character.CharacterGenerator;
import pl.startrader.model.resource.Resource;

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



    public Double getPrice_Cattle() {
        return price_Cattle;
    }

    public void setPrice_Cattle(Double price_Cattle) {
        this.price_Cattle = price_Cattle;
    }

    public Double getPrice_Decorative() {
        return price_Decorative;
    }

    public void setPrice_Decorative(Double price_Decorative) {
        this.price_Decorative = price_Decorative;
    }

    public Double getPrice_Endangered() {
        return price_Endangered;
    }

    public void setPrice_Endangered(Double price_Endangered) {
        this.price_Endangered = price_Endangered;
    }

    public Double getPrice_Experimental() {
        return price_Experimental;
    }

    public void setPrice_Experimental(Double price_Experimental) {
        this.price_Experimental = price_Experimental;
    }

    public Double getPrice_Skins() {
        return price_Skins;
    }

    public void setPrice_Skins(Double price_Skins) {
        this.price_Skins = price_Skins;
    }





    public Double getPrice_Accumulator() {
        return price_Accumulator;
    }

    public void setPrice_Accumulator(Double price_Accumulator) {
        this.price_Accumulator = price_Accumulator;
    }

    public Double getPrice_Circuit() {
        return price_Circuit;
    }

    public void setPrice_Circuit(Double price_Circuit) {
        this.price_Circuit = price_Circuit;
    }

    public Double getPrice_Nanoelectronics() {
        return price_Nanoelectronics;
    }

    public void setPrice_Nanoelectronics(Double price_Nanoelectronics) {
        this.price_Nanoelectronics = price_Nanoelectronics;
    }

    public Double getPrice_Photodetector() {
        return price_Photodetector;
    }

    public void setPrice_Photodetector(Double price_Photodetector) {
        this.price_Photodetector = price_Photodetector;
    }

    public Double getPrice_Prototype() {
        return price_Prototype;
    }

    public void setPrice_Prototype(Double price_Prototype) {
        this.price_Prototype = price_Prototype;
    }





    public Double getPrice_ModifiedFood() {
        return price_ModifiedFood;
    }

    public void setPrice_ModifiedFood(Double price_ModifiedFood) {
        this.price_ModifiedFood = price_ModifiedFood;
    }

    public Double getPrice_NaturalFood() {
        return price_NaturalFood;
    }

    public void setPrice_NaturalFood(Double price_NaturalFood) {
        this.price_NaturalFood = price_NaturalFood;
    }

    public Double getPrice_Preservatives() {
        return price_Preservatives;
    }

    public void setPrice_Preservatives(Double price_Preservatives) {
        this.price_Preservatives = price_Preservatives;
    }

    public Double getPrice_Spices() {
        return price_Spices;
    }

    public void setPrice_Spices(Double price_Spices) {
        this.price_Spices = price_Spices;
    }

    public Double getPrice_SyntheticFood() {
        return price_SyntheticFood;
    }

    public void setPrice_SyntheticFood(Double price_SyntheticFood) {
        this.price_SyntheticFood = price_SyntheticFood;
    }





    public Double getPrice_Antiseptics() {
        return price_Antiseptics;
    }

    public void setPrice_Antiseptics(Double price_Antiseptics) {
        this.price_Antiseptics = price_Antiseptics;
    }

    public Double getPrice_Chemoterapeutics() {
        return price_Chemoterapeutics;
    }

    public void setPrice_Chemoterapeutics(Double price_Chemoterapeutics) {
        this.price_Chemoterapeutics = price_Chemoterapeutics;
    }

    public Double getPrice_Genetics_Drugs() {
        return price_Genetics_Drugs;
    }

    public void setPrice_Genetics_Drugs(Double price_Genetics_Drugs) {
        this.price_Genetics_Drugs = price_Genetics_Drugs;
    }

    public Double getPrice_Radiopharmaceuticals() {
        return price_Radiopharmaceuticals;
    }

    public void setPrice_Radiopharmaceuticals(Double price_Radiopharmaceuticals) {
        this.price_Radiopharmaceuticals = price_Radiopharmaceuticals;
    }

    public Double getPrice_Vaccines() {
        return price_Vaccines;
    }

    public void setPrice_Vaccines(Double price_Vaccines) {
        this.price_Vaccines = price_Vaccines;
    }





    public Double getPrice_Antimatter() {
        return price_Antimatter;
    }

    public void setPrice_Antimatter(Double price_Antimatter) {
        this.price_Antimatter = price_Antimatter;
    }

    public Double getPrice_Iridium() {
        return price_Iridium;
    }

    public void setPrice_Iridium(Double price_Iridium) {
        this.price_Iridium = price_Iridium;
    }

    public Double getPrice_Platinium() {
        return price_Platinium;
    }

    public void setPrice_Platinium(Double price_Platinium) {
        this.price_Platinium = price_Platinium;
    }

    public Double getPrice_Plutonium() {
        return price_Plutonium;
    }

    public void setPrice_Plutonium(Double price_Plutonium) {
        this.price_Plutonium = price_Plutonium;
    }

    public Double getPrice_Titianium() {
        return price_Titianium;
    }

    public void setPrice_Titianium(Double price_Titianium) {
        this.price_Titianium = price_Titianium;
    }





    public Double getPrice_Dioptase() {
        return price_Dioptase;
    }

    public void setPrice_Dioptase(Double price_Dioptase) {
        this.price_Dioptase = price_Dioptase;
    }

    public Double getPrice_Fluorite() {
        return price_Fluorite;
    }

    public void setPrice_Fluorite(Double price_Fluorite) {
        this.price_Fluorite = price_Fluorite;
    }

    public Double getPrice_Jade() {
        return price_Jade;
    }

    public void setPrice_Jade(Double price_Jade) {
        this.price_Jade = price_Jade;
    }

    public Double getPrice_Onyx() {
        return price_Onyx;
    }

    public void setPrice_Onyx(Double price_Onyx) {
        this.price_Onyx = price_Onyx;
    }

    public Double getPrice_Rhodonite() {
        return price_Rhodonite;
    }

    public void setPrice_Rhodonite(Double price_Rhodonite) {
        this.price_Rhodonite = price_Rhodonite;
    }





    public Double getPrice_Biopolymer() {
        return price_Biopolymer;
    }

    public void setPrice_Biopolymer(Double price_Biopolymer) {
        this.price_Biopolymer = price_Biopolymer;
    }

    public Double getPrice_PAN() {
        return price_PAN;
    }

    public void setPrice_PAN(Double price_PAN) {
        this.price_PAN = price_PAN;
    }

    public Double getPrice_PMMA() {
        return price_PMMA;
    }

    public void setPrice_PMMA(Double price_PMMA) {
        this.price_PMMA = price_PMMA;
    }

    public Double getPrice_POM() {
        return price_POM;
    }

    public void setPrice_POM(Double price_POM) {
        this.price_POM = price_POM;
    }

    public Double getPrice_PTFE() {
        return price_PTFE;
    }

    public void setPrice_PTFE(Double price_PTFE) {
        this.price_PTFE = price_PTFE;
    }
}
