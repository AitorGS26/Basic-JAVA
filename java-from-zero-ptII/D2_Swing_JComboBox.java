/*JComboBox is a feature of swing lubrary, from the class JFrame.
 * This is used for making lists where the user will choose one of the options of the list
 like when you want to choose the size of the text in word, that list of different sizes is JComboBox.

 * For understanding better, we'll do an example.
 * 
 * Example => Make a program that will display a list of colours, the user will choose one of them and then 
  the title of the window will change it's name by the colour that user have chosen*/

  import java.awt.event.*;
  import javax.swing.*;
  
public class D2_Swing_JComboBox extends JFrame implements ItemListener{
//Itemlistener is simmilar to Actionlistener, but now the user will chose one of a list of different items, so we use this one.
   
private JComboBox comboBox;

public D2_Swing_JComboBox(){
    setLayout(null);

    comboBox = new JComboBox();
    comboBox.setBounds(10,10,80,20);
    add(comboBox);

    comboBox.addItem("Blue");
    comboBox.addItem("Red");
    comboBox.addItem("Green");
    comboBox.addItem("Yellow");
    comboBox.addItem("Purple");
    comboBox.addItemListener(this);
}
public void itemStateChanged(ItemEvent e){ //as we've seen when we work with buttons, there we need actionListener, but here we're talking about items.
//so we need ItemStateChanged for verifying the item is changed by the one the user have selected, it creates an event, called e
    if (e.getSource() == comboBox) { //The user selects a colour from the list, then e is equal to comboBox so..
     String election = comboBox.getSelectedItem().toString(); //we capture the selected item and change it to string.
     setTitle(election); //we set that string to title
    }
}
    public static void main(String[] args) {
        
        D2_Swing_JComboBox box = new D2_Swing_JComboBox();
        box.setBounds(0,0,300,150);
        box.setVisible(true);
        box.setResizable(false);
        box.setLocationRelativeTo(null);
    }
}
