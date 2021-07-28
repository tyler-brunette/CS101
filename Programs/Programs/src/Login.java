// This assignment was completed on 7/28/2021 by Tyler Brunette

import java.util.*;

public class Login{
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);

        // Declare constants
        final String USERNAME = "admin";
        final String PASSWORD = "open";

        // Collect user input
        System.out.println("Enter your username: ");
        String username = scan.next();

        System.out.println("Enter your password: ");
        String password = scan.next();

        // Determine if the username and/or password is correct
        if (username.equals(USERNAME))
        {
            if (password.equals(PASSWORD))
                System.out.println("Hello " + username + ", welcome back.");
            else
                System.out.println("Sorry, you entered the wrong password.");
        }
        else if (password.equals(PASSWORD))
            System.out.println("Sorry, you entered the wrong username.");
        else
            System.out.println("Sorry, you entered the wrong username and password.");
    }
}
