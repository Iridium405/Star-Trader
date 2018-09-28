package pl.startrader.model.resource;

import static pl.startrader.model.resource.ResourceType.*;

public enum ResourceParam {

    CATTLE          ("Cattle", ANIMAL, 2),
    DECORATIVE      ("Decorative animals", ANIMAL, 1),
    ENDANGERED      ("Endangered species", ANIMAL, 2),
    EXPERIMENTAL    ("Experimental subjects", ANIMAL, 2),
    SKINS           ("Skins and Furs", ANIMAL, 1),

    ACCUMULATOR     ("Accumulator", COMPONENT, 1),
    CIRCUIT         ("Circuit", COMPONENT, 0),
    NANOELECTRONICS ("Nanoelectronics", COMPONENT, 0),
    PHOTODETECTOR   ("Photodetector", COMPONENT, 0),
    PROTOTYPE       ("Prototype", COMPONENT, 1),

    MODIFIED        ("Modified food", FOOD, 0),
    NATURAL         ("Natural food", FOOD, 0),
    PRESERVATIVES   ("Preservatives", FOOD, 0),
    SPICES          ("Spices", FOOD, 0),
    SYNTHETIC       ("Synthetic food", FOOD, 0),

    ANTISEPTICS             ("Antiseptics", MEDICINE, 0),
    CHEMOTHERAPEUTICS       ("Chemotherapeutics", MEDICINE, 0),
    GENETIC_DRUGS           ("Genetic Drugs", MEDICINE, 0),
    RADIOPHARMACEUTICALS    ("Radiopharmaceuticals", MEDICINE, 0),
    VACCINES                ("Vaccines", MEDICINE, 0),

    ANTIMATTER  ("Antimatter", METAL, 4),
    IRIDIUM     ("Iridium", METAL, 1),
    PLATINUM    ("Platinum", METAL, 1),
    PLUTONIUM   ("Plutonium", METAL, 1),
    TITANIUM    ("Titanium", METAL, 1),

    DIOPTASE    ("Dioptase", MINERAL, 1),
    FLUORITE    ("Fluorite", MINERAL, 1),
    JADE        ("Jade", MINERAL, 1),
    ONYX        ("Onyx", MINERAL, 1),
    RHODONITE   ("Rhodonite", MINERAL, 1),

    BIOPOLYMER  ("Biopolymer", POLYMER, 0),
    PAN         ("PAN", POLYMER, 1),
    PMMA        ("PMMA", POLYMER, 1),
    POM         ("POM", POLYMER, 1),
    PTFE        ("PTFE", POLYMER, 1);


    private String name;
    private ResourceType type;
    private Integer occupiedSpace;
    private Integer productionDifficulty;



    ResourceParam(String name, ResourceType type, Integer occupiedSpace){
        this.name = name;
        this.type = type;
        this.occupiedSpace = occupiedSpace;
    }



    public String getName() {
        return name;
    }

    public ResourceType getType() {
        return type;
    }

    public Integer getOccupiedSpace() {
        return occupiedSpace;
    }
}
