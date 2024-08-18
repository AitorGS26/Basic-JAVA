/*
* For this exercise, we'll continue working with swing library and awt librarys.
* For today's lesson we'll do a rgb button, the user will introduce the value
of green, blue and red and then there will appear the wanted colour.
*
* Let's look at the examnple
* */

/*
* First of all, we'll import the librarys we are working with*/

import java.awt.*; //buttons
import java.awt.event.*; //The design
import javax.swing.*; //the event

public class G2_RGB_button extends JFrame implements ActionListener {
//we extend the class to JFrame and implement ActionLinstener for the button
    private JLabel label1, label2, label3;
    private JComboBox combo1, combo2, combo3;
    private JButton button;
//Declaring 3 labels for the users knowledge of each button which colour is
    public G2_RGB_button(){
        setLayout(null);
        label1 = new JLabel("Red: ");
        label1.setBounds(10,10,100,10);
        add(label1);
//label for the red colour
        combo1 = new JComboBox();
        combo1.setBounds(120,10,50,30);
        for (int i = 0; i<=255; i++){
            combo1.addItem(String.valueOf(i));
        }
        add(combo1);
//Tonalities for red.
        label2 = new JLabel("Green:  ");
        label2.setBounds(10,50,100,10);
        add(label2);
//label for green
        combo2 = new JComboBox();
        combo2.setBounds(120,50,50,30);
        for (int i = 0; i<=255; i++){
            combo2.addItem(String.valueOf(i));
        }
        add(combo2);
//Tonalities for green
        label3 = new JLabel("Blue: ");
        label3.setBounds(10,90,100,10);
        add(label3);
//label for green
        combo3 = new JComboBox();
        combo3.setBounds(120,90,50,30);
        for (int i = 0; i<=255; i++){
            combo3.addItem(String.valueOf(i));
        }
        add(combo3);
//tonalities for blue
        button = new JButton("Check");
        button.setBounds(10,130,180,60);
        add(button);
        button.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == button){
            //we catch the information of each combobox ad pass it to String for beaing capable of catching it
            String ch1 = combo1.getSelectedItem() .toString();
            String ch2 = combo2.getSelectedItem() .toString();
            String ch3 = combo3.getSelectedItem() .toString();
//Now we parse them
            int red = Integer.parseInt(ch1);
            int green = Integer.parseInt(ch2);
            int blue = Integer.parseInt(ch3);
//we put the background to the check button for checking the colour we've created
            Color colour1 = new Color(red, green, blue);
            button.setBackground(colour1);

        }
    }
    public static void main(String [] args){
        G2_RGB_button RGBbutton = new G2_RGB_button();
        RGBbutton.setBounds(0,0,300,280);
        RGBbutton.setVisible(true);
        RGBbutton.setResizable(false);
        RGBbutton.setLocationRelativeTo(null);
    }
}
