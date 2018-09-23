package pl.startrader.model.starship;

public enum CrewClass {

    S(+5),
    A(+3),
    B(+2),
    C(+1),
    D(0),
    E(-1);

    private Integer skillModifier;

    CrewClass(Integer skillModifier) {
        this.skillModifier = skillModifier;
    }
}
