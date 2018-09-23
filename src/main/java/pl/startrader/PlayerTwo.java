package pl.startrader;

import pl.startrader.model.starship.Starship;

import java.util.ArrayList;
import java.util.List;

public class PlayerTwo {

    private static PlayerTwo instance;

    private String name;
    private String companyName;
    private Double accountBalance;

    private Integer criminalConnections;
    private Integer politicalConnections;
    private Integer economicConnections;

    private Integer overallReputation;

    private List<Starship> shipList;
    private List<Message> inbox;

    private PlayerTwo() {
        this.name = "";
        this.companyName = "";
        this.accountBalance = 300.0;
        this.criminalConnections = 0;
        this.politicalConnections = 0;
        this.economicConnections = 0;
        this.overallReputation = 20;
        this.shipList = new ArrayList<Starship>();
        this.inbox = new ArrayList<Message>();
    }

    public static synchronized PlayerTwo getPlayerTwo() {
        if(instance == null) {
            instance = new PlayerTwo();
        }

        return instance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Double getAccountBalance() {
        return accountBalance;
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

    public Integer getOverallReputation() {
        return overallReputation;
    }

    public List<Starship> getShipList() {
        return shipList;
    }

    public List<Message> getInbox() {
        return inbox;
    }
}
