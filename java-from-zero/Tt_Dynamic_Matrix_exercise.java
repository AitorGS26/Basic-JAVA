/*
 * Make a program where the user tells the amount of lines and 
 columns of a matrix and the data will be a +10 counter
 */
import java.util.Scanner;
public class Tt_Dynamic_Matrix_exercise {
    public static void main(String[] args) {
        int lines = 0, columns = 0, counter = 1;
        Scanner imput = new Scanner(System.in);

        System.out.print("How many lines do you want? ");
        lines = imput.nextInt();

        System.out.print("How many columns do you want? ");
        columns = imput.nextInt();

        int matrix [][] = new int [lines][columns];

        for (int j = 0; j < lines; j++) {
            for (int i = 0; i < columns; i++) {
                matrix [j][i]=counter;
                counter++;

                System.out.print("[" + matrix[j][i] + "]");
                
            }
            
            System.out.println("");
        }
    }
    
}
