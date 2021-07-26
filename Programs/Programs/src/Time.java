// This assignment was completed on 7/22/2021 by Tyler Brunette

import java.util.*;
public class Time
{
    static Scanner scan = new Scanner(System.in);
    static final int SECONDS_PER_HOUR = 3600;
    static final int SECONDS_PER_MINUTE = 60;
    public static void main(String[] args)
    {
        int hours;
        int minutes;
        int seconds;
        System.out.print("Enter the elapsed time in seconds: ");
        seconds = scan.nextInt();
        System.out.println();
        System.out.println("The elapsed time in seconds = " + seconds);
        hours = seconds / SECONDS_PER_HOUR;
        seconds = seconds % SECONDS_PER_HOUR;
        minutes = seconds / SECONDS_PER_MINUTE;
        seconds = seconds % SECONDS_PER_MINUTE;
        System.out.println("The equivalent time in hours:minutes:seconds = " + hours + ":" + minutes + ":" + seconds);
    }
}
