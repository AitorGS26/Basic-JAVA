/*
* For this lesson, we'll work with the same elements we've worked at the previous
lesson, the difference is going to be in the submenus.
* The submenu will be inside the menu option "options".
* There we'll find two options, one for resizing the window and
the other for changing the background color.
* Inside both there will be two options and this one are the final items.
* The two previous options are the submenus of "Options"*/

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class H2_Submenu_JMenu_JmenuBar_JMenuItem extends JFrame implements ActionListener {

    private JMenuBar menuBar;
    private JMenu Options, subMenu1, subMenu2;
    private JMenuItem item1menu1, item2menu1, item1menu2, item2menu2;

    public H2_Submenu_JMenu_JmenuBar_JMenuItem(){
        setLayout(null);

        menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        Options = new JMenu("Options");
        menuBar.add(Options);

        subMenu1 = new JMenu("Window Size");
        Options.add(subMenu1);

        item1menu1 = new JMenuItem("400 x 300");
        subMenu1.add(item1menu1);
        item1menu1.addActionListener(this);
        item2menu1 = new JMenuItem("600 x 500");
        subMenu1.add(item2menu1);
        item2menu1.addActionListener(this);

        subMenu2 = new JMenu("Window Colour");
        Options.add(subMenu2);

        item1menu2 = new JMenuItem("red");
        subMenu2.add(item1menu2);
        item1menu2.addActionListener(this);
        item2menu2 = new JMenuItem("blue");
        subMenu2.add(item2menu2);
        item2menu2.addActionListener(this);

    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == item1menu1){
            setSize(400,300);
        }
        if(e.getSource() == item2menu1){
            setSize(600,500);
        }
        if(e.getSource() == item1menu2){
            getContentPane() .setBackground(new Color(255,0,0));
        }
        if(e.getSource() == item2menu2){
            getContentPane() .setBackground(new Color(0,0,255));
        }
    }
    public static void main(String[]args){
        H2_Submenu_JMenu_JmenuBar_JMenuItem box = new H2_Submenu_JMenu_JmenuBar_JMenuItem();
        box.setBounds(0,0,400,300);
        box.setVisible(true);
        box.setLocationRelativeTo(null);
    }
}
