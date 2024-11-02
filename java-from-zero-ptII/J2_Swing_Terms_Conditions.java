/*In this case, we'll do a program which has a text area with the terms and conditions
simmulating a real one, we'll add a checkbox and a button.
 * The functonality will be the following, the close button will be unavailable,
 when the user check the checkbox, user will be allowed to ckick the close button
 but untill the checkbox is not clicked, the close button will be always unavailable. */

import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class J2_Swing_Terms_Conditions extends JFrame implements ActionListener, ChangeListener{

    private JLabel label;//In this case we add onlu a label for doing it faster
    private JCheckBox checkBox;
    private JButton button;

    public J2_Swing_Terms_Conditions(){
        setLayout(null);

        label = new JLabel("Agree the terms and conditions.");
        label.setBounds(10,10,400,30);
        add(label);

        checkBox = new JCheckBox("Terms & Conditions");
        checkBox.setBounds(10,50,100,30);
        checkBox.addChangeListener(this);
        add(checkBox);

        button = new JButton("Close");
        button.setBounds(10,100,100,30);
        button.addActionListener(this);
        button.setEnabled(false);
    }

    /*Here is the thing, if checbox is selected, we enable the button, if not it won't
    be enabled */
    public void stateChanged(ChangeEvent e){
        if(checkBox.isSelected() == true){
          button.setEnabled(true);
        } else{
            button.setEnabled(false);
        }
    }
    /*Then for finishing the logic, when the button is enabled, we'll catch the event and will
    fo sistem.exit(0), which means without errors.
     */
    public void actionPerformed(ActionEvent b){
        if(b.getSource() == button){
            System.exit(0);
        }
    }
    public static void main (String[]args) {
        J2_Swing_Terms_Conditions box = new J2_Swing_Terms_Conditions();
        box.setBounds(0,0,400,300);
        box.setVisible(true);
        box.setResizable(false);
        box.setLocationRelativeTo(null);
    }
}
