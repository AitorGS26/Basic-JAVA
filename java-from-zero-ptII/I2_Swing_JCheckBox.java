/*
* Continuing with swing library, in this lesson we'll make a program with a checkbox.
*
* The checkboxes will include a language.
* When the user choose 1, that option will include at the title of the window.
* If the user choose more than one, the title will include all the options
in the order the user has selected*/

import javax.swing.*;
import javax.swing.event.*;//For this we need Changelistener which is inside the events of this library

public class I2_Swing_JCheckBox extends JFrame implements ChangeListener{

    private JCheckBox check1, check2, check3;

    public I2_Swing_JCheckBox(){
        setLayout(null);

        check1 = new JCheckBox("English");
        check1.setBounds(10,10,150,30);
        check1.addChangeListener(this);
        add(check1);

        check2 = new JCheckBox("Spanish");
        check2.setBounds(10,50,150,30);
        check2.addChangeListener(this);
        add(check2);

        check3 = new JCheckBox("French");
        check3.setBounds(10,90,150,30);
        check3.addChangeListener(this);
        add(check3);
    }
    //here is the change, until now we've seen actionPerformed, action event.
    //but for this we'll use stateChanged and ChangeEvent.
    public void stateChanged(ChangeEvent e){
        String chain = "";//we declare the chain that will memorize the options the user have chosen.
        if (check1.isSelected() == true){
            chain = chain + "English-";
        }
        if (check2.isSelected() == true){
            chain = chain + "Spanish-";
        }
        if (check3.isSelected() == true){
            chain = chain + "French-";
        }
        setTitle(chain); //the chain will set on the title.
    }
    public static void main (String[]args) {
       I2_Swing_JCheckBox box = new I2_Swing_JCheckBox();
       box.setBounds(0,0,400,300);
       box.setVisible(true);
       box.setResizable(false);
       box.setLocationRelativeTo(null);

    }
}
