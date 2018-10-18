package pl.startrader.model.starship;

import static pl.startrader.model.starship.CrewClass.*;
import static pl.startrader.model.starship.HullSize.*;

public enum HullType {

    PICCOLO     ("Piccolo",     E, 1, 1,    XS,     5,      15),
    CLARINET    ("Clarinet",    E, 1, 1,    S,      10,     20),
    VIOLIN      ("Violin",      E, 1, 2,    S,      14,     20),
    HARP        ("Harp",        E, 1, 3,    S,      18,     20),
    STINGRAY    ("Stingray",    E, 2, 5,    M,      20,     35),
    HARMONY     ("Harmony",     E, 2, 4,    M,      24,     25),
    CLAW        ("Claw",        D, 3, 7,    L,      32,     40),
    FANG        ("Fang",        D, 5, 8,    XL,     50,     60),
    GARGOYLE    ("Gargoyle",    C, 7, 12,   XXL,    80,    100);



    private String name;

    private CrewClass minimumCrewClass;
    private Integer minCrewMembers;
    private Integer maxCrewMembers;

    private HullSize hullSize;
    private Integer moduleCapacity;
    private Integer durability;



    HullType(String name, CrewClass minimumCrewClass, Integer minCrewMembers, Integer maxCrewMembers,
             HullSize hullSize, Integer moduleCapacity, Integer durability) {
        this.name = name;

        this.minimumCrewClass = minimumCrewClass;
        this.minCrewMembers = minCrewMembers;
        this.maxCrewMembers = maxCrewMembers;

        this.hullSize = hullSize;
        this.moduleCapacity = moduleCapacity;
        this.durability = durability;
    }



    public String getName() {
        return name;
    }

    public CrewClass getMinimumCrewClass() {
        return minimumCrewClass;
    }

    public Integer getMinCrewMembers() {
        return minCrewMembers;
    }

    public Integer getMaxCrewMembers() {
        return maxCrewMembers;
    }

    public HullSize getHullSize() {
        return hullSize;
    }

    public Integer getModuleCapacity() {
        return moduleCapacity;
    }

    public Integer getDurability() {
        return durability;
    }
}
