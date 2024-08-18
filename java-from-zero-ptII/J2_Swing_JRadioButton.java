import javax.swing.*;
import javax.swing.event.*;


public class J2_Swing_JRadioButton extends JFrame implements ChangeListener{

    private JRadioButton radio1, radio2, radio3;
    private ButtonGroup bg;

    public J2_Swing_JRadioButton(){
        setLayout(null);

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
    public static void main(String[]args){
        J2_Swing_JRadioButton box = new J2_Swing_JRadioButton();

        box.setBounds(0,0,350,230);
        box.setVisible(true);
        box.setResizable(true);
        box.setLocationRelativeTo(null);
    }
}
