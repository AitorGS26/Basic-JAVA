/*
 * Length and substring methods.
 
 * Length tell us how long a string is.
 * Substring asks for an input to the user and gives
 back the strings length but only between the
 parameters the user has choosed. 

 We'll do an exercise for undertanding better this point.

 * Exercise 1:

 Make a program that asks for a chain of characters
from the keyboard, then the program will show the quantity
of characters that has that chain. finally the program
will ask the user, which part of the chain do you want?
and show that part of the chain
 */

 //The exercise asks for an input, we've to import scanner.
 import java.util.Scanner;

 public class P_methods_length_and_substring{
    public static void main(String[] args) {
//First of all we've to declare the different variables
        String text="", subtext="";
        int TextLength = 0, SubtextLength = 0, from= 0, to=0;
        Scanner input = new Scanner(System.in);

/*for now we've declare the text that the user will give to us,
The subtext is the text that we'll give to the user after he told us
from which charactor to which character want to have the new text
*/
        System.out.print("Introduce your text here: ");
        text = input.nextLine();
        TextLength =  text.length();

/*For now with this, we can tell the user which is the text an how the length is.
 */
        System.out.print("The text you have introduced, " + text + " has " + TextLength + " characters");
/*
 * Now we know the text's length and proceed to ask the user information about the new text or subtext.
 */
        System.out.println(" ");
        System.out.print("In which character do you want to start the new text? ");
        from = input.nextInt();
        System.out.print("In which character do you want to finish the new text? ");
        to = input.nextInt();
/*
 * After user's decission, the program will show the new tex like below.
 */
        subtext = text.substring(from, to);
        SubtextLength = subtext.length();
        System.out.println("Your new text is the following: " + subtext);
        System.out.println("Your new text's lenght is the following: " + SubtextLength + " charachters");


    }
 }