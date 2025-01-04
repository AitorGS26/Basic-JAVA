/*
 * Length and substring methods.
 
 * Length tell us how long a string is.
 * Substring asks for an input to the user and gives
 back the strings length, but only between the
 parameters the user has choosed. 

 We'll do an exercise for understanding better this point.

 * Exercise 1:

 Make a program that asks for a chain of characters
from the keyboard, then the program will show the quantity
of characters that has that chain. finally the program
will ask the user, which part of the chain do you want?
and show that part of the chain*/

//The exercise asks for an input, we've to import scanner.
import java.util.Scanner;

public class P_methods_length_and_substring {

    public static void main(String[] args) {
//First of all we've to declare the different variables
        String text = "", subtext = "";
        int TextLength = 0, SubtextLength = 0, from = 0, to = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Introduce your text here: ");
        text = input.nextLine();//the user's input is saved inside text variable
        TextLength = text.length();//user's input's length is saved inside TextLength with .length()

        /*For now with this, we can tell the user which is the text an how the length is.*/
        System.out.print("The text you have introduced, " + text + " has " + TextLength + " characters");

        /*Now we know the text's length and proceed to ask the user information about the new text or subtext.*/
        System.out.println(" ");//we add an space between lines
        System.out.print("In which character do you want to start the new text? ");
        from = input.nextInt();//user's input is saved inside from variable
        System.out.print("In which character do you want to finish the new text? ");
        to = input.nextInt();//user's input is saved inside to variable

        /*After user's input, the program will show the new text like below.*/
        subtext = text.substring(from, to);
        /*we add text's substring from "from" to "to" which are two varibles
        the user has choosed for starting and finishing the new text, looking in Text variable, this new text will 
        be saved in subtext variable */
        SubtextLength = subtext.length();//We add the subtext's length inside subtextlength variable
        System.out.println("Your new text is the following: " + subtext);
        System.out.println("Your new text's lenght is the following: " + SubtextLength + " charachters");

    }
}
