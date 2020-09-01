/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package messingaround;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Gui4Events extends JFrame {
    
    private JLabel label;
    private JLabel label1;
    private JTextField textField;
    private JButton button;
    
    public Gui4Events() {
        setLayout(new FlowLayout());
        
        label = new JLabel("Enter your text here");
        add(label);
        
        textField = new JTextField(15);
        add(textField);
        
        button = new JButton("Enter");
        add(button);
        
        label1 = new JLabel("");
        label1.setFont(new Font("Serif", Font.BOLD, 48));
        add(label1);
        
        event e = new event();
        button.addActionListener(e);
    }
    public class event implements ActionListener {
        public void actionPerformed(ActionEvent e){
            String Input = textField.getText();
            label1.setText(Input);
        }
    }
    public static void main (String args[]){
        Gui4Events gui = new Gui4Events();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setSize(400,400);
        gui.setVisible(true);
        gui.setTitle("Gui4Events");
    }
}
