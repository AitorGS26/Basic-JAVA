
import javax.swing.*;

public class Z_Swing_JTextarea extends JFrame{
    
    private JTextField textField0;
    private JTextArea textArea0;

    public Z_Swing_JTextarea (){

        setLayout(null);

        textField0 = new JTextField();
        textField0.setBounds(10,10,150,20);
        add(textField0);

        textArea0 = new JTextArea();
        textArea0.setBounds(10,40,400,300);
        add(textArea0);
    
    }
    public static void main(String[] args) {
        
        Z_Swing_JTextarea box = new Z_Swing_JTextarea();
        box.setBounds(0,0,500,450);
        box.setResizable(false);
        box.setVisible(true);

    }
}
