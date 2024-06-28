/*
 * Dynamic index dont need as static index, to tell
 what will be the start position, it will do that
 automatically.

 For this, we'll use a FOR loop.

 the basic syntax is the same as the static one.

 Exercise 1.

 Make a program which has a vector, the length of
 the vector will be provided by the user.
 Then the program will ask the user which are the 
 charachters to introduce in each position that 
 the user has added, if the user told the program
 that the vector has 10 positions, the program
 will as back the 10 position's data.
 finally print the array in the below's form:

 [5][54][12][65][6][54][897]
*/

import java.util.Scanner;

public class R_dynamic_index_vectors {
    public static void main(String[] args) {
        int Vlength = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("How many numbers do you want to have the vector? ");
        Vlength = input.nextInt();

        int[] numbers = new int[Vlength];

        for (int i = 0; i < Vlength; i++) {
            System.out.println("Please give the value of the #" + (i + 1));
            numbers[i] = input.nextInt();
        }

        System.out.print("The numbers in the vector are: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("[" + numbers[i] + "]");
        }

        input.close(); // Cerrar el Scanner después de usarlo
    }
}
