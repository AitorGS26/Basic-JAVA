/*
 * ARRAYS : Data structure that stores multiple values
 of the same type. They allow us to store a list of
 data in the same variable instead of declaring each
 value on separated variables.

 We've two types of arrays:
 One dimension arrays, which are called VECTORS.
 Two dimension arrays, which are called MATRIX.

 For now we're going to see one dimension arrays
 or vectors.

 * The arrays always has an index, no matter
 the amount of position it has and it always starts
 from the 0 position. This index help us moving
 forward or backward the vector.

 * For introducing the coding line, we'll start
 with the following:

 int[]"name" = new int ["amount of positions"]

 [] tell us that this is a vector.

 The index has two behaviours: Static and Dynamic.

 * Static Index: A static index in an array refers 
 to a fixed, predefined position in the array that 
 does not change during the execution of the program.
 
 * Dynamic Index: A dynamic index in an array refers 
 to a position that can be calculated or modified 
 during the execution of the program, allowing access
 to different elements of the array at different 
 times.

 For now we're going to see static arrays.

 * After we've declared the array, we've to introduce
 the data that will be inside the array like below:

 name [position of the vector] = element to save;

 * And for printing the result:
 System.out.println(name [position inside the vector]);

 Exercise 1:

 Create a5 position vector, save a number in each 
 position and finally print all the positions for
 verifying that is correct done.

 */

 public class Q_one_dimensional_arrays_vectors{
    public static void main(String[] args) {
        
        int[]vector=new int[5];
        vector [0] = 1;
        vector [1] = 2;
        vector [2] = 3;
        vector [3] = 4;
        vector [4] = 5;

        System.out.print(vector[0]+ ", ");
        System.out.print(vector[1]+ ", ");
        System.out.print(vector[2]+ ", ");
        System.out.print(vector[3]+ ", ");
        System.out.print(vector[4]);
    }
 }