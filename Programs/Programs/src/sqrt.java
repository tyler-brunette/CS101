import java.util.*;

public class sqrt {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter an integer: \n");
        int num = scan.nextInt();

        int pos = Math.abs(num);
        double sqrt = Math.sqrt(pos);

        if(num < 0) {
            System.out.println("The Square Root of " + num + " = " + sqrt + "i");
        }
        else if(num >= 0) {
            System.out.println("The Square Root of " + num + " = " + sqrt);
        }

    }
}
