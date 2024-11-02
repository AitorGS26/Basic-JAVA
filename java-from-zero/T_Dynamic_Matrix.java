/* As we've seen at dynamix index on one dimension arrays, 
here we'll also use a loop with for, this is the way to make 
index move dinamically.

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
        int matrix [][] = new int [3][3];
        int counter = 1; //This will be the counter for the data in the different positions of the matrix.

        for (int i = 0; i < 3; i++) { //the exercise tell us to do a 3 line and 3 column matrix
            for (int j = 0; j < 3; j++){//we put here also the condition <3 because of the numebr of columns
                matrix[i][j]=counter;//first position will be counter's value.
                counter++; //Counter then will increase
                System.out.print(matrix [i][j]); //we print the previous info.

            }
            
            System.out.println("");//when that occurs, the program will do a line break, for starting again with the second line of the matrix.
        }
        /**EXPLENATION OF THE LOOP 
         * i=line -- j=column
         * counter = 1 
         * 
         * As we've learned the first position of the printing matrix by default is 0,0
         * matrix [i][j] = counter - which value is 1, so the 0,0 position will be 1
         * counter ++ => counter now is 2
         * j now is 1 which is < 3 so the loop continues
         * now counter is 2 so in the print part the 0,1 position will be 2
         * and then counter increases to 3
         * the loop continues and now j=2, which is <3 so this is the last loop
         * counter now is 3 so Matrix [i][j] is now 3
         * the loop ends and we add a line break, now it goes back to i loop
         * i now is 1 so the j loop starts again for doing the second line as first
         * when 3 positions are finished it will do again a line break and start with the last
          line  */
    }
}
/*
 * This will be in the loop until it has all the info inside the matrix we've indicate. 
 * Then it will print it all.
 */
