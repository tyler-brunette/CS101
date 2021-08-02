// This assignment was completed on 8/2/2021 by Tyler Brunette
import java.util.*;

public class Fax {
    static Scanner scan = new Scanner(System.in);

    // Declare Constants
    static final double SERVICE_CHARGE = 3.00;
    static final double PRICE_PER_PAGE_FIRST_TEN_PAGES = 0.20;
    static final double PRICE_PER_PAGE_OVER_TEN_PAGES = 0.10;
    public static void main(String[] args){

        // Declare Variables
        int faxedPages;
        double totalCost;

        // Prompt user for input
        System.out.print("Enter number of pages faxed: ");
        faxedPages = scan.nextInt();

        // Calculate the total cost for the fax
        if (faxedPages <= 10) {
            totalCost = SERVICE_CHARGE + PRICE_PER_PAGE_FIRST_TEN_PAGES * faxedPages;
        }
        else {
            totalCost = SERVICE_CHARGE + PRICE_PER_PAGE_FIRST_TEN_PAGES * 10
                        + (faxedPages - 10) * PRICE_PER_PAGE_OVER_TEN_PAGES;
        }

        // Print the total cost to the user
        System.out.println("\nNumber of pages faxed: " + faxedPages);
        System.out.printf("%s%.2f %n", "Amount Due: $", totalCost);
    }
}
