/**
 As we know conditional structures (if, else), are accumulative,
 many times we'll have to put a few if and else for doing a program, others
 a lot of them, so we can nest them really easily as we can see
 at the exercise below.

 Exercise 1:
 Do a program that can add, subtrack, miltiply or split two entire
 numbers, depending user's decision
 */

 public class E_nested_conditional_structures{
    public static void main(String[] args) {
        int operation = 1; //put here your option between 1-4
        int num_1 = 10;
        int num_2 = 2;
        int answer = 0;
        
        if(operation==1){
            answer = num_1 + num_2;
            System.out.println("You've added two numbers, the answer is: " + answer);
        }else if(operation==2){
            answer = num_1 - num_2;
            System.out.println("You've subtracted two numbers, the answer is: " + answer);
        }else if(operation==3){
            answer = num_1 * num_2;
            System.out.println("You've multiply two numbers, the answer is: " + answer);
        }else if(operation==4){
            answer = num_1 / num_2;
            System.out.println("You've divided two numbers, the answer is: " + answer);
        }else {
            System.out.println("That's an incorrect option");
        }
    }
}
 