/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package messingaround;

import javax.swing.JFrame;

public class FirstGui extends JFrame{

    
    public static void main(String[] args) {
        FirstGui gui =  new FirstGui();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setSize(200, 200);
        gui.setVisible(true);
        gui.setTitle("First Gui");
    }
}
