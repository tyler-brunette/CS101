import java.util.Scanner;

public class AreaOfCircle {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double radius;
        System.out.println("What is the radius of your circle? \n");
        radius = scan.nextDouble();

        double pi = 3.14159;
        double area = pi * radius * radius;

        System.out.println("The area of your circle is " + area);
        scan.close();
        System.exit(0);
    }
}