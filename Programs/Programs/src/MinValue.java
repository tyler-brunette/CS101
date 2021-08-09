// This assignment was completed on 8/4/2021 by Tyler Brunette
import java.util.*;

public class MinValue {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int input;
        int min;

        System.out.println("Enter an integer: \n");
        input = scan.nextInt();
        min = input;

        for(int i = 0; i < 9; i++){
            System.out.println("Enter another integer: \n");
            input = scan.nextInt();

            if(input < min){
                min = input;
            }
        }

        System.out.println("The minimum value entered was: " + min);
    }
}
