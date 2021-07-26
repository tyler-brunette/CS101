import java.util.*;

// This Program takes a double input from the user and outputs the nearest integer.
// This assignment was completed on 7/21/2021 by Tyler Brunette
public class InClass_Three {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        double number;
        System.out.println("Enter a decimal number: \n");
        number = scan.nextDouble();

        System.out.println("The integer nearest to " + number + " = " + (int)(number + 0.5));
    }
}
