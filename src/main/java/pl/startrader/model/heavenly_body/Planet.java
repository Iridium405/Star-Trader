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





    private Integer quantity_Cattle;
    private Double price_Cattle;
    private Boolean demanded_Cattle;

    private Integer quantity_Decorative;
    private Double price_Decorative;
    private Boolean demanded_Decorative;

    private Integer quantity_Endangered;
    private Double price_Endangered;
    private Boolean demanded_Endangered;

    private Integer quantity_Experimental;
    private Double price_Experimental;
    private Boolean demanded_Expermiental;

    private Integer quantity_Skins;
    private Double price_Skins;
    private Boolean demanded_Skins;

    private Integer quantity_Accumulator;
    private Double price_Accumulator;
    private Boolean demanded_Accumulator;

    private Integer quantity_Circuit;
    private Double price_Circuit;
    private Boolean demanded_Circuit;

    private Integer quantity_Nanoelectronics;
    private Double price_Nanoelectronics;
    private Boolean demanded_Nanoelectronics;

    private Integer quantity_Photodetector;
    private Double price_Photodetector;
    private Boolean demanded_Photodetector;

    private Integer quantity_Prototype;
    private Double price_Prototype;
    private Boolean demanded_Prototype;

    private Integer quantity_ModifiedFood;
    private Double price_ModifiedFood;
    private Boolean demanded_ModifiedFood;

    private Integer quantity_NaturalFood;
    private Double price_NaturalFood;
    private Boolean demanded_NaturalFood;

    private Integer quantity_Preservatives;
    private Double price_Preservatives;
    private Boolean demanded_Preservatives;

    private Integer quantity_Spices;
    private Double price_Spices;
    private Boolean demanded_Spices;

    private Integer quantity_SyntheticFood;
    private Double price_SyntheticFood;
    private Boolean demanded_SyntheticFood;

    private Integer quantity_Antiseptics;
    private Double price_Antiseptics;
    private Boolean demanded_Antiseptics;

    private Integer quantity_Chemoterapeutics;
    private Double price_Chemoterapeutics;
    private Boolean demanded_Chemoterapeutics;

    private Integer quantity_GeneticDrugs;
    private Double price_GeneticsDrugs;
    private Boolean demanded_GeneticsDrugs;

    private Integer quantity_Radiopharmaceuticals;
    private Double price_Radiopharmaceuticals;
    private Boolean demanded_Radiopharmaceuticals;

    private Integer quantity_Vaccines;
    private Double price_Vaccines;
    private Boolean demanded_Vaccines;

    private Integer quantity_Antimatter;
    private Double price_Antimatter;
    private Boolean demanded_Antimatter;

    private Integer quantity_Iridium;
    private Double price_Iridium;
    private Boolean demanded_Iridium;

    private Integer quantity_Platinum;
    private Double price_Platinum;
    private Boolean demanded_Platinum;

    private Integer quantity_Plutonium;
    private Double price_Plutonium;
    private Boolean demanded_Plutonium;

    private Integer quantity_Titanium;
    private Double price_Titianium;
    private Boolean demanded_Titanium;

    private Integer quantity_Dioptase;
    private Double price_Dioptase;
    private Boolean demanded_Dioptase;

    private Integer quantity_Fluorite;
    private Double price_Fluorite;
    private Boolean demanded_Fluorite;

    private Integer quantity_Jade;
    private Double price_Jade;
    private Boolean demanded_Jade;

    private Integer quantity_Onyx;
    private Double price_Onyx;
    private Boolean demanded_Onyx;

    private Integer quantity_Rhodonite;
    private Double price_Rhodonite;
    private Boolean demanded_Rhodonite;

    private Integer quantity_Biopolymer;
    private Double price_Biopolymer;
    private Boolean demanded_Biopolymer;

    private Integer quantity_PAN;
    private Double price_PAN;
    private Boolean demanded_PAN;

    private Integer quantity_PMMA;
    private Double price_PMMA;
    private Boolean demanded_PMMA;

    private Integer quantity_POM;
    private Double price_POM;
    private Boolean demanded_POM;

    private Integer quantity_PTFE;
    private Double price_PTFE;
    private Boolean demanded_PTFE;


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



        this.quantity_Cattle = 0;
        this.price_Cattle = 0.0;
        this.demanded_Cattle = false;

        this.quantity_Decorative = 0;
        this.price_Decorative = 0.0;
        this.demanded_Decorative = false;

        this.quantity_Endangered = 0;
        this.price_Endangered = 0.0;
        this.demanded_Endangered = false;

        this.quantity_Experimental = 0;
        this.price_Experimental = 0.0;
        this.demanded_Expermiental = false;

        this.quantity_Skins = 0;
        this.price_Skins = 0.0;
        this.demanded_Skins = false;



        this.quantity_Accumulator = 0;
        this.price_Accumulator = 0.0;
        this.demanded_Accumulator = false;

        this.quantity_Circuit = 0;
        this.price_Circuit = 0.0;
        this.demanded_Circuit = false;

        this.quantity_Nanoelectronics = 0;
        this.price_Nanoelectronics = 0.0;
        this.demanded_Nanoelectronics = false;

        this.quantity_Photodetector = 0;
        this.price_Photodetector = 0.0;
        this.demanded_Photodetector = false;

        this.quantity_Prototype = 0;
        this.price_Prototype = 0.0;
        this.demanded_Prototype = false;



        this.quantity_ModifiedFood = 0;
        this.price_ModifiedFood = 0.0;
        this.demanded_ModifiedFood = false;

        this.quantity_NaturalFood = 0;
        this.price_NaturalFood = 0.0;
        this.demanded_NaturalFood = false;

        this.quantity_Preservatives = 0;
        this.price_Preservatives = 0.0;
        this.demanded_Preservatives = false;

        this.quantity_Spices = 0;
        this.price_Spices = 0.0;
        this.demanded_Spices = false;

        this.quantity_SyntheticFood = 0;
        this.price_SyntheticFood = 0.0;
        this.demanded_SyntheticFood = false;



        this.quantity_Antiseptics = 0;
        this.price_Antiseptics = 0.0;
        this.demanded_Antiseptics = false;

        this.quantity_Chemoterapeutics = 0;
        this.price_Chemoterapeutics = 0.0;
        this.demanded_Chemoterapeutics = false;

        this.quantity_GeneticDrugs = 0;
        this.price_GeneticsDrugs = 0.0;
        this.demanded_GeneticsDrugs = false;

        this.quantity_Radiopharmaceuticals = 0;
        this.price_Radiopharmaceuticals = 0.0;
        this.demanded_Radiopharmaceuticals = false;

        this.quantity_Vaccines = 0;
        this.price_Vaccines = 0.0;
        this.demanded_Vaccines = false;



        this.quantity_Antimatter = 0;
        this.price_Antimatter = 0.0;
        this.demanded_Antimatter = false;

        this.quantity_Iridium = 0;
        this.price_Iridium = 0.0;
        this.demanded_Iridium = false;

        this.quantity_Platinum = 0;
        this.price_Platinum = 0.0;
        this.demanded_Platinum = false;

        this.quantity_Plutonium = 0;
        this.price_Plutonium = 0.0;
        this.demanded_Plutonium = false;

        this.quantity_Titanium = 0;
        this.price_Titianium = 0.0;
        this.demanded_Titanium = false;



        this.quantity_Dioptase = 0;
        this.price_Dioptase = 0.0;
        this.demanded_Dioptase = false;

        this.quantity_Fluorite = 0;
        this.price_Fluorite = 0.0;
        this.demanded_Fluorite = false;

        this.quantity_Jade = 0;
        this.price_Jade = 0.0;
        this.demanded_Jade = false;

        this.quantity_Onyx = 0;
        this.price_Onyx = 0.0;
        this.demanded_Onyx = false;

        this.quantity_Rhodonite = 0;
        this.price_Rhodonite = 0.0;
        this.demanded_Rhodonite = false;



        this.quantity_Biopolymer = 0;
        this.price_Biopolymer = 0.0;
        this.demanded_Biopolymer = false;

        this.quantity_PAN = 0;
        this.price_PAN = 0.0;
        this.demanded_PAN = false;

        this.quantity_PMMA = 0;
        this.price_PMMA = 0.0;
        this.demanded_PMMA = false;

        this.quantity_POM = 0;
        this.price_POM = 0.0;
        this.demanded_POM = false;

        this.quantity_PTFE = 0;
        this.price_PTFE = 0.0;
        this.demanded_PTFE = false;
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
    public void createStarship() {

    }


    public Integer getQuantity_Cattle() {
        return quantity_Cattle;
    }

    public void changeQuantity_Cattle(Integer quantity_Cattle) {
        this.quantity_Cattle = quantity_Cattle;
    }

    public Double getPrice_Cattle() {
        return price_Cattle;
    }

    public void changePrice_Cattle(Double price_Cattle) {
        this.price_Cattle = price_Cattle;
    }

    public Boolean isDemanded_Cattle() {
        return demanded_Cattle;
    }

    public void setDemanded_Cattle(Boolean demanded_Cattle) {
        this.demanded_Cattle = demanded_Cattle;
    }


    public Integer getQuantity_Decorative() {
        return quantity_Decorative;
    }

    public void changeQuantity_Decorative(Integer quantity_Decorative) {
        this.quantity_Decorative = quantity_Decorative;
    }

    public Double getPrice_Decorative() {
        return price_Decorative;
    }

    public void changePrice_Decorative(Double price_Decorative) {
        this.price_Decorative = price_Decorative;
    }

    public Boolean isDemanded_Decorative() {
        return demanded_Decorative;
    }

    public void setDemanded_Decorative(Boolean demanded_Decorative) {
        this.demanded_Decorative = demanded_Decorative;
    }


    public Integer getQuantity_Endangered() {
        return quantity_Endangered;
    }

    public void changeQuantity_Endangered(Integer quantity_Endangered) {
        this.quantity_Endangered = quantity_Endangered;
    }

    public Double getPrice_Endangered() {
        return price_Endangered;
    }

    public void changePrice_Endangered(Double price_Endangered) {
        this.price_Endangered = price_Endangered;
    }

    public Boolean isDemanded_Endangered() {
        return demanded_Endangered;
    }

    public void setDemanded_Endangered(Boolean demanded_Endangered) {
        this.demanded_Endangered = demanded_Endangered;
    }


    public Integer getQuantity_Experimental() {
        return quantity_Experimental;
    }

    public void changeQuantity_Experimental(Integer quantity_Experimental) {
        this.quantity_Experimental = quantity_Experimental;
    }

    public Double getPrice_Experimental() {
        return price_Experimental;
    }

    public void changePrice_Experimental(Double price_Experimental) {
        this.price_Experimental = price_Experimental;
    }

    public Boolean isDemanded_Expermiental() {
        return demanded_Expermiental;
    }

    public void setDemanded_Expermiental(Boolean demanded_Expermiental) {
        this.demanded_Expermiental = demanded_Expermiental;
    }


    public Integer getQuantity_Skins() {
        return quantity_Skins;
    }

    public void changeQuantity_Skins(Integer quantity_Skins) {
        this.quantity_Skins = quantity_Skins;
    }

    public Double getPrice_Skins() {
        return price_Skins;
    }

    public void changePrice_Skins(Double price_Skins) {
        this.price_Skins = price_Skins;
    }

    public Boolean isDemanded_Skins() {
        return demanded_Skins;
    }

    public void setDemanded_Skins(Boolean demanded_Skins) {
        this.demanded_Skins = demanded_Skins;
    }





    public Integer getQuantity_Accumulator() {
        return quantity_Accumulator;
    }

    public void changeQuantity_Accumulator(Integer quantity_Accumulator) {
        this.quantity_Accumulator = quantity_Accumulator;
    }

    public Double getPrice_Accumulator() {
        return price_Accumulator;
    }

    public void changePrice_Accumulator(Double price_Accumulator) {
        this.price_Accumulator = price_Accumulator;
    }

    public Boolean isDemanded_Accumulator() {
        return demanded_Accumulator;
    }

    public void setDemanded_Accumulator(Boolean demanded_Accumulator) {
        this.demanded_Accumulator = demanded_Accumulator;
    }


    public Integer getQuantity_Circuit() {
        return quantity_Circuit;
    }

    public void changeQuantity_Circuit(Integer quantity_Circuit) {
        this.quantity_Circuit = quantity_Circuit;
    }

    public Double getPrice_Circuit() {
        return price_Circuit;
    }

    public void changePrice_Circuit(Double price_Circuit) {
        this.price_Circuit = price_Circuit;
    }

    public Boolean isDemanded_Circuit() {
        return demanded_Circuit;
    }

    public void setDemanded_Circuit(Boolean demanded_Circuit) {
        this.demanded_Circuit = demanded_Circuit;
    }


    public Integer getQuantity_Nanoelectronics() {
        return quantity_Nanoelectronics;
    }

    public void changeQuantity_Nanoelectronics(Integer quantity_Nanoelectronics) {
        this.quantity_Nanoelectronics = quantity_Nanoelectronics;
    }

    public Double getPrice_Nanoelectronics() {
        return price_Nanoelectronics;
    }

    public void changePrice_Nanoelectronics(Double price_Nanoelectronics) {
        this.price_Nanoelectronics = price_Nanoelectronics;
    }

    public Boolean isDemanded_Nanoelectronics() {
        return demanded_Nanoelectronics;
    }

    public void setDemanded_Nanoelectronics(Boolean demanded_Nanoelectronics) {
        this.demanded_Nanoelectronics = demanded_Nanoelectronics;
    }


    public Integer getQuantity_Photodetector() {
        return quantity_Photodetector;
    }

    public void changeQuantity_Photodetector(Integer quantity_Photodetector) {
        this.quantity_Photodetector = quantity_Photodetector;
    }

    public Double getPrice_Photodetector() {
        return price_Photodetector;
    }

    public void changePrice_Photodetector(Double price_Photodetector) {
        this.price_Photodetector = price_Photodetector;
    }

    public Boolean isDemanded_Photodetector() {
        return demanded_Photodetector;
    }

    public void setDemanded_Photodetector(Boolean demanded_Photodetector) {
        this.demanded_Photodetector = demanded_Photodetector;
    }


    public Integer getQuantity_Prototype() {
        return quantity_Prototype;
    }

    public void changeQuantity_Prototype(Integer quantity_Prototype) {
        this.quantity_Prototype = quantity_Prototype;
    }

    public Double getPrice_Prototype() {
        return price_Prototype;
    }

    public void changePrice_Prototype(Double price_Prototype) {
        this.price_Prototype = price_Prototype;
    }

    public Boolean isDemanded_Prototype() {
        return demanded_Prototype;
    }

    public void setDemanded_Prototype(Boolean demanded_Prototype) {
        this.demanded_Prototype = demanded_Prototype;
    }





    public Integer getQuantity_ModifiedFood() {
        return quantity_ModifiedFood;
    }

    public void changeQuantity_ModifiedFood(Integer quantity_ModifiedFood) {
        this.quantity_ModifiedFood = quantity_ModifiedFood;
    }

    public Double getPrice_ModifiedFood() {
        return price_ModifiedFood;
    }

    public void changePrice_ModifiedFood(Double price_ModifiedFood) {
        this.price_ModifiedFood = price_ModifiedFood;
    }

    public Boolean isDemanded_ModifiedFood() {
        return demanded_ModifiedFood;
    }

    public void setDemanded_ModifiedFood(Boolean demanded_ModifiedFood) {
        this.demanded_ModifiedFood = demanded_ModifiedFood;
    }


    public Integer getQuantity_NaturalFood() {
        return quantity_NaturalFood;
    }

    public void changeQuantity_NaturalFood(Integer quantity_NaturalFood) {
        this.quantity_NaturalFood = quantity_NaturalFood;
    }

    public Double getPrice_NaturalFood() {
        return price_NaturalFood;
    }

    public void changePrice_NaturalFood(Double price_NaturalFood) {
        this.price_NaturalFood = price_NaturalFood;
    }

    public Boolean isDemanded_NaturalFood() {
        return demanded_NaturalFood;
    }

    public void setDemanded_NaturalFood(Boolean demanded_NaturalFood) {
        this.demanded_NaturalFood = demanded_NaturalFood;
    }


    public Integer getQuantity_Preservatives() {
        return quantity_Preservatives;
    }

    public void changeQuantity_Preservatives(Integer quantity_Preservatives) {
        this.quantity_Preservatives = quantity_Preservatives;
    }

    public Double getPrice_Preservatives() {
        return price_Preservatives;
    }

    public void changePrice_Preservatives(Double price_Preservatives) {
        this.price_Preservatives = price_Preservatives;
    }

    public Boolean isDemanded_Preservatives() {
        return demanded_Preservatives;
    }

    public void setDemanded_Preservatives(Boolean demanded_Preservatives) {
        this.demanded_Preservatives = demanded_Preservatives;
    }


    public Integer getQuantity_Spices() {
        return quantity_Spices;
    }

    public void changeQuantity_Spices(Integer quantity_Spices) {
        this.quantity_Spices = quantity_Spices;
    }

    public Double getPrice_Spices() {
        return price_Spices;
    }

    public void changePrice_Spices(Double price_Spices) {
        this.price_Spices = price_Spices;
    }

    public Boolean isDemanded_Spices() {
        return demanded_Spices;
    }

    public void setDemanded_Spices(Boolean demanded_Spices) {
        this.demanded_Spices = demanded_Spices;
    }


    public Integer getQuantity_SyntheticFood() {
        return quantity_SyntheticFood;
    }

    public void changeQuantity_SyntheticFood(Integer quantity_SyntheticFood) {
        this.quantity_SyntheticFood = quantity_SyntheticFood;
    }

    public Double getPrice_SyntheticFood() {
        return price_SyntheticFood;
    }

    public void changePrice_SyntheticFood(Double price_SyntheticFood) {
        this.price_SyntheticFood = price_SyntheticFood;
    }

    public Boolean isDemanded_SyntheticFood() {
        return demanded_SyntheticFood;
    }

    public void setDemanded_SyntheticFood(Boolean demanded_SyntheticFood) {
        this.demanded_SyntheticFood = demanded_SyntheticFood;
    }





    public Integer getQuantity_Antiseptics() {
        return quantity_Antiseptics;
    }

    public void changeQuantity_Antiseptics(Integer quantity_Antiseptics) {
        this.quantity_Antiseptics = quantity_Antiseptics;
    }

    public Double getPrice_Antiseptics() {
        return price_Antiseptics;
    }

    public void changePrice_Antiseptics(Double price_Antiseptics) {
        this.price_Antiseptics = price_Antiseptics;
    }

    public Boolean isDemanded_Antiseptics() {
        return demanded_Antiseptics;
    }

    public void setDemanded_Antiseptics(Boolean demanded_Antiseptics) {
        this.demanded_Antiseptics = demanded_Antiseptics;
    }


    public Integer getQuantity_Chemoterapeutics() {
        return quantity_Chemoterapeutics;
    }

    public void changeQuantity_Chemoterapeutics(Integer quantity_Chemoterapeutics) {
        this.quantity_Chemoterapeutics = quantity_Chemoterapeutics;
    }

    public Double getPrice_Chemoterapeutics() {
        return price_Chemoterapeutics;
    }

    public void changePrice_Chemoterapeutics(Double price_Chemoterapeutics) {
        this.price_Chemoterapeutics = price_Chemoterapeutics;
    }

    public Boolean isDemanded_Chemoterapeutics() {
        return demanded_Chemoterapeutics;
    }

    public void setDemanded_Chemoterapeutics(Boolean demanded_Chemoterapeutics) {
        this.demanded_Chemoterapeutics = demanded_Chemoterapeutics;
    }


    public Integer getQuantity_GeneticDrugs() {
        return quantity_GeneticDrugs;
    }

    public void changeQuantity_GeneticDrugs(Integer quantity_GeneticDrugs) {
        this.quantity_GeneticDrugs = quantity_GeneticDrugs;
    }

    public Double getPrice_GeneticsDrugs() {
        return price_GeneticsDrugs;
    }

    public void changePrice_GeneticsDrugs(Double price_GeneticsDrugs) {
        this.price_GeneticsDrugs = price_GeneticsDrugs;
    }

    public Boolean isDemanded_GeneticsDrugs() {
        return demanded_GeneticsDrugs;
    }

    public void setDemanded_GeneticsDrugs(Boolean demanded_GeneticsDrugs) {
        this.demanded_GeneticsDrugs = demanded_GeneticsDrugs;
    }


    public Integer getQuantity_Radiopharmaceuticals() {
        return quantity_Radiopharmaceuticals;
    }

    public void changeQuantity_Radiopharmaceuticals(Integer quantity_Radiopharmaceuticals) {
        this.quantity_Radiopharmaceuticals = quantity_Radiopharmaceuticals;
    }

    public Double getPrice_Radiopharmaceuticals() {
        return price_Radiopharmaceuticals;
    }

    public void changePrice_Radiopharmaceuticals(Double price_Radiopharmaceuticals) {
        this.price_Radiopharmaceuticals = price_Radiopharmaceuticals;
    }

    public Boolean isDemanded_Radiopharmaceuticals() {
        return demanded_Radiopharmaceuticals;
    }

    public void setDemanded_Radiopharmaceuticals(Boolean demanded_Radiopharmaceuticals) {
        this.demanded_Radiopharmaceuticals = demanded_Radiopharmaceuticals;
    }


    public Integer getQuantity_Vaccines() {
        return quantity_Vaccines;
    }

    public void changeQuantity_Vaccines(Integer quantity_Vaccines) {
        this.quantity_Vaccines = quantity_Vaccines;
    }

    public Double getPrice_Vaccines() {
        return price_Vaccines;
    }

    public void changePrice_Vaccines(Double price_Vaccines) {
        this.price_Vaccines = price_Vaccines;
    }

    public Boolean isDemanded_Vaccines() {
        return demanded_Vaccines;
    }

    public void setDemanded_Vaccines(Boolean demanded_Vaccines) {
        this.demanded_Vaccines = demanded_Vaccines;
    }





    public Integer getQuantity_Antimatter() {
        return quantity_Antimatter;
    }

    public void changeQuantity_Antimatter(Integer quantity_Antimatter) {
        this.quantity_Antimatter = quantity_Antimatter;
    }

    public Double getPrice_Antimatter() {
        return price_Antimatter;
    }

    public void changePrice_Antimatter(Double price_Antimatter) {
        this.price_Antimatter = price_Antimatter;
    }

    public Boolean isDemanded_Antimatter() {
        return demanded_Antimatter;
    }

    public void setDemanded_Antimatter(Boolean demanded_Antimatter) {
        this.demanded_Antimatter = demanded_Antimatter;
    }


    public Integer getQuantity_Iridium() {
        return quantity_Iridium;
    }

    public void changeQuantity_Iridium(Integer quantity_Iridium) {
        this.quantity_Iridium = quantity_Iridium;
    }

    public Double getPrice_Iridium() {
        return price_Iridium;
    }

    public void changePrice_Iridium(Double price_Iridium) {
        this.price_Iridium = price_Iridium;
    }

    public Boolean isDemanded_Iridium() {
        return demanded_Iridium;
    }

    public void setDemanded_Iridium(Boolean demanded_Iridium) {
        this.demanded_Iridium = demanded_Iridium;
    }


    public Integer getQuantity_Platinum() {
        return quantity_Platinum;
    }

    public void changeQuantity_Platinum(Integer quantity_Platinum) {
        this.quantity_Platinum = quantity_Platinum;
    }

    public Double getPrice_Platinum() {
        return price_Platinum;
    }

    public void changePrice_Platinum(Double price_Platinum) {
        this.price_Platinum = price_Platinum;
    }

    public Boolean isDemanded_Platinum() {
        return demanded_Platinum;
    }

    public void setDemanded_Platinum(Boolean demanded_Platinum) {
        this.demanded_Platinum = demanded_Platinum;
    }


    public Integer getQuantity_Plutonium() {
        return quantity_Plutonium;
    }

    public void changeQuantity_Plutonium(Integer quantity_Plutonium) {
        this.quantity_Plutonium = quantity_Plutonium;
    }

    public Double getPrice_Plutonium() {
        return price_Plutonium;
    }

    public void changePrice_Plutonium(Double price_Plutonium) {
        this.price_Plutonium = price_Plutonium;
    }

    public Boolean isDemanded_Plutonium() {
        return demanded_Plutonium;
    }

    public void setDemanded_Plutonium(Boolean demanded_Plutonium) {
        this.demanded_Plutonium = demanded_Plutonium;
    }


    public Integer getQuantity_Titanium() {
        return quantity_Titanium;
    }

    public void changeQuantity_Titanium(Integer quantity_Titanium) {
        this.quantity_Titanium = quantity_Titanium;
    }

    public Double getPrice_Titianium() {
        return price_Titianium;
    }

    public void changePrice_Titianium(Double price_Titianium) {
        this.price_Titianium = price_Titianium;
    }

    public Boolean isDemanded_Titanium() {
        return demanded_Titanium;
    }

    public void setDemanded_Titanium(Boolean demanded_Titanium) {
        this.demanded_Titanium = demanded_Titanium;
    }





    public Integer getQuantity_Dioptase() {
        return quantity_Dioptase;
    }

    public void changeQuantity_Dioptase(Integer quantity_Dioptase) {
        this.quantity_Dioptase = quantity_Dioptase;
    }

    public Double getPrice_Dioptase() {
        return price_Dioptase;
    }

    public void changePrice_Dioptase(Double price_Dioptase) {
        this.price_Dioptase = price_Dioptase;
    }

    public Boolean isDemanded_Dioptase() {
        return demanded_Dioptase;
    }

    public void setDemanded_Dioptase(Boolean demanded_Dioptase) {
        this.demanded_Dioptase = demanded_Dioptase;
    }


    public Integer getQuantity_Fluorite() {
        return quantity_Fluorite;
    }

    public void changeQuantity_Fluorite(Integer quantity_Fluorite) {
        this.quantity_Fluorite = quantity_Fluorite;
    }

    public Double getPrice_Fluorite() {
        return price_Fluorite;
    }

    public void changePrice_Fluorite(Double price_Fluorite) {
        this.price_Fluorite = price_Fluorite;
    }

    public Boolean isDemanded_Fluorite() {
        return demanded_Fluorite;
    }

    public void setDemanded_Fluorite(Boolean demanded_Fluorite) {
        this.demanded_Fluorite = demanded_Fluorite;
    }


    public Integer getQuantity_Jade() {
        return quantity_Jade;
    }

    public void changeQuantity_Jade(Integer quantity_Jade) {
        this.quantity_Jade = quantity_Jade;
    }

    public Double getPrice_Jade() {
        return price_Jade;
    }

    public void changePrice_Jade(Double price_Jade) {
        this.price_Jade = price_Jade;
    }

    public Boolean isDemanded_Jade() {
        return demanded_Jade;
    }

    public void setDemanded_Jade(Boolean demanded_Jade) {
        this.demanded_Jade = demanded_Jade;
    }


    public Integer getQuantity_Onyx() {
        return quantity_Onyx;
    }

    public void changeQuantity_Onyx(Integer quantity_Onyx) {
        this.quantity_Onyx = quantity_Onyx;
    }

    public Double getPrice_Onyx() {
        return price_Onyx;
    }

    public void chnagePrice_Onyx(Double price_Onyx) {
        this.price_Onyx = price_Onyx;
    }

    public Boolean isDemanded_Onyx() {
        return demanded_Onyx;
    }

    public void setDemanded_Onyx(Boolean demanded_Onyx) {
        this.demanded_Onyx = demanded_Onyx;
    }


    public Integer getQuantity_Rhodonite() {
        return quantity_Rhodonite;
    }

    public void changeQuantity_Rhodonite(Integer quantity_Rhodonite) {
        this.quantity_Rhodonite = quantity_Rhodonite;
    }

    public Double getPrice_Rhodonite() {
        return price_Rhodonite;
    }

    public void changePrice_Rhodonite(Double price_Rhodonite) {
        this.price_Rhodonite = price_Rhodonite;
    }

    public Boolean isDemanded_Rhodonite() {
        return demanded_Rhodonite;
    }

    public void setDemanded_Rhodonite(Boolean demanded_Rhodonite) {
        this.demanded_Rhodonite = demanded_Rhodonite;
    }





    public Integer getQuantity_Biopolymer() {
        return quantity_Biopolymer;
    }

    public void changeQuantity_Biopolymer(Integer quantity_Biopolymer) {
        this.quantity_Biopolymer = quantity_Biopolymer;
    }

    public Double getPrice_Biopolymer() {
        return price_Biopolymer;
    }

    public void changePrice_Biopolymer(Double price_Biopolymer) {
        this.price_Biopolymer = price_Biopolymer;
    }

    public Boolean isDemanded_Biopolymer() {
        return demanded_Biopolymer;
    }

    public void setDemanded_Biopolymer(Boolean demanded_Biopolymer) {
        this.demanded_Biopolymer = demanded_Biopolymer;
    }


    public Integer getQuantity_PAN() {
        return quantity_PAN;
    }

    public void changeQuantity_PAN(Integer quantity_PAN) {
        this.quantity_PAN = quantity_PAN;
    }

    public Double getPrice_PAN() {
        return price_PAN;
    }

    public void changePrice_PAN(Double price_PAN) {
        this.price_PAN = price_PAN;
    }

    public Boolean isDemanded_PAN() {
        return demanded_PAN;
    }

    public void setDemanded_PAN(Boolean demanded_PAN) {
        this.demanded_PAN = demanded_PAN;
    }


    public Integer getQuantity_PMMA() {
        return quantity_PMMA;
    }

    public void changeQuantity_PMMA(Integer quantity_PMMA) {
        this.quantity_PMMA = quantity_PMMA;
    }

    public Double getPrice_PMMA() {
        return price_PMMA;
    }

    public void changePrice_PMMA(Double price_PMMA) {
        this.price_PMMA = price_PMMA;
    }

    public Boolean isDemanded_PMMA() {
        return demanded_PMMA;
    }

    public void setDemanded_PMMA(Boolean demanded_PMMA) {
        this.demanded_PMMA = demanded_PMMA;
    }


    public Integer getQuantity_POM() {
        return quantity_POM;
    }

    public void changeQuantity_POM(Integer quantity_POM) {
        this.quantity_POM = quantity_POM;
    }

    public Double getPrice_POM() {
        return price_POM;
    }

    public void changePrice_POM(Double price_POM) {
        this.price_POM = price_POM;
    }

    public Boolean isDemanded_POM() {
        return demanded_POM;
    }

    public void setDemanded_POM(Boolean demanded_POM) {
        this.demanded_POM = demanded_POM;
    }


    public Integer getQuantity_PTFE() {
        return quantity_PTFE;
    }

    public void changeQuantity_PTFE(Integer quantity_PTFE) {
        this.quantity_PTFE = quantity_PTFE;
    }

    public Double getPrice_PTFE() {
        return price_PTFE;
    }

    public void changePrice_PTFE(Double price_PTFE) {
        this.price_PTFE = price_PTFE;
    }

    public Boolean isDemanded_PTFE() {
        return demanded_PTFE;
    }

    public void setDemanded_PTFE(Boolean demanded_PTFE) {
        this.demanded_PTFE = demanded_PTFE;
    }
}
