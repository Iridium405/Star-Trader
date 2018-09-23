package pl.startrader;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Dice {

    private static Dice instance;

    private Dice(){}

    public static synchronized Dice getDice() {
        if(instance == null) {
            instance = new Dice();
        }

        return instance;
    }


    public Integer throwDice (Integer numberOfSides){
        Random dice = new Random();
        try {
            return dice.nextInt(numberOfSides) +1;
        } catch (IllegalArgumentException ex) {
            System.out.println("Number of sides must be above 0.");
            return null;
        }
    }


    public Integer throwModifiedDice (Integer numberOfSides, Integer modification, boolean bordered) {
        Integer diceRoll = throwDice(numberOfSides);
        System.out.println(diceRoll);

        if(!bordered) {
            return diceRoll + modification;
        } else {
            if((diceRoll+modification) > 0) {
                return diceRoll + modification;
            } else {
                return 1;
            }
        }
    }


    public List<Integer> throwMultipleDices (int rolls, int numberOfSides ) {
        List<Integer> rollsList = new ArrayList<Integer>();
        for (int roll = 1; roll <= rolls; roll++) {
            Integer diceRoll = throwDice(numberOfSides);
            rollsList.add(diceRoll);
        }
        return rollsList;
    }
}
