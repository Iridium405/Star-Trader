package pl.startrader.model.starship;

public enum CrewClass {

    U   (+5,  30,   5.0,    15.0),
    A   (+3,  25,   4.0,    11.0),
    B   (+2,  20,   3.0,    7.0),
    C   (+1,  15,   2.0,    4.0),
    D   (0,   10,   1.0,    2.0),
    E   (-1,  5,    0.5,    1.0);


    private Integer skillModifier;
    private Integer maxLevel;
    private Double minSalary;
    private Double minTravelBonus;



    CrewClass(Integer skillModifier, Integer maxLevel, Double minSalary, Double minTravelBonus) {
        this.skillModifier = skillModifier;
        this.maxLevel = maxLevel;
        this.minSalary = minSalary;
        this.minTravelBonus = minTravelBonus;
    }

    public Integer getSkillModifier() {
        return skillModifier;
    }

    public Integer getMaxLevel() {
        return maxLevel;
    }

    public Double getMinSalary() {
        return minSalary;
    }

    public Double getMinTravelBonus() {
        return minTravelBonus;
    }
}
