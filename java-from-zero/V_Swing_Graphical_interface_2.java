/*
 * The first swing lesson could be a little bit astonishing, but we'll continue with it part for part for understanding well 
 all the information and how to use it.

 * In today's lesson, we'll be learning what and for which use do we use JLabel.
 * 
 * As we've seen in the previous lesson, JLabel give us the chance of displaying text in label format in our java program.
 * 
 * We can program where the text of the label will be displayed and also in which size.
 * 
 * Exercise 1.
 * Make a graphical interface using swing library, it has to have 2 labels with the text you choose, the first one's size
 will be 100px width 40px height and the second one 90 px width and 30 height.
 The window will be displayed in the center of the screen, it won't be resizable and the user will have the possibility to move it.
 */

import javax.swing.*; //first of all, we import the swing librari por being able to use it

public class V_Swing_Graphical_interface_2 extends JFrame{ //then we tell the program that inside of swing, we'll be usinf JFrame class.
    
    private JLabel title; //now we declare the two labels that the exercise asks.
    private JLabel subtitle;

    public V_Swing_Graphical_interface_2(){ //after declarig the labels, we need the builder, for building the labels.
      setLayout(null); //it gives permisson to set the layout of the label, but we add null for bulding it ourselves, we only need it to declare the setlayout
      title = new JLabel("This is the title of the new GUI"); //This is the way to set the text on the label.
      title.setBounds(10,20,100,40); //We also have the position (left,up) and the size (width, height)
      add(title); //We add the label
      //we don't need to put the feature set layout for the other label, this is also under the first one.
      subtitle = new JLabel("and this the subtitle");
      subtitle.setBounds(15,50,90,30);
      add(subtitle);        
    }

    public static void main(String[] args) { //after bulding our label, now we'll have to build the container where the text will be inside of.

    V_Swing_Graphical_interface_2 container = new V_Swing_Graphical_interface_2(); //we create an object, with the same name as the class and the builder, then all the elements are on chain. This will be the container.
    //now we've to set the size and the conditions of the display.
    container.setBounds(0,0,500,300); //container's position and size
    container.setResizable(false);//feature for giving permisson or not to the user, for resizing the window
    container.setVisible(true);//this is always on this method for giving visibility to the container
    container.setLocationRelativeTo(null); //for displaying it centered.
    }
}

