/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package messingaround;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Gui7Beeper extends JFrame {
    JButton button;
    JLabel label;
    int counter = 0, x = 0;
    String s;
    public Gui7Beeper(){
        setLayout(new FlowLayout());
        
        
        button = new JButton("Click for sound");
        add(button);
        
        label = new JLabel("");
        add(label);
        
        event e = new event();
        button.addActionListener(e);
    }
    public class event implements ActionListener {
        public void actionPerformed(ActionEvent e){
            Toolkit.getDefaultToolkit().beep();
            counter++;
            if(x == 0){
                s = "time";
            }else if (x== 1){
                s = "times";
            }
            label.setText( "You have clicked " + counter + " " +s );
            x = 1;
            
        }
    }
    public static void main(String[] args) {
        Gui7Beeper gui = new Gui7Beeper();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setSize(300,200);
        gui.setVisible(true);
        gui.setTitle("Beeper");
    }
    
}
