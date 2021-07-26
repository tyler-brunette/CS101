// This Program converts a given Fahrenheit temperature to Celsius and back to Fahrenheit, then displaying both results.
// This Program was written on 7/15/2021 by Tyler Brunette
public class TemperatureConversion {
    public static void main( String [] args )
    {
        //***** 1. declare any constants here

        //***** 2.  declare temperature in Fahrenheit as an int
        double temp = 74;

        //***** 3. calculate equivalent Celsius temperature
        double cels = (((temp - 32) * 5) / 9);

        //***** 4. output the temperature in Celsius
        System.out.println("The temperature in Celsius is " + cels + " degrees.");

        //***** 5. convert Celsius temperature back to Fahrenheit
        double newtemp = ((cels * 9) / 5) + 32;

        //***** 6. output Fahrenheit temperature to check correctness
        System.out.println("The temperature in Fahrenheit is " + newtemp + " degrees.");
        System.exit(0);
    }
}
