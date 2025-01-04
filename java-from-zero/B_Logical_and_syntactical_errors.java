/*
 Logical errors: A logical error is a type of mistake in a 
 program that causes it to operate incorrectly, but not to 
 crash or throw an error. The program runs, but it doesn't 
 do what you expect it to do. For example when you want to make a loop
 and the loop never ends, the program works but not correctly.

 Synthactical errors: We talk about synthactical errors when in 
 a program we forget for example putting ; to an argument, or maybe 
 we put some capital letter where it doesn't fix. The program will
 not run in that case.

 */

//Example of a logical error:
public class B_Logical_and_syntactical_errors {

    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int sum = a - b; // Logical error here
        System.out.println("The sum is: " + sum);
    }
}

//Example of a synthactical error:
public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello, World!"
        /*Syntactical error here: missing closing parenthesis and semicolon */
    }
}
