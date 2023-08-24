import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class TopLevelWindow implements ActionListener{

    JButton button = new JButton("Meep");
    JFrame frame = new JFrame("InDecisive");

    public TopLevelWindow(){
        createWindow();
        buttonProperties();
    }
    public void createWindow(){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel textLabel = new JLabel("Welcome to InDecisive",SwingConstants.CENTER);
        textLabel.setPreferredSize(new Dimension(300, 100));
        //frame.getContentPane().setLayout();
        frame.getContentPane().add(textLabel, BorderLayout.CENTER);
        frame.setBounds(200,200,400,400);
        //Display Window
        frame.setLocationRelativeTo(null);
        frame.pack();
        frame.setVisible(true);
    }

    public void buttonProperties(){
        frame.getContentPane().add(button, BorderLayout.LINE_END);
        button.setBounds(50,50,50,50);
        button.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //Changing Background Color
        frame.getContentPane().setBackground(Color.pink);
 
    }

    public static void main(String args[]){
        new TopLevelWindow();
    }
}