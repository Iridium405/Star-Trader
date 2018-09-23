package pl.startrader.model.starship;

public enum HullType {

    CLARINET("Clarinet", CrewClass.E, 1, 1, 10),
    VIOLIN("Violin", CrewClass.D, 1, 1, 14),
    HARP("Harp", CrewClass.D, 2, 3, 16);

    private String name;
    private CrewClass minimumCrewSkill;
    private Integer minimumCrewSquads;
    private Integer maximumCrewSquads;
    private Integer capacity;

    HullType(String name, CrewClass minimumCrewSkill, Integer minimumCrewSquads, Integer maximumCrewSquads, Integer capacity) {
        this.name = name;
        this.minimumCrewSkill = minimumCrewSkill;
        this.minimumCrewSquads = minimumCrewSquads;
        this.maximumCrewSquads = maximumCrewSquads;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public CrewClass getMinimumCrewSkill() {
        return minimumCrewSkill;
    }

    public Integer getMinimumCrewSquads() {
        return minimumCrewSquads;
    }

    public Integer getMaximumCrewSquads() {
        return maximumCrewSquads;
    }

    public Integer getCapacity() {
        return capacity;
    }
}
