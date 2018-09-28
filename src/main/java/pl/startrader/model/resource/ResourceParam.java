package pl.startrader.model.resource;

import static pl.startrader.model.resource.ResourceType.*;

public enum ResourceParam {

    CETTLE          ("Cettle", ANIMAL),
    EXPERIMENTAL    ("Experimental subjects", ANIMAL),
    DECORATIVE      ("Decorative animals", ANIMAL),
    FURS            ("Skins and Furs", ANIMAL),
    ENDANGERED      ("Endangered species", ANIMAL),

    ACCUMULATOR     ("Accumulator", COMPONENT),
    CIRCUIT         ("Circuit", COMPONENT),
    NANOELECTRONICS ("Nanoelectronics", COMPONENT),
    PHOTODETECTOR   ("Photodetector", COMPONENT),
    PROTOTYPE       ("Prototype", COMPONENT),

    NATURAL         ("Natural food", FOOD),
    MODIFIED        ("Modified food", FOOD),
    SYNTETIC        ("Syntetic food", FOOD),
    SPIECES         ("Spieces", FOOD),
    PRESERVATIVES   ("Preservatives", FOOD),

    ANTISEPTICS             ("Antiseptics", MEDICINE),
    CHEMOTHERAPEUTICS       ("Chemotherapeutics", MEDICINE),
    GENETICDRUGS            ("Genetic Drugs", MEDICINE),
    RADIOPHARMACEUTICALS    ("Radiopharmaceuticals", MEDICINE),
    VACCINES                ("Vaccines", MEDICINE),

    ANTIMATTER  ("Antimatter", METAL),
    IRIDIUM     ("Iridium", METAL),
    PLATINUM    ("Platinum", METAL),
    PLUTONIUM   ("Plutonium", METAL),
    TITANIUM    ("Titanium", METAL),

    DIOPTASE    ("Dioptase", MINERAL),
    FLUORITE    ("Fluorite", MINERAL),
    JADE        ("Jade", MINERAL),
    ONYX        ("Onyx", MINERAL),
    RHODONITE   ("Rhodonite", MINERAL),

    BIOPOLYMER  ("Biopolymer", POLYMER),
    PAN         ("PAN", POLYMER),
    PMMA        ("PMMA", POLYMER),
    POM         ("POM", POLYMER),
    PTFE        ("PTFE", POLYMER);


    private String name;
    private ResourceType type;

    ResourceParam(String name, ResourceType type){
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public ResourceType getType() {
        return type;
    }
}
