/* In this lesson, we'll learn how to use labels and buttons and combine them for creating
 more profesional displays.
 * 
 * Exercise 1:
 * Make a program that shows a window, 
 * Inside the window there will be a dynamic text and 3 buttons.
 * Before you've pressed any button the window will have the message Waiting for user...
 * When you press button one, the window will change the message to another one, 
 the same as with the other two buttons.
 * 
 * 
 */

import java.awt.event.*;//importing the librarys we'll be using
import javax.swing.*;

public class X_Use_of_labels_buttons extends JFrame implements ActionListener {
    
    private JButton button1, button2, button3;//declaring buttons and label
    private JLabel dynamicText;    

public X_Use_of_labels_buttons(){ //With all declared we add the builder for giving form
        
        setLayout(null); //we'll set the layout manually
    
        button1 = new JButton("1");
        button1.setBounds(10,100,90,30);
        add(button1);
        button1.addActionListener(this);

        button2 = new JButton("2");
        button2.setBounds(110,100,90,30);
        add(button2);
        button2.addActionListener(this);

        
        button3 = new JButton("3");
        button3.setBounds(210,100,90,30);
        add(button3);
        button3.addActionListener(this);

        dynamicText = new JLabel("Waiting for user...");
        dynamicText.setBounds(10,10,300,30);
        add(dynamicText);
 }

 /**Below will be the class where inside will be the logic of the program
  * 
  * we created e action event, for the buttons that are waiting with action listener
  */
 public void actionPerformed (ActionEvent e){
    if (e.getSource() == button1) {//if the event comes from button one..
        dynamicText.setText("You've pressed Button 1!"); 
    /*We use setText for adding diferent texts in diferent cases of a same label behaviour.*/

    }
    if (e.getSource() == button2) {//if the event comes from button two..
        dynamicText.setText("You've pressed Button 2!");
    }
    if (e.getSource() == button3) {//if the event comes from button three..
        dynamicText.setText("You've pressed Button 3!");

    }
 }

 /**Now for running the program we add MAIN method and the container's features
  * for displaying the program*/
 public static void main(String[] args) {

    /**We' create the box and give it form and visibility. */
     X_Use_of_labels_buttons box = new X_Use_of_labels_buttons();
     box.setBounds(0,0,350,200);
     box.setVisible(true);
     box.setResizable(false);
     box.setLocationRelativeTo(null);
 }
}
