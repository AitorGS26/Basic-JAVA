/*
Now we're going to allow the user introduce some data, 
in this case the "name" and some numbers for doing an addition

* For this we're going first of all importing the Scanner Library
This will be the library which will allow the user introducing data.

Exercise:
Ask the user's name, then as the user to give two numbers 
for making an addition.
 */

import java.util.Scanner; //First of all we import the scanner library.
public class F_introducing_data_from_keyboard_Scanner {
    public static void main(String [] args){
/*
 * After putting main method, we start using the library we've imported.
 * For doing that, we tell the program to scanner "nameofthescanner",
 * we tell it's a new scanner and alwais (System.in) for telling the program
 * that usder's going to introduce the data we ask 
 */
        Scanner input = new Scanner(System.in);
        String YourName  =""; //Name of the person
        int num_1 = 0, num_2 = 0, answer = 0; //numbers for ask
//Now we've to code the secuence of questions for the user
        System.out.print("What's your name?");
        YourName = input.nextLine();
//When we ask for a string(letters) it will be in.nextLine
        System.out.print("Add your first number");
        num_1 = input.nextInt();
//When we ask for a number it will be in.nextInt
        System.out.print("Add your second number");
        num_2 = input.nextInt();

        answer = num_1 + num_2;
        System.out.println("Hi " + YourName +  " Your addition answer is: " + answer);
    }
}
