/*
 * For the nex exercise we'll be combining JtextField, JtextArea and JButton.
 * 
 * Exercise => Make a program where you introduce text in a text field and when you press a button, that text goes to
  other text area. */


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class B2_Swing_FromTextField_to_TextArea extends JFrame implements ActionListener{
    //As we saw in a previous lesson, when we are going to work with buttons, we've to add "implements ActionListener"
    private JTextField textfield0;
    private JScrollPane scrollpanel0;
    private JTextArea textarea0;
    private JButton button0;

    String text = ""; 
    //This string variable is for later use it to program the action of getting the data from textfield and setting the data in textarea

    public B2_Swing_FromTextField_to_TextArea(){
        
        setLayout(null);

        textfield0 = new JTextField();
        textfield0.setBounds(10,10,200,30);
        add(textfield0);

        button0 = new JButton("add");
        button0.setBounds(250,10,100,30);
        add(button0);
        button0.addActionListener(this); //we say to the program thet the event will come from button0

        textarea0 = new JTextArea();
        scrollpanel0 = new JScrollPane(textarea0); // we add a scrollpanel for allowing to scroll in the textarea.
        scrollpanel0.setBounds(10,50,400,300);
        add(scrollpanel0);
        
    }
    public void actionPerformed(ActionEvent e){ //here we program the event.
        if (e.getSource() == button0) { //if the action event comes from button0 do..
            text += textfield0.getText() + "\n"; //here text variable get the text from textfield0 and saves it thanks of +=
            textarea0.setText(text);//and here text sets the saved text in textarea0
            textfield0.setText("");//for cleaning the textfield.
        }
    }
    public static void main(String[] args) {
        
        B2_Swing_FromTextField_to_TextArea box = new B2_Swing_FromTextField_to_TextArea();
        box.setBounds(0,0,540,400);
        box.setVisible(true);
        box.setLocationRelativeTo(null);
        box.setResizable(false);
    }
}
