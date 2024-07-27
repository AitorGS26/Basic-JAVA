/* Working with java give us a lot of possibilities.
For the moment we've seen the basic sintax and some
functionalities.
 * 
 * For now on, we'll be crossing new horizons, we're starting
 now with Graphical interfaces.

 * For this, in this lesson, we'll work with
 SWING library.

 * We're not focusing today in the logic of programming in
 java, this lesson is only an introduction of what this 
 library is.

 **First of all**
 
 * What is a graphical user interface (GUI)?
 
  * This is a utility that make easier for the user to work with
  the program that is creating. Because of this, the user can 
  make programs without coding or for helping visually.
  A coding terminal is for example bash or zsh.
  Windows is made on the other side by graphic interface,
  you don't need to introduce any code.
  * 

  In the next example we'll print a line but without using
  system.out.print(); - we're going to do it with swing library.

 */
import javax.swing.*; /*we start importing the swing library. the * 
is for importing all the elements of swing library. Is not the beat way to
work with this but this is only an example for viewing this new feature. */
public class U_Swing_graphical_interface extends JFrame{
/*extends help us importing previously created classes included at the jdk
 *Jframe is a class that allow us creating graphical interfaces
 */
//here in jframe, we dont have new variables to work with, for this example we'll create a label.
  private JLabel OurFirstLabel;
 
  public U_Swing_graphical_interface(){ //This is a constructor, the "machine which creates machines that my frien told me"
  setLayout(null); //We indicate to the program that we'll introduce the size and position of the label, "null" is for putting it where we want.
    OurFirstLabel = new JLabel("This is our first GRAPHICAL INTERFACE");//printing our message
     OurFirstLabel.setBounds(10,20,300,400); //position x , y and amount of pixels x , y
     add(OurFirstLabel); //we tell the constructor that all the previous caracteristics will be inside this label
 }
 /*
  * Now we have the label created, but for showing it in the screen
  we need to make the container where the text will be inside, fot that we'll do
  the following
  */
 public static void main(String[] args) {
     U_Swing_graphical_interface FirstGUI = new U_Swing_graphical_interface();
     /*The name of our class, the name of the constructor and the name of our object for graphical interface
      are the same, this is for ensuring that all of them are in the same place, and are chained.
      */
     FirstGUI.setBounds(0,0,500,600); //The position of the container
     FirstGUI.setVisible(true); //if the object is visible or not
     FirstGUI.setLocationRelativeTo(null); //the location for not appearing where it wants.

 }
}
/*
 * Swing library allow us to import all the elements for making graphical interfaces,
 and Jframe allow us creating the graphical interface.
 */
/*
 * Our labels, always are going to be private, our class always public.
 We'll learn more about this y next lessons.
 */