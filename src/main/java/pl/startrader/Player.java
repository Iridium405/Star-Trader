package pl.startrader;

import pl.startrader.model.heavenly_body.HeavenlyBody;
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


    //TODO: Change reputation system - make it as a Planet field(?).
    private Integer reputationGammaLeporis;
    private Integer reputationEpsilonEridani;
    private Integer reputationTauCeti;
    private Integer reputationBetaHydri;
    private Integer reputationSigmaDraconis;
    private Integer reputationMuHerculis;
    private Integer reputationLambdaArietis;
    private Integer reputationThetaTauri;
    private Integer reputationAlphaVolantis;

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

        this.reputationGammaLeporis = 50;
        this.reputationEpsilonEridani = 50;
        this.reputationTauCeti = 50;
        this.reputationBetaHydri = 50;
        this.reputationSigmaDraconis = 50;
        this.reputationMuHerculis = 50;
        this.reputationLambdaArietis = 50;
        this.reputationThetaTauri = 50;
        this.reputationAlphaVolantis = 50;

        this.shipList = new ArrayList<>();
        this.inbox = new ArrayList<>();
        this.diceRolls = new ArrayList<>();
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
        return Math.round(this.accountBalance*100)/100.0d;
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



    public Integer getReputationGammaLeporis() {
        return reputationGammaLeporis;
    }

    public Integer getReputationEpsilonEridani() {
        return reputationEpsilonEridani;
    }

    public Integer getReputationTauCeti() {
        return reputationTauCeti;
    }

    public Integer getReputationBetaHydri() {
        return reputationBetaHydri;
    }

    public Integer getReputationSigmaDraconis() {
        return reputationSigmaDraconis;
    }

    public Integer getReputationMuHerculis() {
        return reputationMuHerculis;
    }

    public Integer getReputationLambdaArietis() {
        return reputationLambdaArietis;
    }

    public Integer getReputationThetaTauri() {
        return reputationThetaTauri;
    }

    public Integer getReputationAlphaVolantis() {
        return reputationAlphaVolantis;
    }


    //TODO
    public void changeReputation(HeavenlyBody planet, Integer change) {

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
