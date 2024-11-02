/**Until now, we've been working with one dimension arrays,
 we've seen one dimension arrays with static index and with
 dynamic index.  

 * Sometimes, we need to have more data in the same place, 
 for thiswe'll use Matrix.
 * Matrix is an x - y axes structure, where each position will have some data.
 * This allows us to do so many things as we'll be seeing in this and next lessons.

 * The two axes are ussualy are 
 * i => the x axe
 * j => the y axe
 
 * There we'll do like if we have "a word table", like the calendar of subjects at school.
 *  
 **MATRIX CODE => int "name" [][] = new int ["QuantityOfLines"]["QuantityOfColumns"] 

 * Here we also have static and dynamic index matrix. For now we'll be learning 
 the functionality of the static matrix.

 * You'll understand better with an exercise:
 
 * Make a program that prints on the screen a two line and two column matrix, the positions
 will be like follows: 
                             [5][2]
                             [2][5]    

 */

public class S_Working_with_Matrix {
    public static void main(String[] args) {
        
        int Matrix [][] = new int [2][2]; //First two => lines -- Second two => columns

        Matrix [0][0] = 5;
        Matrix [0][1] = 2;
        Matrix [1][0] = 2;
        Matrix [1][1] = 5;

        System.out.println("The matrix you've created is the following: ");

        System.out.print("[" + Matrix [0][0] + "]");
        System.out.println("[" + Matrix [0][1] + "]"); //line break for showing the matrix correctly.
        System.out.print("[" + Matrix [1][0] + "]");
        System.out.print("[" + Matrix [1][1] + "]");



    }
}
