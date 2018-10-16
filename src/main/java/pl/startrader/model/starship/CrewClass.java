package pl.startrader.model.starship;

public enum CrewClass {

    U   (+5,  30),
    A   (+3,  25),
    B   (+2,  20),
    C   (+1,  15),
    D   (0,   10),
    E   (-1,  5);


    private Integer skillModifier;
    private Integer maxLevel;

    CrewClass(Integer skillModifier, Integer maxLevel) {
        this.skillModifier = skillModifier;
        this.maxLevel = maxLevel;
    }

    public Integer getSkillModifier() {
        return skillModifier;
    }

    public Integer getMaxLevel() {
        return maxLevel;
    }
}
