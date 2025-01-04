/* As we've seen at dynamic index on one dimension arrays, 
here we'll also use a loop with for, this is the way to make 
index move dynamically.

Explaining this with theory will be a little bit difficult
and maybe with an exercise you'll understand better.

 * Exercise:
 * 
 * Make a program that prints the following matrix with a dynamic index:
 * [1][2][3]
 * [4][5][6]
 * [7][8]̣̣̣[9]
 * 
 */
public class T_Dynamic_Matrix {

    public static void main(String[] args) {
        int matrix[][] = new int[3][3];//we declare a 3,3 positions matrix
        int counter = 1; //Counter will be increasing for getting matrix full of data, 

        for (int i = 0; i < 3; i++) { //i variable will achieve the lines
            for (int j = 0; j < 3; j++) {//j will achieve the columns
                matrix[i][j] = counter;//first position will be counter's value.
                counter++; //Counter then will increase
                System.out.print(matrix[i][j]); //we print the previous info.

            }

            System.out.println("");//when that occurs, the program will do a line break, for starting again with the second line of the matrix.
        }
        /**
         * EXPLANATION OF THE LOOP i=line -- j=column counter = 1
         *
         * As we've learned, by default when we print a Matrix, the first
         * position which will print is 0,0 matrix [i][j] = counter - which
         * value is 1, so the 0,0 position will be 1 counter ++ => counter now
         * is 2 We continue inside column's loop (j variable's loop), j now is 1
         * which is < 3 so the loop continues
         *
         * we are at 0,1 position because of the loop, counter's value now is 2
         * so in 0,1 position there will be added a 2 and then counter increases
         * to 3
         *
         * the loop continues, now j=2, which is <3 so we are yet inside j loop
         * counter now is 3 so 0,2 position will be 3
         *
         * now j=3 and the condition tell us the loop will be running until j<3
         * so the program exit from the loop We are now again i loop, which's
         * value now is 1, j loop start's again but now at 1,0 position counter
         * has not changed the last value, which was 3, now with the loops
         * increase is 4 4 is added to 1,0 position. then the loop will
         * continue, counter will continue increasing also until it is at 1,2
         * position and it will start the i loop again.
         *
         * finally when it all ends the matrix will be printed
         */
    }
}
/*
 * This will be in the loop until it has all the info inside the matrix we've indicate. 
 * Then it will print it all.
 */
