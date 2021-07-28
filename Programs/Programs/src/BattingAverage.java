// This assignment was completed on 7/26/2021 by Tyler Brunette

import java.util.*;

public class BattingAverage{
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);

        // Take in input values
        System.out.println( "Enter the number of hits the batter has: " );
        double hits = scan.nextDouble();

        System.out.println( "Enter the number of at bats the batter has: " );
        int atBats = scan.nextInt();

        // Calculate Batting Average
        double battingAvg = hits / atBats;
        System.out.println("The player's batting average is " + battingAvg);

        if (battingAvg > .300) {
            System.out.println("The batter is eligible for the All Star Game");
        }
        else {
            System.out.println("The batter is not eligible for the All Star Game");
        }
    }
}
