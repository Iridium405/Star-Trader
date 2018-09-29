package pl.startrader.model.starship;

import static pl.startrader.model.starship.CrewClass.*;
import static pl.startrader.model.starship.HullSize.*;

public enum HullType {

    PICCOLO     ("Piccolo", E, 1, 1, XS, 5),
    CLARINET    ("Clarinet", E, 1, 1, S, 10),
    VIOLIN      ("Violin", D, 1, 2, S, 14),
    HARP        ("Harp", D, 1, 3, S, 18),
    STINGRAY    ("Stingray", C, 2, 5, M, 20);



    private String name;
    private CrewClass minimumCrewClass;
    private Integer minCrewMembers;
    private Integer maxCrewMembers;
    private HullSize hullSize;
    private Integer moduleCapacity;


    HullType(String name, CrewClass minimumCrewClass, Integer minCrewMembers, Integer maxCrewMembers,
             HullSize hullSize, Integer moduleCapacity) {
        this.name = name;
        this.minimumCrewClass = minimumCrewClass;
        this.minCrewMembers = minCrewMembers;
        this.maxCrewMembers = maxCrewMembers;
        this.hullSize = hullSize;
        this.moduleCapacity = moduleCapacity;
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
}
