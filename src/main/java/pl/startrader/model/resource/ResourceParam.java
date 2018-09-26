package pl.startrader.model.resource;

public enum ResourceParam {

    ACCUMULATOR         ("Accumulator", ResourceType.COMPONENT),
    CIRCUIT             ("Circuit", ResourceType.COMPONENT),
    NANOELECTRONICS     ("Nanoelectronics", ResourceType.COMPONENT),
    PHOTODETECTOR       ("Photodetector", ResourceType.COMPONENT),
    PROTOTYPE           ("Prototype", ResourceType.COMPONENT),

    ANTISEPTICS         ("Antiseptics", ResourceType.MEDICINE),
    CHEMOTHERAPEUTICS   ("Chemotherapeutics", ResourceType.MEDICINE),
    GENETICDRUGS        ("Genetic Drugs", ResourceType.MEDICINE),
    RADIOPHARMACEUTICALS("Radiopharmaceuticals", ResourceType.MEDICINE),
    VACCINES            ("Vaccines", ResourceType.MEDICINE),

    ANTIMATTER          ("Antimatter", ResourceType.METAL),
    IRIDIUM             ("Iridium", ResourceType.METAL),
    PLATINUM            ("Platinum", ResourceType.METAL),
    PLUTONIUM           ("Plutonium", ResourceType.METAL),
    TITANIUM            ("Titanium", ResourceType.METAL),

    DIOPTASE            ("Dioptase", ResourceType.MINERAL),
    FLUORITE            ("Fluorite", ResourceType.MINERAL),
    JADE                ("Jade", ResourceType.MINERAL),
    ONYX                ("Onyx", ResourceType.MINERAL),
    RHODONITE           ("Rhodonite", ResourceType.MINERAL),

    BIOPOLYMER          ("Biopolymer", ResourceType.POLYMER),
    PAN                 ("PAN", ResourceType.POLYMER),
    PMMA                ("PMMA", ResourceType.POLYMER),
    POM                 ("POM", ResourceType.POLYMER),
    PTFE                ("PTFE", ResourceType.POLYMER);


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
