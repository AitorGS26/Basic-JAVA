/*
 * Make a program where the user tells the amount of lines and 
 columns of a matrix and the data will be a +10 counter
 */
import java.util.Scanner;
public class Tt_Dynamic_Matrix_exercise {
    public static void main(String[] args) {
        int lines = 0, columns = 0, counter = 1; //we declare the variables
        Scanner input = new Scanner(System.in);//the usar's input

        System.out.print("How many lines do you want? ");
        lines = input.nextInt();

        System.out.print("How many columns do you want? ");
        columns = input.nextInt();


        /**After saving the user's input we declare the matrix and introduce 
         * those variables inside */

        int matrix [][] = new int [lines][columns];//now lines and columns will be user's input

        for (int j = 0; j < lines; j++) {
            for (int i = 0; i < columns; i++) {
                matrix [j][i]=counter;
                counter++;

                System.out.print("[" + matrix[j][i] + "]");
                
            }
            //Here the loop will make the matrix until it ends, depending on the user's input.
            System.out.println("");
        }
        /**The functionality of this exercise is the same as before's
         * the difference is in the input, now the positions won't be 3,3
         * the position will have a variable as columns or lines, because inside of them
         will be the user's input data for the columns and lines.
         */
    }
    
}
