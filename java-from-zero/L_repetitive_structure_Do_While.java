/*
 * The last repetitive structure or loop is the do-while structure.
 The purpose is the same as other structures.

 * The basic structure for do-while is the following:
 declare the i variable
 do{
 instructions
 increasing or decreasing
 } while(condition;)
 */

 public class L_repetitive_structure_Do_While{
    public static void main(String[]args){
        int i = 1;
        do { 
            System.out.print(i +", ");
            i++;
        } while (i<201);
    }
}