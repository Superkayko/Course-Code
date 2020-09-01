/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package messingaround;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Gui5RandomNumGame extends JFrame {
    int randomNum, guess;
    private JButton button;
    private JTextField textField;
    private JLabel promptLabel;
    private JLabel resultLabel;
    private JLabel randomLabel;
    
    public Gui5RandomNumGame(){
        setLayout(new FlowLayout());
        
        promptLabel = new JLabel("Enter a random number 1-10");
        add(promptLabel);
        
        textField = new JTextField(6);
        add(textField);

        button = new JButton("Guess!");
        add(button);
        
        resultLabel = new JLabel("");
        resultLabel.setFont(new Font("Serif", Font.BOLD, 48));
        add(resultLabel);
        
        randomLabel = new JLabel("");
        add(randomLabel);
        
        event e = new event();
        button.addActionListener(e);
        
    }
    public class event implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            randomNum = (int)(Math.random() * 10 + 1);
            try{
                guess = (int)(Double.parseDouble(textField.getText())); 
                
                if(guess == randomNum){
                    resultLabel.setText("You Win!");
                    resultLabel.setForeground(Color.green);
                    
                } else if (guess != randomNum){
                    resultLabel.setText("You Lose");
                    resultLabel.setForeground(Color.red);
                    
                }
                randomLabel.setText("The random number generated was: " + randomNum);
            }
            catch(Exception x){
                resultLabel.setText("Invalid");
                resultLabel.setForeground(Color.red);
                randomLabel.setText("Please enter numbers only");
            }
        }
    }
    public static void main(String[] args) {
        Gui5RandomNumGame gui = new Gui5RandomNumGame();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setVisible(true);
        gui.setSize(1000, 200);
        gui.setTitle("Random Number Game");
        
    }
    
}
