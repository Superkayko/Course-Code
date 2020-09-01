/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package messingaround;

import java.awt.*;
import javax.swing.*;

public class Gui3Images extends JFrame{
    private ImageIcon image;
    private JLabel label;
    
    Gui3Images() {
        setLayout(new FlowLayout());
        
        image = new ImageIcon(getClass().getResource("plane.jpeg"));
        
        label = new JLabel(image);
        add(label);
    }
    
    public static void main(String[] args) {
        Gui3Images gui = new Gui3Images();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setVisible(true);
        gui.pack();
        gui.setTitle("Gui3Images");
    }
    
}
