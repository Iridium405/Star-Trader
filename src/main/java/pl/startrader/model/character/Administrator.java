package pl.startrader.model.character;

public class Administrator extends Character {


    private Integer portClassMod;
    private Integer securityMod;
    private Integer militaryPowerMod;

    public Administrator(String name, Integer criminalConnections, Integer politicalConnections, Integer economicConnections) {
        super(name, Role.ADMINISTRATOR, criminalConnections, politicalConnections, economicConnections);
    }


}
