package com.pluralsight;

public class RollDiceApp {
    public static void main(String[] args) {

        Dice dice = new Dice();// created instance of Dice named dice

        //create counters for rolls of 2, 4, 6, and 7
        int twoCounter = 0;
        int fourCounter = 0;
        int sixCounter = 0;
        int sevenCounter = 0;

        //for loop to loop 100times
        for (int i = 1; i <= 100 ; i++) {

            //rolls the dice.
            int roll1 = dice.roll(1, 6);
            int roll2 = dice.roll(1, 6);

            int sum = roll1 + roll2; //sums of the dice

            //sout the result.
            System.out.println("Roll 1 " + i + roll1 + "Roll 2 " + roll2 + "sum = " + sum);
        }

    }
}
