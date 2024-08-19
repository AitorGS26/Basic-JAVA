import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;
import java.awt.*;

public class Terms_conditions extends JFrame implements ActionListener, ChangeListener{

    private JTextArea textArea;
    private JLabel label1, label2;
    private JButton button1, button2;
    private JCheckBox checkBox;
    private JScrollPane scrollPane;
    String name = "";

    public Terms_conditions(){
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Use licence");
        getContentPane().setBackground(new Color(20,20,20));
        setIconImage(new ImageIcon(getClass().getResource("images/logo.jpeg")).getImage());
        welcome welcomeWindow = new welcome();
        name = welcomeWindow.text;

        label1 = new JLabel("TERMS & CONDITIONS");
        label1.setBounds(280,5,200,30);
        label1.setFont(new Font("Andale Mono", 1, 14));
        label1.setForeground(new Color(255,255,255));
        add(label1);

        textArea = new JTextArea();
        textArea.setEditable(false);
        textArea.setFont(new Font("Andale Mono", 0, 9));
        textArea.setText("Terms & Conditions");
        scrollPane = new JScrollPane(textArea);
        scrollPane.setBounds(50,40,575,300);
        add(scrollPane);

        checkBox = new JCheckBox("The worker " + name + " accepts the terms & services");
        checkBox.setBounds(50,420,300,30);
        add(checkBox);
        checkBox.addChangeListener(this);


        button1 = new JButton("Accept");
        button1.setBounds(65,480,100,30);
        button1.addActionListener(this);
        button1.setEnabled(false);
        add(button1);

        button2 = new JButton("Decline");
        button2.setBounds(200,480,100,30);
        button2.addActionListener(this);
        button2.setEnabled(true);
        add(button2);

        ImageIcon image = new ImageIcon(getClass().getResource("/images/zerozero.png"));
        label2 = new JLabel(image);
        label2.setBounds(350,300,300,300);
        add(label2);
    }
    public void stateChanged(ChangeEvent e){
    if(checkBox.isSelected() == true){
        button1.setEnabled(true);
        button2.setEnabled(false);
    } else{
        button1.setEnabled(false);
        button2.setEnabled(true);
    }
    }
    public void actionPerformed (ActionEvent e){
        if(e.getSource() == button1){
            Main_interface mainBox = new Main_interface();
            mainBox.setBounds(0,0,600,600);
            mainBox.setVisible(true);
            mainBox.setResizable(false);
            mainBox.setLocationRelativeTo(null);

            this.setVisible(false);
        } else if (e.getSource() == button2) {
            welcome welcomeBox = new welcome();
            welcomeBox.setBounds(0,0,800,600);
            welcomeBox.setVisible(true);
            welcomeBox.setResizable(false);
            welcomeBox.setLocationRelativeTo(null);

            this.setVisible(false);
        }
    }
    public static void main (String[]args) {
        Terms_conditions licenseBox = new Terms_conditions();
        licenseBox.setBounds(0,0,700,600);
        licenseBox.setVisible(true);
        licenseBox.setResizable(false);
        licenseBox.setLocationRelativeTo(null);
    }
}
