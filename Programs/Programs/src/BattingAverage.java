/* Batting Average
 *  Anderson, Franceschi
 *  This assignment was completed on 7/26/2021 by Tyler Brunette
 */
import java.util.Scanner;
import java.text.NumberFormat;
public class BattingAverage
{
    public static void main( String [] args )
    {
        Scanner scan = new Scanner( System.in );
        // prompt for input
        System.out.print( "Enter the number of hits > " );
        int hits = scan.nextInt( );
        System.out.print( "Enter the number of at bats > " );
        int atBats = scan.nextInt( );
        // calculate hitting percentage
        double hitPercent = (double) ( hits ) / atBats;
        NumberFormat percent = NumberFormat.getPercentInstance( );
        System.out.println( "The batting average is "
                + percent.format( hitPercent ) );
        if ( hitPercent > .300 )
            System.out.println( "Batter is eligible for All Stars Game"
            );
        else
            System.out.println( "Batter is not eligible for All Stars "
                    + "Game" );
    }
}
