package pl.startrader.model.character;

public class Spy extends Character {


    private Integer hullDurabilityMod;
    private Integer portClassMod;
    private Integer securityMod;
    private Integer militaryPowerMod;
    private Integer flightMod;
    private Boolean active;

    public Spy(String name, Integer criminalConnections, Integer politicalConnections, Integer economicConnections) {
        super(name, Role.SPY, criminalConnections, politicalConnections, economicConnections);
    }
}
