/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package messingaround;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Gui6Menus extends JFrame{
    
    JMenuBar menuBar;
    JMenu file;
    JMenuItem exit;
    
    public Gui6Menus(){
        setLayout(new FlowLayout());
        
        menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        
        file = new JMenu("File");
        menuBar.add(file);
        
        exit = new JMenuItem("Exit");
        file.add(exit);
        
        event e = new event();
        exit.addActionListener(e);
        
    }
    
    public class event implements ActionListener {
        public void actionPerformed (ActionEvent e){
            System.exit(0);
        }
    }
    public static void main(String[] args) {
        Gui6Menus gui = new Gui6Menus();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setVisible(true);
        gui.setSize(200, 200);
        gui.setTitle("Menu");
        
    }
    
}
