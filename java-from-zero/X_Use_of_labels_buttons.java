/* In this lesson, we'll learn how to use labels and buttons and combine them for creating more profesional displays.
 * 
 * Exercise 1:
 * Make a program that shows a window, inside the window there will be a dynamic text and 3 buttons.
 * before you've pressed any button the window will have the message Waiting for user...
 * When you press button one, the window will change the message to another one, the same as with the other two buttons.
 * 
 * 
 */

import java.awt.event.*;
import javax.swing.*;

public class X_Use_of_labels_buttons extends JFrame implements ActionListener {
    
    private JButton button1, button2, button3;
    private JLabel dynamicText;    

public X_Use_of_labels_buttons(){
    setLayout(null);
    
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
 public void actionPerformed (ActionEvent e){
    if (e.getSource() == button1) {
        dynamicText.setText("You've pressed Button 1!"); //We use setText for adding diferent texts in diferent cases of a same label behaviour.

    }
    if (e.getSource() == button2) {
        dynamicText.setText("You've pressed Button 2!");
    }
    if (e.getSource() == button3) {
        dynamicText.setText("You've pressed Button 3!");

    }
 }
 public static void main(String[] args) {
     X_Use_of_labels_buttons box = new X_Use_of_labels_buttons();
     box.setBounds(0,0,350,200);
     box.setVisible(true);
     box.setResizable(false);
     box.setLocationRelativeTo(null);
 }
}
