package pl.startrader.model.character;

public abstract class Character {

    private String name;
    private Role role;
    private Integer criminalConnections;
    private Integer politicalConnections;
    private Integer economicConnections;

    public Character(String name, Role role, Integer criminalConnections, Integer politicalConnections, Integer economicConnections) {
        this.name = name;
        this.role = role;
        this.criminalConnections = criminalConnections;
        this.politicalConnections = politicalConnections;
        this.economicConnections = economicConnections;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
