/**
 * Until now, we've been working with one dimension arrays,
 we've seen one dimension arrays with static index and with
 dynamic index.  

 * Sometimes, we need to have more data in the same place, 
 For example, when we're at school we've diferent subjects,
 we could do a one dimension array with one student and different
 subjects with theis respective marks.
 We'll use matrix for a simmilar situation, but for example
 if we want to have the previous data but of all the students
 of the school.

 * The two axes are ussualy are 
 * i => the x axe
 * j => the y axe
 
 * There we'll do like if we have "a word table", like the calendar of subjects at school.
 * 
 * for coding matrix, the line will be like => 
 ** int nameofthematrix [][] = new int [QuantityOfLines][QuantityOfColumns] 

 * Here we also have static index matrix and dynamic index matrix. For now
 we'll be learning the functionality of the static matrix.

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
