/*
 * Welcome to the First lesson on this personal course of Java.
 
 * First of all, we've to know that the appropiate form
 for reading code is from right to left & up to down. This is very important
 for knowing what code does.
 
 * When we start coding Java, we've to know a very important thing,
 I like to explain like a friend explained to me. If we look at programming
 like a way to create something, in java for create that thing,
 we've to create the "machine" which creates the thing we
 want to create.

 THE CLASS
 First of all we need a thing called class, you can see it like a logical
 template which shares objects and methods
 For example : The class animals

 THE OBJECT

The object is ans instance of a class. It has entity and behaviour

For example, objects inside above's animal class: monkey, dog, cat, donkey

 THE METHOD

 The behaviour of an object is the method.
 For example, continuing with above's animals example, the class animals has an object dog and a method "bark"

 THE MAIN METHOD

 * We have to take this as the start of the code. In java the program won't run if the MAIN
 method is not setted. This is always inside a public class, for allow running the program.
 
 public static void main (String[] args){
 }


 PRINTING CODE

 * By now we've the class and the main method and because of that we know
 the program will run, now we've to tell the program something for showing something to
 the user, we've to print the code and for that we've the following lines

 The method, the printing and this all, will be inside a public class, this is for 
 allowing any comunication between clases and for allowing anyone to running it.
 
 system.out.print("text for print"); -> the text is printed in the same line
 system.out.println("text to print") -> the text is printed in the next line

 IMPORTANT NOTE: IN JAVA WE'VE TO END THE INSTUCTION WITH ; ALWAYS
 Also is important to know, the name of the class will start with a
 capital letter.
 */

public class A_Basic_Concepts {

    public static void main(String[] args) {
        System.out.println("Hello java");
    }
}
