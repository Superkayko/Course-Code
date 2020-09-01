/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package messingaround;

import java.awt.*;
import javax.swing.*;
public class Gui2Objects extends JFrame{
    
    private JLabel label;
    private JButton button;
    private JTextField textField;
    
    public Gui2Objects() {
        setLayout(new FlowLayout());
        
        label = new JLabel("This is a label");
        add(label);
    
        
        textField = new JTextField(15);
        add(textField);
        
        button = new JButton("Click Me");
        add(button);
    }
    
    public static void main(String[] args) {
        Gui2Objects gui = new Gui2Objects();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setSize(500, 500);
        gui.setVisible(true);
        gui.setTitle("Gui2Objects");
    }
    
}
