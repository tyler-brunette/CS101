// This assignment was completed on 8/4/2021 by Tyler Brunette
import java.util.*;

public class Practice{
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args){
        int num;
        boolean isPrime = true;
        int sqrtNum;
        int divisor = 3;

        System.out.print("Enter a positive integer greater than 1: ");
        System.out.flush();
        num = scan.nextInt();
        System.out.println();
        System.out.println("The number you entered is: " + num);

        if (num <= 1)
            System.out.println("ERROR: You must enter an integer greater than 1. \nExecute program aqain.");
        else if (num == 2)
            System.out.println("The number you entered is a prime number");
        else if (num % 2 == 0)
            System.out.println("The number you entered is not a prime number");
        else
        {
            sqrtNum = (int)(Math.pow(num,0.5));
            while (divisor <= sqrtNum)
            {
                if (num % divisor == 0)
                {
                    System.out.println("The number you entered is not a prime number");
                    isPrime = false;
                    break;
                }
                else
                    divisor = divisor + 2;
            }

            if (isPrime)
                System.out.println("The number you entered is a prime number");
        }
    }
}
