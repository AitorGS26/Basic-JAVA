import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class K2_Swing_Terms_Conditions extends JFrame implements ActionListener, ChangeListener{

    private JLabel label;
    private JCheckBox checkBox;
    private JButton button;

    public K2_Swing_Terms_Conditions(){
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
    public void stateChanged(ChangeEvent e){
        if(checkBox.isSelected() == true){
          button.setEnabled(true);
        } else{
            button.setEnabled(false);
        }
    }
    public void actionPerformed(ActionEvent b){
        if(b.getSource() == button){
            System.exit(0);
        }
    }
    public static void main (String[]args) {
        K2_Swing_Terms_Conditions box = new K2_Swing_Terms_Conditions();
        box.setBounds(0,0,400,300);
        box.setVisible(true);
        box.setResizable(false);
        box.setLocationRelativeTo(null);
    }
}
