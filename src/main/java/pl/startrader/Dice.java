package pl.startrader;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Dice {

    private static Dice instance;

    private Dice(){}

    public static synchronized Dice getInstance() {
        if(instance == null) {
            instance = new Dice();
        }

        return instance;
    }


    public Integer throwDice (Integer numberOfSides){
        ThreadLocalRandom dice = ThreadLocalRandom.current();
        try {
            return dice.nextInt(numberOfSides) +1;
        } catch (IllegalArgumentException ex) {
            System.out.println("Number of sides must be above 0.");
            return null;
        }
    }


    public Integer throwDoubleBorderedDice (int bottomBorder, int topBorder) {
        ThreadLocalRandom dice = ThreadLocalRandom.current();
        try {
            return dice.nextInt(bottomBorder, topBorder + 1);
        } catch (IllegalArgumentException ex) {
            System.out.println("Number of sides must be above 0.");
            return null;
        }
    }



    /**
     *
     * @param   numberOfSides   an Integer representing number of sides of the dice. Must be positive.
     * @param   modification    modified value of the throw. Must be a natural number.
     * @param   bounded         if true, the lowest value after modification can be 1.
     *                          If false, the result can go below 1.
     *
     * @return  an Integer value after modification of the single throw.
     *
     */
    public Integer throwModifiedDice (Integer numberOfSides, Integer modification, boolean bounded) {
        Integer diceRoll = throwDice(numberOfSides);
        System.out.println(diceRoll);

        if(!bounded) {
            return diceRoll + modification;
        } else {
            if((diceRoll + modification) > 0) {
                return diceRoll + modification;
            } else {
                return 1;
            }
        }
    }



    /**
     *
     * @param   rolls           an Integer representing how many dice rolls will be made.
     * @param   numberOfSides   an Integer representing number of sides of the dice. Must be positive.
     *
     * @return  ArrayList containing all throws made by single method usage.
     *
     */
    public List<Integer> throwMultipleDices (Integer rolls, Integer numberOfSides ) {
        List<Integer> rollsList = new ArrayList();
        for (Integer roll = 1; roll <= rolls; roll++) {
            Integer diceRoll = throwDice(numberOfSides);
            rollsList.add(diceRoll);
        }
        return rollsList;
    }

}
