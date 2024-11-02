/*
 *In today's lesson we will do a program which displays a window with a close button, 
 * 
 * For now we've seen one fuctionaloty of swing library, now we'll se
 a fuctionality about awt.event library, this is because the button we've
 to build, is called event, so we need a library with the event functionality.

 * The awt.event library, provides the event of the button we've coded,
 for example if the button's function is to close the window (as the example we'll be 
 seeing below) this library will provide the functionality to the button.

 * Swing will provide de design of the graphical interface and the button in this case.
 */

/*For using the librarys, we start importing all the features they've with *, this is
because for now we don't know which features we will be needing*/
 import java.awt.event.*;
 import javax.swing.*;

public class W_Swing_JButton extends JFrame implements ActionListener {
/* extends => extensions of the JDK
 * JFrame => the name of the class of the jdk we'll be using.
 * implements => we tell that weare implementing somthing in the graphical interface
 * ActionListener => This implmentation is for telling the class to be waiting an user's 
 * action, for example press the button.*/

    JButton CloseButton; 
    //we declare the component we'll be using (a button) and give it a name.
    public W_Swing_JButton(){ 
    //After declaring the button, we'll create a builder for giving the design to the button
     setLayout(null);
     CloseButton = new JButton("Close");
     CloseButton.setBounds(300,250,100,30);
     add(CloseButton); 
     /* The above is the design of the button, we start setting the function setlayout, putting null for having the 
      permisson to design ourselves. 
      * Then we create the buttons text
      * After that we put the placement and size of the button
      * Finally with add method we add al those things for our button.*/
     
     CloseButton.addActionListener(this); 
     /*we tell the program that CloseButton will have an event, we tell to actionlistener
     to be waiting the button CloseButton, function.*/
    
    }
    /* As we said above, for we create a button succesfully, it has two parts. First of all
    the design, that we already have done it.
    * Now we'll do the buttons functionality. Or in other words, we'll be coding the event.*/

     public void actionPerformed(ActionEvent c){ 
    /* This method if for allowing us to "capture" the event.
    When the user click the button, it occurs an event, but if anything captures that event,
    the event is lost. This method is for that, for capturing the event, in this case the 
    user's click in the button. 
 
    In this case, we've created space in the memory, called "c", for saving the event
    the user's click*/

    if(c.getSource() == CloseButton){ 
    /*we compare the information saved in "c", after the event with the button we've created, 
    this is for ensuring the event and the button are the correct ones both of them. 
    
    * Sometimes there are so many buttons to take in account and with this all of them will 
    be organized*/
        System.exit(0); //this will be the button's action, in this case close the window

        }
     }
    public static void main(String[] args) { //We add main method, for running the program 
        
        W_Swing_JButton box = new W_Swing_JButton();//our class object for the container

        /**giving form to the container or window */
        box.setBounds(0,0,400,300);
        box.setVisible(true); 
        box.setResizable(false); 
        box.setLocationRelativeTo(null);
    }
    }
