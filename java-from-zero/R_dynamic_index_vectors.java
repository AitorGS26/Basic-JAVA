/* Dynamic index also starts always by 0 position,
but here the user will provide the amount of positions

 For this, we'll use a FOR loop.

 The basic syntax is the same as the static one.

 Exercise 1.

    Make a program which has a vector.
    *The length of the vector will be provided by the user.
 
    *Then the program will ask the user which are the 
    charachters to introduce in each position. 
 
    *If the user told the program the vector has 10 positions, the program
    will ask back the 10 position's data.
 
    *Finally print the array in the below's form:

    [5][54][12][65][6][54][897]
 */

import java.util.Scanner;

public class R_dynamic_index_vectors {

    public static void main(String[] args) {
        /**
         * We start declarig the variables we'll be using
         */
        int vectorLength = 0; //User's added vector length
        Scanner input = new Scanner(System.in); //scanner for user's input

        /**
         * We ask the user for data
         */
        System.out.print("How many positions do you want to have the vector? ");
        vectorLength = input.nextInt();

        /*After saving data inside Vectorlength we declare "numbers" vector,
        putting inside the vector lenght the user's input for this*/
        int[] numbers = new int[vectorLength];

        /**
         * We've the vector lengh't and we need the user's input for each
         * position of the vector so the loop will ask the user for that info
         */
        for (int i = 0; i < vectorLength; i++) {
            /*i => vector's actual position
         *it will be working until i=vector's length
         *it will be +1 adding for in user's each answer letting the data 
         inside all the positions of the vector*/
            System.out.print("Please give the value of the different positions, now #" + (i + 1));
            numbers[i] = input.nextInt();
        }
        /* After saving all the data inside each vector's position*/
        System.out.print("The numbers in the vector are: ");
        for (int i = 0; i < numbers.length; i++) {
            /* i variable is 0 and until i is =number's length the loop will do +1 */
            System.out.print("[" + numbers[i] + "]");
        }

        input.close(); //This is for closing scanner
    }
}
