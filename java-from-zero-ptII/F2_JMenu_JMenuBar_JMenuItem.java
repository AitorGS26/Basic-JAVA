/*
* In this lesson we'll start working with a menu bar, ir will have 3 options
with different colours, when the user click on one of them, the background will change
of colour.*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class F2_JMenu_JMenuBar_JMenuItem extends JFrame implements ActionListener {
//First of all we've to declare the menu bar, the menu and the items of the menu.
    private JMenuBar menuBar;
    private JMenu options;
    private JMenuItem item1, item2, item3;

    public F2_JMenu_JMenuBar_JMenuItem(){
        //set the menu bar.
        setLayout(null);
        menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        //then inside of the menu bar, we add the option "options"
        options = new JMenu("Options");
        menuBar.add(options);
        //Inside of Options, we introduce the 3 options of colour in this case.
        item1 = new JMenuItem("Red");
        item1.addActionListener(this);
        options.add(item1);

        item2 = new JMenuItem("Green");
        item2.addActionListener(this);
        options.add(item2);

        item3 = new JMenuItem("Blue");
        item3.addActionListener(this);
        options.add(item3);

    }
    //Declaring action event for the items inside of Options
    public void actionPerformed(ActionEvent e){
        //First of all, we create the container
        Container background = this.getContentPane();
        //We set the conditions and the logic of each item.
        if (e.getSource() == item1){
            background.setBackground(new Color(255,0,0));
        }
        if(e.getSource() == item2){
            background.setBackground(new Color(0,255,0));
        }
        if(e.getSource() == item3){
            background.setBackground(new Color(0,0,255));
        }
    }
    public static void main (String[]args){
//finally we add the main method and we create the box. adding the features we want.
        F2_JMenu_JMenuBar_JMenuItem box = new F2_JMenu_JMenuBar_JMenuItem();
        box.setBounds(0,0,400,350);
        box.setVisible(true);
        box.setResizable(false);
        box.setLocationRelativeTo(null);
    }
}
