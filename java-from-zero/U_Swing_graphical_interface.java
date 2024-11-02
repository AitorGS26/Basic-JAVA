/* Working with java give us a lot of possibilities.
For the moment we've seen the basic sintax and some
functionalities.
 * 
 * Now on, we'll be crossing new horizons, we're starting
 now with Graphical interfaces.

 * For this, we'll work with SWING library.

 * We're not focusing today in the logic of programming in
 java, this lesson is only an introduction of what this 
 library is.

 **First of all**
 
 * What is a graphical user interface (GUI)?
 
  *A coding terminal is for example bash or zsh.
  
  * Windows is made on the other side by graphic interface,
  you don't need to introduce any code. and it's visual.
  * 

  In the next example we'll print a line but without using
  system.out.print(); - we're going to do it with swing library.

 */
import javax.swing.*; /*we start importing swing. the * 
is for importing all the elements of swing. */
public class U_Swing_graphical_interface extends JFrame{
/*Extends will "extend" the class with the library we're importing, in this case
we'll work with JFrame library */

  private JLabel label1; //we create a private jlabel called label1
 
  public U_Swing_graphical_interface(){ 
    //With the label1 JLabel object created, now we need a constrictor fot giving it form
    
    setLayout(null);     
    label1 = new JLabel("This is our first GRAPHICAL INTERFACE");
    label1.setBounds(10,20,300,400); 
    add(label1); 
    /**line39 => the layout will be added by us manually
     * line40 => the message inside label1
     * line41 => setbound method for adding the dimensions of the label1
     */
 }

 public static void main(String[] args) {
     U_Swing_graphical_interface container = new U_Swing_graphical_interface();
     

     /**After setting the data, we'll set our main method for allow running the program
      but now we need a box for showing that label we've created, for that
      we'll create an object which type is the same as the class that's inside,
      also the previous container is the same as the class, this is for making all
      the program's info chained.

      * With the class type object created, now all the previous label code will be
      inside of this new object, but for showing it we'll have to make this object
      visible and with the appropiate size*/
     container.setBounds(0,0,500,600); //The position of the container
     container.setVisible(true); //if the object is visible or not
     container.setLocationRelativeTo(null); //the location for not appearing where it wants.

 }
}
/*
 * Swing library allow us to import all the elements for making graphical interfaces,
 and Jframe allow us creating the graphical interface.
 
 * Our labels, always are going to be private, our class always public.
 We'll learn more about this y next lessons.
 */