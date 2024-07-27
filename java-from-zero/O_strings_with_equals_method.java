/*
 * Now, we're going to know how to compare things in java.
 
 *For now we've been working with numbers
 with INT:
 
 - In Java, int is a primitive data type that 
 represents a 32-bit signed integer, ranging 
 from -2,147,483,648 to 2,147,483,647

 *Now for comparing with equals we'll work with letters
 or in other words with "String"

 *See how string is written, this is not a failure
 is important to write "S" in capital letter for
 java knowing how to interpret.

 *For comparing we'll use .equals, but maybe is easier 
 to explain with an example.

 EXERCISE 1 - 
 * Do a program which compares 2 names, for verifying
they're equals, showing a message that says:
the names are equals or the names are different
* Note: the names are going to be introduced by user's
keyboard
 */

/*The exercise sais that the names are beign 
introduced by the user, so we need to import
scanner*/

import java.util.Scanner;
public class O_strings_with_equals_method{
    public static void main(String[]args){
        String name1 ="", name2="";
        Scanner input = new Scanner(System.in);

        System.out.print("Introduce the first number: ");
        name1=input.nextLine();
        System.out.print("Introduce the second number: ");
        name2=input.nextLine();

        if(name1.equals(name2)){
            System.out.println("They are same names! Well done");
        }else{
            System.out.println("The names are different! This is incorrect");
        }
    }
}