
/**
 * As we know conditional structures (if, else), are accumulative,
 * many times we'll have to put a few if and else for doing a program, others
 * a lot of them, so we can nest them really easily as we can see
 * at the exercise below.
 *
 * Exercise 1:
 * Do a program that can add, subtract, multiply or split two entire
 * numbers, depending user's decision */
import java.util.Scanner;

public class E_nested_conditional_structures {

    public static void main(String[] args) {
        int operation = 0, num_1 = 0, num_2 = 0, answer = 0; //put here your option between 1-4
        Scanner input = new Scanner(System.in);

        System.out.print("Choose your first number: ");
        num_1 = input.nextInt();
        System.out.print("Choose your second number: ");
        num_2 = input.nextInt();

        System.out.println("1 = add");
        System.out.println("2 = subtract");
        System.out.println("3 = multiply");
        System.out.println("4 = split");
        System.out.print("Choose an option between 1-4: ");
        operation = input.nextInt();

        if (operation == 1) {
            answer = num_1 + num_2;
            System.out.println("You've added two numbers, the answer is: " + answer);
        } else if (operation == 2) {
            answer = num_1 - num_2;
            System.out.println("You've subtracted two numbers, the answer is: " + answer);
        } else if (operation == 3) {
            answer = num_1 * num_2;
            System.out.println("You've multiply two numbers, the answer is: " + answer);
        } else if (operation == 4) {
            answer = num_1 / num_2;
            System.out.println("You've divided two numbers, the answer is: " + answer);
        } else {
            System.out.println("That's an incorrect option");
        }
    }
}
