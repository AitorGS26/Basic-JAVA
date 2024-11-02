/* 
 * In the previous class, we worked with JtextArea, With this feature, we can write some 
 different lines of text. The problem starts when we want to continue writing and we 
 can't see the last lines.
 * This happens because we haven't program the scroll bar of the right side, 
 that one we use in all the windows we work with.
 * For fixing this, we've the feature JScrollPanel.

 * We'll better see with an example, we'll use the same as preoious class, but adding
 JScrollPanel*/

import javax.swing.*;

public class A2_Swing_JScrollPanel extends JFrame{

    private JTextField textfield0;
    private JTextArea textarea0;
    private JScrollPane scrollpane0;

    public A2_Swing_JScrollPanel(){
        
        setLayout(null);

        textfield0 = new JTextField();
        textfield0.setBounds(10,10,200,25);
        add(textfield0);

        textarea0 = new JTextArea();
        textarea0.setBounds(20,40,450,300);
        add(textarea0);
        /* The functionality is the same as we've been seen on previous lessons, the 
        difference is that for being inside of the text area, we've to tell the scroll 
        panel where it will be inside of, as below. */
        scrollpane0 =new JScrollPane(textarea0);
        scrollpane0.setBounds(10,50,400,300);
        add(scrollpane0);

    }

    public static void main(String[] args) {
        
        A2_Swing_JScrollPanel box = new A2_Swing_JScrollPanel();
        box.setBounds(0,0,500,400);
        box.setVisible(true);
        box.setResizable(false);
        box.setLocationRelativeTo(null);
    }
    
}