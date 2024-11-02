/**In this case we'll change the window's size but with radio button
   this will appear in the window like three options to click on them
  in each option when the user clicks in it the window will change it's size 
 */

import javax.swing.*;
import javax.swing.event.*;


public class I2_Swing_JRadioButton extends JFrame implements ChangeListener{

    private JRadioButton radio1, radio2, radio3;
    private ButtonGroup bg;

    public I2_Swing_JRadioButton(){
        setLayout(null);
        /*After declaring the elements we'll be using in the exercise, we've to add a 
        button group, this is for achieving all the events for the same feature in one place
        bg will save the event of three options  */
        bg = new ButtonGroup();

        radio1 = new JRadioButton("400px x 300px");
        radio1.setBounds(10,20,130,30);
        radio1.addChangeListener(this);
        add(radio1);
        bg.add(radio1);

        radio2 = new JRadioButton("500px x 400px");
        radio2.setBounds(10,70,130,30);
        radio2.addChangeListener(this);
        add(radio2);
        bg.add(radio2);

        radio3 = new JRadioButton("600px x 500px");
        radio3.setBounds(10,120,130,30);
        radio3.addChangeListener(this);
        add(radio3);
        bg.add(radio3);
    }
    /*Then we declare the logic of the program, depending on which option 
    chooses the user, the window will change it's size*/
    public void stateChanged(ChangeEvent e){
        if(radio1.isSelected() == true){
            setSize(400,300);
        }
        if(radio2.isSelected() == true){
            setSize(500,400);
        }
        if(radio3.isSelected() == true){
            setSize(600,500);
        }
    }
    //Then as always main method and the box which will contain all the above.
    public static void main(String[]args){
        I2_Swing_JRadioButton box = new I2_Swing_JRadioButton();

        box.setBounds(0,0,350,230);
        box.setVisible(true);
        box.setResizable(true);
        box.setLocationRelativeTo(null);
    }
}
