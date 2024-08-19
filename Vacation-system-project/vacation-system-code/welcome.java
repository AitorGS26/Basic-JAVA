/*
* "Zero" Company, want's a program with GUI (graphical user interface) for doing
the calculation of the vacation days of theis workers.
* Depending on their position and seniority, the total amount of days is different
and for that reason, the company has given the following requirements:

*** Design and functionality ***

* 1 Welcome interface *
    A) The First screen will include the following:
    * Brand's color and logo
    * Brand's image at the icon of the application
    * A button for giving permisson to access to the next window
    * At the bottom of the interface, it will apear the legend "2024 Zero company"

    B) Functionality of this interface
    * Capture user
    * Not allowing to continue to the nwxt window if the user have not typed his name.
    * if the user writes the name, allow to continue to the next window.
    *

* 2 Terms and conditions interface *
    A) Terms and condition page will include:
    * Brand's color and logo
    * Brand's image at the icon of the application
    * Field for reading terms & conditions
    * Way to accept terms and conditions to the user.
    * Accept button
    * Decline button

    B) Functionality of this interface:
    * The user's name will appear somewhere at the screen, confirming that this user
    is the one who has accepted the terms and conditions.
    * The accept button will be disabled until the user clicks the "I accept the terms
    and conditions" and the decline button will be all the time enabled.
    * When the user clicks on "I accept the terms and conditions", accept button
    will be enabled, and decline button disabled.

* 3 Main interface *
    A) The main screen will include:
    * Brand's color and logo
    * Brand's image at the icon of the application
    * Upper menu with different options ()
    * Text fields for name, surname and result of worker's amount of vacation days.
    * A drop-down list for selecting the department and seniority of the worker
    * At the bottom of the interface, it will apear the legend "2024 Zero company"

    B) Functionality of the interface:
    * User's name will appear somewhere of the screen
    * User will be allowed to personalize the interface
    * An option to restart the calculation
    * there will be an option for going back to welcome screen
    * A method fot doing the calculation of the days depending on user's answers
    * Add all the things ordered  for a clean vision

    *  Conditions for de amount of days of vacation per each worker *
    *
    * Customer service *
    * 1 year working - 6 days of vacation
    * between 2-6 years working - 14 days of vacation
    * after 7 years working - 20 days of vacation
    *
    * Logistic *
    *
    *  1 year working - 7 days of vacation
    * between 2-6 years working - 15 days of vacation
    * after 7 years working - 22 days of vacation
    *
    * managers *
    *
    *  1 year working - 10 days of vacation
    * between 2-6 years working - 20 days of vacation
    * after 7 years working - 30 days of vacation*/

/*Steps for this project*
*
* 1 - Design the different interfaces we'll see
*       a) Welcome interface
*           i) 1 jtextfile (user)
*           ii) 4 Jlabel (title, subtitle, introduce name, bottom rights reserved
*           iii) 1 button for continuing
*       b) terms & conditions
*           i) 2 labels
*           ii) 1 jcheckbox
*           iii) 2 buttons
*           iiii) 1jtextarea
*           iiiii) 1 jscrollpane
*       c) Main interface
*           i) Jlabel
*           ii) JMenubar - 1
*           iii) JMenu
*
* 2 - Give them the functionality
* 3 - Packaging of the app.*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class welcome extends JFrame implements ActionListener {

    private JTextField textField;
    private JLabel label1, label2, label3, label4;
    private JButton button;
    public static String text = "";

    public welcome () {
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Welcome");
        getContentPane().setBackground(new Color(20,20,20));
        setIconImage(new ImageIcon(getClass().getResource("images/logo.jpeg")).getImage());

        ImageIcon image = new ImageIcon(getClass().getResource("/images/zerozero.png"));
        label1 = new JLabel(image);
        label1.setBounds(250,30,330,250);
        add(label1);


        label2 = new JLabel("Vacation Control System");
        label2.setBounds(300,220,300,30);
        label2.setFont(new Font("Andale Mono", 3, 18));
        label2.setForeground(new Color(255,255,255));
        add(label2);

        label3 = new JLabel("Please, introduce your name");
        label3.setBounds(45,340,300,30);
        label3.setFont(new Font("Andale Mono", 3, 12));
        label3.setForeground(new Color(255,255,255));
        add(label3);

        label4 = new JLabel("2024 Zero company || All the rights reserved");
        label4.setBounds(300,500,300,30);
        label4.setFont(new Font("Andale Mono", 3, 10));
        label4.setForeground(new Color(255,255,255));
        add(label4);

        textField = new JTextField();
        textField.setBounds(45,370,400,25);
        textField.setBackground(new Color(220,220,220));
        textField.setFont(new Font("Andale Mono", 1, 14));
        textField.setForeground(new Color(100,100,255));
        add(textField);

        button = new JButton("Enter");
        button.setBounds(45,400,255,25);
        button.setBackground(new Color(255,255,255));
        button.setFont(new Font("Andale Mono", 1, 14));
        button.setForeground(new Color(100,100,255));
        button.addActionListener(this);
        add(button);
    }
    public void actionPerformed (ActionEvent e){
        if(e.getSource() == button){
            text = textField.getText().trim();
            if(text.equals("")){
                JOptionPane.showMessageDialog(null, "You have to introduce your name first");
            }else{
                Terms_conditions licenseBox = new Terms_conditions();
                licenseBox.setBounds(0,0,700,600);
                licenseBox.setVisible(true);
                licenseBox.setResizable(false);
                licenseBox.setLocationRelativeTo(null);

                this.setVisible(false);
            }

        }
    }
    public static void main(String []args){

        welcome welcomeBox = new welcome();
        welcomeBox.setBounds(0,0,800,600);
        welcomeBox.setVisible(true);
        welcomeBox.setResizable(false);
        welcomeBox.setLocationRelativeTo(null);



    }
}
