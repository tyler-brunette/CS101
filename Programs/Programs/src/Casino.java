// This program was completed on 8/8/2021 by Tyler Brunette
import java.util.*;

public class Casino {
    static Scanner scan = new Scanner(System.in);

    // Declare the constants of the program
    static final double MIN_AMT = 100.00;
    static final int DOLLAR_CENTS = 100;
    static final int HALF_DOLLAR_CENTS = 50;
    static final int DIME_CENTS = 10;
    static final int NICKEL_CENTS = 5;
    static final int PENNY_CENTS = 1;

    public static void main(String[] args) {

        // Declare the variables to use in the program
        float total;
        double winnings;
        long cents;
        int dollar = 0;
        int halfDollar = 0;
        int dime = 0;
        int nickel = 0;
        int penny;

        // Define the rules for the program and request user input
        System.out.printf("%s%.2f %n", "The minimum amount of winnings to use this machine is $", MIN_AMT);
        System.out.println("How much of your winnings would you like to convert to coins?");
        winnings = scan.nextDouble();

        // Input validation loop
        while(winnings < MIN_AMT){
            System.out.printf("%s%.2f %n", "ERROR: The minimum winnings to use this machine is $", MIN_AMT);
            System.out.println("How much winnings would you like to convert to coins?");
            winnings = scan.nextDouble();
        }

        // Put everything in terms of cents, and simplify
        cents = Math.round(winnings * 100);


        if(cents >= DOLLAR_CENTS){
            dollar = (int) (cents/DOLLAR_CENTS);
            cents = cents % DOLLAR_CENTS;
        }
        if(cents >= HALF_DOLLAR_CENTS){
            halfDollar = (int) (cents/HALF_DOLLAR_CENTS);
            cents = cents % HALF_DOLLAR_CENTS;
        }
        if(cents >= DIME_CENTS){
            dime = (int) (cents/DIME_CENTS);
            cents = cents % DIME_CENTS;
        }
        if(cents >= NICKEL_CENTS){
            nickel = (int) (cents/NICKEL_CENTS);
            cents = cents % NICKEL_CENTS;
        }
        penny = (int) cents;

        // Calculate the total - Should be equal to the "winnings" input value
        total = (dollar * DOLLAR_CENTS) +
                (halfDollar * HALF_DOLLAR_CENTS) +
                (dime * DIME_CENTS) +
                (nickel * NICKEL_CENTS) +
                (penny * PENNY_CENTS);
        total = total / 100;

        // Print the results of the program
        System.out.println("You will receive " +
                dollar + " dollar coins, " +
                halfDollar + " half dollar(s), " +
                dime + " dime(s), " +
                nickel + " nickel(s), and " +
                penny + " penny/pennies");
        System.out.printf("%s%.2f %n", "This totals to $", total);
    }
}
