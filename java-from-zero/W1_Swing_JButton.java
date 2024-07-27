/*
 * Here is the previous lesson code clean.
 */

import java.awt.event.*;
import javax.swing.*;

 public class W1_Swing_JButton extends JFrame implements ActionListener{

    JButton CloseButton;
    public W1_Swing_JButton(){
        CloseButton = new JButton("Close");
        CloseButton.setBounds(300,250,100,30);
        add(CloseButton);
        CloseButton.addActionListener(this);
    } 
public void actionPerformed(ActionEvent c){
    if (c.getSource() == CloseButton) {
        System.exit(0);        
    }
  }

  public static void main(String[] args) {
      W1_Swing_JButton box = new W1_Swing_JButton();
      box.setBounds(0,0,450,350);
      box.setVisible(true);
      box.setResizable(false);
      box.setLocationRelativeTo(null);
  }
}