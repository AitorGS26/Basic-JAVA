/*
 * Parsing is the way we tell the program for exaple a "String" is really other 
   information like int or float...
 
 * Thanks to this, we can do a programs like below.
  
 * Exercise=> Make a program who has two labels which mention value1 or value 2 and after 
   user has setted two values inside the text there will be an answer with the result.
 */
import java.awt.event.*;
import javax.swing.*;
//First of all we have to do the design of the elements we're using.
public class C2_Swing_Parsing extends JFrame implements ActionListener{

    private JLabel label0, label1, label2;
    private JTextField textField0, textField1;
    private JButton button0;

    public C2_Swing_Parsing(){
        setLayout(null);
        
        label0 = new JLabel ("value 1:");
        label0.setBounds(50,5,100,30);
        add(label0);

        label1 = new JLabel ("value 2:");
        label1.setBounds(50,35,100,30);
        add(label1);

        label2 = new JLabel("Answer:");
        label2.setBounds(120,80,100,30);
        add(label2);

        textField0 = new JTextField();
        textField0.setBounds(120,10,150,20);
        add(textField0);

        textField1 = new JTextField();
        textField1.setBounds(120,40,150,20);
        add(textField1);

        button0 = new JButton("add");
        button0.setBounds(10,80,100,30);
        add(button0);
        button0.addActionListener(this);

    }
    //Then, as shown below we do the logic of the program for making it work.
    public void actionPerformed(ActionEvent e){ //we declare an event called e
        if (e.getSource() == button0) {//we get source from e and compare with button0's event
            int value1 = 0, value2 = 0, answer = 0; //we declare three variables

            value1 = Integer.parseInt(textField0.getText()); 
            /*here is where we do the parse, Integer.parseInt is for interpreting text as int, 
            but we can do with float...*/
            value2 = Integer.parseInt(textField1.getText());
            answer = value1 + value2;
            
            label2.setText("Answer: " + answer);
        }
    }
    public static void main(String[] args) {
        
        C2_Swing_Parsing box = new C2_Swing_Parsing();

        box.setBounds(0,0,300,150);
        box.setVisible(true);
        box.setResizable(false);
        box.setLocationRelativeTo(null);
    }
}
