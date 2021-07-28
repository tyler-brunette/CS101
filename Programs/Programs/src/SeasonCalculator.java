// This assignment was completed on 7/26/2021 by Tyler Brunette

import java.util.*;

public class SeasonCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Declare variables
        int temp;
        String season = "";

        // Collect user input
        System.out.println("Enter the current temperature in Fahrenheit to the nearest degree: ");
        temp = scan.nextInt();

        // Input validation loop
        while(temp > 110 || temp < -5){
            System.out.println("ERROR: The given temperature is outside of the valid range.");
            System.out.println("Enter the current temperature in Fahrenheit to the nearest degree: ");
            temp = scan.nextInt();
        }

        // Determine the current season
        if(temp >= 90){
            season = "Summer";
        }
        else if(temp >= 70 && temp < 90){
            season = "Spring";
        }
        else if(temp >= 50 && temp < 70){
            season = "Fall";
        }
        else if(temp < 50){
            season = "Winter";
        }

        // Print final result
        System.out.println("Based on the given temperature, it is likely that the current season is " + season + ".");
    }
}
