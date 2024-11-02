/*
 * For the next lesson we'll work with text boxes and user's interaction.
 * We'll do an exercise where when the user writes an username in a text box and submit it, 
 the title of the window will change.*/

import java.awt.event.*;
import javax.swing.*;

public class Y_Swing_JButton_JtextField extends JFrame implements ActionListener{
/**After importing the needed librarys and putting the class extend Jframe and
 * implement ActionListener, we add the objects we'll be working with
 */
    private JLabel label0;
    private JButton button0;
    private JTextField textField0;

    /**After declaring the objects we add the builder and size each of them */
    public Y_Swing_JButton_JtextField(){
        
        setLayout(null);

        label0 = new JLabel("User");
        label0.setBounds(10,10,100,30);
        add(label0);

        textField0 = new JTextField();
        textField0.setBounds(120,17,150,20);
        add(textField0);

        button0 = new JButton("Submit");
        button0.setBounds(10,80,100,30);
        add(button0);
        button0.addActionListener(this);
        /*button 0 will be the one listenin to user's action*/
    }

    public void actionPerformed(ActionEvent e){ 
        /*if the event comes from button 0 (user's click), the user's text inside the 
        textfield will be saved in text string, then with setTitle method it will be the 
        new title.*/
        if (e.getSource() == button0) {
            String text = textField0.getText();
            setTitle(text);
        }
    }
    public static void main(String[] args) {
        
        Y_Swing_JButton_JtextField box = new Y_Swing_JButton_JtextField();
        box.setBounds(0,0,300,150);
        box.setVisible(true);
        box.setResizable(false);
        box.setLocationRelativeTo(null);
    }
}
