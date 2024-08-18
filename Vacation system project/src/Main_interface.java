import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main_interface extends JFrame implements ActionListener {
    private JMenuBar mb;
    private JMenu options, calculate, about, menuBackground;
    private JMenuItem calculation, black, blue, pink, creator, exit, newUser;
    private JLabel logo, title, name, surname1, surname2, dept, seniority, result, footer;
    private JTextField worker, workerSurname1, workerSurname2;
    private JComboBox comboDpt, comboSnty;
    private JScrollPane scrollPane;
    private JTextArea textArea;
    String adminName = "";

    public Main_interface(){
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Welcome " + adminName);
        getContentPane().setBackground(new Color(20,20,20));
        setIconImage(new ImageIcon(getClass().getResource("images/logo.jpeg")).getImage());
        welcome welcomeWindow = new welcome();
        adminName = welcomeWindow.text;

        mb = new JMenuBar();
        mb.setBackground(new Color(20,20,20));
        setJMenuBar(mb);

        options = new JMenu("Options");
        options.setBackground(new Color(20,20,20));
        options.setFont(new Font("Andale Mono", 1, 14));
        options.setForeground(new Color(255,255,255));
        mb.add(options);

        calculate = new JMenu("Calculation");
        calculate.setBackground(new Color(20,20,20));
        calculate.setFont(new Font("Andale Mono", 1, 14));
        calculate.setForeground(new Color(255,255,255));
        mb.add(calculate);

        about = new JMenu("Options");
        about.setBackground(new Color(20,20,20));
        about.setFont(new Font("Andale Mono", 1, 14));
        about.setForeground(new Color(255,255,255));
        mb.add(about);

        menuBackground = new JMenu("Background color");
        menuBackground.setFont(new Font("Andale Mono", 1, 14));
        menuBackground.setForeground(new Color(0,0,0));
        options.add(menuBackground);

        calculation = new JMenuItem("Vacation");
        calculation.setFont(new Font("Andale Mono", 1, 14));
        calculation.setForeground(new Color(0,0,0));
        calculate.add(calculation);
        calculation.addActionListener(this);

        black = new JMenuItem("Black");
        black.setFont(new Font("Andale Mono", 1, 14));
        black.setForeground(new Color(0,0,0));
        menuBackground.add(black);
        black.addActionListener(this);

        blue = new JMenuItem("Blue");
        blue.setFont(new Font("Andale Mono", 1, 14));
        blue.setForeground(new Color(0,0,0));
        menuBackground.add(blue);
        blue.addActionListener(this);

        pink = new JMenuItem("Pink");
        pink.setFont(new Font("Andale Mono", 1, 14));
        pink.setForeground(new Color(0,0,0));
        menuBackground.add(pink);
        pink.addActionListener(this);

        creator = new JMenuItem("Developer's info");
        creator.setFont(new Font("Andale Mono", 1, 14));
        creator.setForeground(new Color(0,0,0));
        about.add(creator);
        creator.addActionListener(this);

        newUser = new JMenuItem("New data");
        newUser.setFont(new Font("Andale Mono", 1, 14));
        newUser.setForeground(new Color(0,0,0));
        options.add(newUser);
        newUser.addActionListener(this);

        exit = new JMenuItem("Exit");
        exit.setFont(new Font("Andale Mono", 1, 14));
        exit.setForeground(new Color(0,0,0));
        options.add(exit);
        exit.addActionListener(this);

        ImageIcon image = new ImageIcon(getClass().getResource("/images/main.png"));
        logo = new JLabel(image);
        logo.setBounds(65,1,474,199);
        add(logo);


        title = new JLabel("Worker's data for vacation calculation");
        title.setBounds(95,190,900,25);
        title.setFont(new Font("Andale Mono", 2, 24));
        title.setForeground(new Color(255,255,255));
        add(title);

        name = new JLabel("Name");
        name.setBounds(25,238,180,25);
        name.setFont(new Font("Andale Mono", 1, 12));
        name.setForeground(new Color(255,255,255));
        add(name);

        worker = new JTextField();
        worker.setBounds(25,258,150,25);
        worker.setBackground(new Color(220,220,220));
        worker.setFont(new Font("Andale Mono", 1, 14));
        worker.setForeground(new Color(100,100,255));
        add(worker);

        surname1 = new JLabel("Second name");
        surname1.setBounds(25,298,180,25);
        surname1.setFont(new Font("Andale Mono", 1, 12));
        surname1.setForeground(new Color(255,255,255));
        add(surname1);

        workerSurname1 = new JTextField();
        workerSurname1.setBounds(25,319,150,25);
        workerSurname1.setBackground(new Color(220,220,220));
        workerSurname1.setFont(new Font("Andale Mono", 1, 14));
        workerSurname1.setForeground(new Color(100,100,255));
        add(workerSurname1);

        surname2 = new JLabel("Surname");
        surname2.setBounds(25,358,180,25);
        surname2.setFont(new Font("Andale Mono", 1, 12));
        surname2.setForeground(new Color(255,255,255));
        add(surname2);

        workerSurname2 = new JTextField();
        workerSurname2.setBounds(25,378,150,25);
        workerSurname2.setBackground(new Color(220,220,220));
        workerSurname2.setFont(new Font("Andale Mono", 1, 14));
        workerSurname2.setForeground(new Color(100,100,255));
        add(workerSurname2);

        dept = new JLabel("Select your department");
        dept.setBounds(270,238,180,25);
        dept.setFont(new Font("Andale Mono", 1, 12));
        dept.setForeground(new Color(255,255,255));
        add(dept);

        comboDpt = new JComboBox();
        comboDpt.setBounds(270,258,220,25);
        comboDpt.setBackground(new Color(220,220,220));
        comboDpt.setFont(new Font("Andale Mono", 1, 14));
        comboDpt.setForeground(new Color(0,0,0));
        add(comboDpt);
        comboDpt.addItem("");
        comboDpt.addItem("Customer service");
        comboDpt.addItem("Logistics");
        comboDpt.addItem("Managers");

        seniority = new JLabel("Select your seniority");
        seniority.setBounds(270,298,180,25);
        seniority.setFont(new Font("Andale Mono", 1, 12));
        seniority.setForeground(new Color(255,255,255));
        add(seniority);

        comboSnty = new JComboBox();
        comboSnty.setBounds(270,319,220,25);
        comboSnty.setBackground(new Color(220,220,220));
        comboSnty.setFont(new Font("Andale Mono", 1, 14));
        comboSnty.setForeground(new Color(0,0,0));
        add(comboSnty);
        comboSnty.addItem("");
        comboSnty.addItem("1 year of service");
        comboSnty.addItem("From 2 to 6 years of service");
        comboSnty.addItem("7 or more years of service");

        result = new JLabel("Result of calculation");
        result.setBounds(270,358,180,25);
        result.setFont(new Font("Andale Mono", 1, 12));
        result.setForeground(new Color(255,255,255));
        add(result);

        textArea = new JTextArea();
        textArea.setEditable(false);
        textArea.setFont(new Font("Andale Mono", 1, 11));
        textArea.setText("\n\n Here will appear the result of the calculation \n");
        scrollPane = new JScrollPane(textArea);
        scrollPane.setBounds(270, 378, 300, 90);
        add(scrollPane);

        footer = new JLabel("2024 Zero company || All the rights reserved");
        footer.setBounds(135,500,500,30);
        footer.setFont(new Font("Andale Mono", 1, 12));
        footer.setForeground(new Color(255,255,255));
        add(footer);





    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == calculation){
            String workerName = worker.getText();
            String secondName = surname1.getText();
            String surname = surname2.getText();
            String department = comboDpt.getSelectedItem().toString();
            String seniority = comboSnty.getSelectedItem().toString();

            if(workerName.equals("") || secondName.equals("") || surname.equals("") || department.equals("") || seniority.equals("")){
                JOptionPane.showMessageDialog(null, "Please fill all the fields");
            } else {
                if (department.equals("Customer service")) {
                    if (seniority.equals("1 year of service")) {
                        textArea.setText("The worker " + workerName + "\n Who works at" + department + "\n With " + seniority +"\n Has the right to have 6 days of vacation");
                    }
                    if (seniority.equals("From 2 to 6 years of service")) {
                        textArea.setText("The worker " + workerName + "\n Who works at" + department + "\n With " + seniority +"\n Has the right to have 14 days of vacation");
                    }
                    if (seniority.equals("7 or more years of service")) {
                        textArea.setText("The worker " + workerName + "\n Who works at" + department + "\n With " + seniority +"\n Has the right to have 20 days of vacation");
                    }
                }
                if (department.equals("Logistics")) {
                    if (seniority.equals("1 year of service")) {
                        textArea.setText("The worker " + workerName +
                                         "\n Who works at" + department +
                                         "\n With " + seniority +
                                         "\n Has the right to have 7 days of vacation");
                    }
                    if (seniority.equals("From 2 to 6 years of service")) {
                        textArea.setText("The worker " + workerName +
                                         "\n Who works at" + department +
                                         "\n With " + seniority +
                                         "\n Has the right to have 15 days of vacation");
                    }
                    if (seniority.equals("7 or more years of service")) {
                        textArea.setText("The worker " + workerName +
                                        "\n Who works at" + department +
                                        "\n With " + seniority +
                                        "\n Has the right to have 22 days of vacation");
                    }
                }
                if (department.equals("Managers")) {
                    if (seniority.equals("1 year of service")) {
                        textArea.setText("The worker " + workerName +
                                         "\n Who works at" + department +
                                         "\n With " + seniority +
                                         "\n Has the right to have 10 days of vacation");
                    }
                    if (seniority.equals("From 2 to 6 years of service")) {
                        textArea.setText("The worker " + workerName +
                                         "\n Who works at" + department +
                                         "\n With " + seniority +
                                         "\n Has the right to have 20 days of vacation");
                    }
                    if (seniority.equals("7 or more years of service")) {
                        textArea.setText("The worker " + workerName +
                                         "\n Who works at" + department +
                                         "\n With " + seniority +
                                         "\n Has the right to have 30 days of vacation");
                    }
                }
            }
        }
        if(e.getSource() == black){
          getContentPane().setBackground(new Color(0,0,0));
        }
        if(e.getSource() == blue){
            getContentPane().setBackground(new Color(0,150,255));
        }
        if(e.getSource() == pink){
            getContentPane().setBackground(new Color(255,0,150));
        }
        if(e.getSource() == newUser){
          worker.setText("");
          surname1.setText("");
          surname2.setText("");
          comboDpt.setSelectedIndex(0);
          comboSnty.setSelectedIndex(0);
          textArea.setText("\n\n Here will appear the result of the calculation \n");
        }
        if(e.getSource() == exit){
            welcome welcomeBox = new welcome();
            welcomeBox.setBounds(0,0,800,600);
            welcomeBox.setVisible(true);
            welcomeBox.setResizable(false);
            welcomeBox.setLocationRelativeTo(null);

            this.setVisible(false);
        }
        if(e.getSource() == creator){
          JOptionPane.showMessageDialog(null,"Developed by Zero company's development team, \n Aitor garcia sierra");
        }

    }
    public static void main(String [] args){
        Main_interface mainBox = new Main_interface();
        mainBox.setBounds(0,0,600,600);
        mainBox.setVisible(true);
        mainBox.setResizable(false);
        mainBox.setLocationRelativeTo(null);

    }
}
