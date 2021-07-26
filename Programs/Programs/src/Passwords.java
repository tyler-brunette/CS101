/* Find smaller password
   Anderson, Franceschi
*/

/* This Program takes in 2 String inputs of passwords and then compares the two passwords,
   outputting the length of the shorter password
 */
// This assignment was completed on 7/21/2021 by Tyler Brunette

import java.util.Scanner;

public class Passwords {

    public static void main(String[] args) {

        Scanner scan = new Scanner( System.in );

        System.out.println( "Enter the first password > " );
        String password1 = scan.next( );
        System.out.println( "Enter the second password > " );
        String password2 = scan.next( );

        int lengthPassword1 = password1.length( );
        int lengthPassword2 = password2.length( );

        int minLength = Math.min( lengthPassword1, lengthPassword2 );
        System.out.println( "The length of the shorter password is "
                + minLength );
    }
}