package pl.startrader.model.character;

public class Character {

    private Role role;
    private Integer criminalConnections;
    private Integer politicalConnections;
    private Integer economicConnections;

    public Character(Role role, Integer criminalConnections, Integer politicalConnections, Integer economicConnections) {
        this.role = role;
        this.criminalConnections = criminalConnections;
        this.politicalConnections = politicalConnections;
        this.economicConnections = economicConnections;
    }

    public Role getRole() {
        return role;
    }

    public Integer getCriminalConnections() {
        return criminalConnections;
    }

    public Integer getPoliticalConnections() {
        return politicalConnections;
    }

    public Integer getEconomicConnections() {
        return economicConnections;
    }

    @Override
    public String toString() {
        return "\nThis character is " + role + " with connections:\n" +
                "Criminal: " + getCriminalConnections() + " | " +
                "Political: " + getPoliticalConnections() + " | " +
                "Economic: " + getEconomicConnections();
    }
}
