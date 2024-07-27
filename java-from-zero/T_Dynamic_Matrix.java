/* As we've seen at dynamix index on one dimension arrays, 
here we'll also use a loop with for, this is the way to make 
index move dinamically.

Explaining this with theory will be a little bit difficult
and maybe with an exercise you'll understand better.

 * Exercise:
 * 
 * Make a program that prints thefollowing matrix with a dynamic index:
 * [1][2][3]
 * [4][5][6]
 * [7][8]̣̣̣[9]
 * 
 * For the example below "j" will be the line of the matrix
 and "i" the column
 */
public class T_Dynamic_Matrix {
    public static void main(String[] args) {
        int matrix [][] = new int [3][3];
        int counter = 1; //This will be the counter for the data in the different positions of the matrix.

        for (int j = 0; j < 3; j++) { //the exercise tell us to do a 3 line and 3 column matrix
            for (int i = 0; i < 3; i++){//we put here also the condition <3 because of the numebr of columns
                matrix[j][i]=counter;//first position will be counter's value.
                counter++; //Counter then will increase
                System.out.print(matrix [j][i]); //we print the previous info.

            }//here the loop will go to increase "i" to value 1, and the loop will start until the i<3 condition isn't true.
            System.out.println("");//when that occurs, the program will do a line break, for starting again with the second line of the matrix.
        }
    }
}
/*
 * This will be in the loop until it has all the info inside the matrix we've indicate. 
 * Then it will print it all.
 */
