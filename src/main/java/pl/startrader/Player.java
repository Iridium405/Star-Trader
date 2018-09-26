package pl.startrader;

import pl.startrader.model.starship.Starship;

import java.util.ArrayList;
import java.util.List;

public class Player {

    private static Player instance;

    private String name;
    private String companyName;
    private Double accountBalance;

    private Integer criminalConnections;
    private Integer politicalConnections;
    private Integer economicConnections;

    private Integer overallReputation;

    private List<Starship> shipList;
    private List<Message> inbox;
    private List<Integer> diceRolls;

    private Player() {
        this.name = "";
        this.companyName = "";
        this.accountBalance = 300.0;
        this.criminalConnections = 0;
        this.politicalConnections = 0;
        this.economicConnections = 0;
        this.overallReputation = 20;
        this.shipList = new ArrayList<Starship>();
        this.inbox = new ArrayList<Message>();
        this.diceRolls = new ArrayList<Integer>();
    }

    public static synchronized Player getInstance() {
        if(instance == null) {
            instance = new Player();
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

    public void setAccountBalance(Double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public Integer getCriminalConnections() {
        return criminalConnections;
    }

    public void setCriminalConnections(Integer criminalConnections) {
        this.criminalConnections = criminalConnections;
    }

    public Integer getPoliticalConnections() {
        return politicalConnections;
    }

    public void setPoliticalConnections(Integer politicalConnections) {
        this.politicalConnections = politicalConnections;
    }

    public Integer getEconomicConnections() {
        return economicConnections;
    }

    public void setEconomicConnections(Integer economicConnections) {
        this.economicConnections = economicConnections;
    }

    public Integer getOverallReputation() {
        return overallReputation;
    }

    public void setOverallReputation(Integer overallReputation) {
        this.overallReputation = overallReputation;
    }

    public List<Starship> getShipList() {
        return shipList;
    }

    public List<Message> getInbox() {
        return inbox;
    }

    public List<Integer> getDiceRolls() {
        return diceRolls;
    }

    public void addDiceRoll(Integer numberOfSides) {
        diceRolls.clear();
        diceRolls.add(Dice.getInstance().throwDice(numberOfSides));
    }

    public void addMultipleDiceRolls(Integer rolls, Integer numberOfSides) {
        diceRolls.clear();
        for(int roll = 1; roll <= rolls; roll++) {
            diceRolls.add(Dice.getInstance().throwDice(numberOfSides));
        }
    }
}