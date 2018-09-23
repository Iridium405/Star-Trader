package pl.startrader;

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

    public int throwDice (int numberOfSides){
        Random dice = new Random();
        return dice.nextInt(numberOfSides) +1;
    }
}
