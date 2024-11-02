/*In today's lesson, we'll be learning what and for which case do we use JLabel.
  
 * As we've seen in the previous lesson, JLabel give us the chance of displaying 
 text in label format in our java program.
 * 
 * We can program where the text of the label will be displayed and also in which size.
 * 
 * Exercise 1.
 * Make a graphical interface using swing library, 
 * 
 * It has to have 2 labels with the text you choose, 
 *
 * The first one's size will be 100px width 40px height 
 * The second one 90 px width and 30 height. 
 * The window will be displayed in the center of the screen, 
 * It won't be resizable and the user will have the possibility to move it.*/

import javax.swing.*; //first of all, we import the swing librari por being able to use it

public class V_Swing_Graphical_interface_2 extends JFrame{ 
    
    private JLabel title; //now we declare the two labels that the exercise asks.
    private JLabel subtitle;


    /**We add the builder, with the same name as the class, chaining them.
     * The layout will be added by us so we add null to setlayout() feature
     * 
     * We start with the title adding the text we wan't to that label
     * we use the setbounds method to add the size of the title
     * and then all this will be add() -ed to title label
     * Then we do the same to the subtitle
     */
    public V_Swing_Graphical_interface_2(){
      setLayout(null);
      title = new JLabel("This is the title of the new GUI"); 
      title.setBounds(10,20,100,40); 
      add(title); 

      subtitle = new JLabel("and this the subtitle");
      subtitle.setBounds(15,50,90,30);
      add(subtitle);        
    }

    public static void main(String[] args) { 
    /*after bulding our label, now we'll have to build the container where the text 
    will be inside of. The object type will be the name of the class for chaining with
    it and with the builder*/
    V_Swing_Graphical_interface_2 container = new V_Swing_Graphical_interface_2(); 
    
    //now we've to set the size and the conditions of the display.
    container.setBounds(0,0,500,300); //container's position and size
    container.setResizable(false);//feature for giving permisson or not to the user, for resizing the window
    container.setVisible(true);//this is always on this method for giving visibility to the container
    container.setLocationRelativeTo(null); //for displaying it centered.
    }
}

