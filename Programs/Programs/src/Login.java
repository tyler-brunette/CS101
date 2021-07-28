// This assignment was completed on 7/28/2021 by Tyler Brunette

import java.util.*;

public class Login{
    public static void main(String [] args){
        final String USERNAME = "admin";
        final String PASSWORD = "open";

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your username: ");
        String username = scan.next();
        System.out.println("Enter your password: ");
        String password = scan.next();
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
