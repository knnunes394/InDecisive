import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class PlannerWindow implements ActionListener {
    
    JFrame frame = new JFrame("InDecisive");

    public PlannerWindow(){
        createWindow();
        buttonProperties();
    }

    public void createWindow(){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel textLabel = new JLabel("Welcome to InDecisive",SwingConstants.CENTER);
        textLabel.setPreferredSize(new Dimension(300, 100));
        frame.getContentPane().add(textLabel, BorderLayout.CENTER);
        frame.setBounds(200,200,400,400);
        frame.setLocationRelativeTo(null);
        frame.pack();
        frame.setVisible(true);
    }

    public void buttonProperties(){

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //Changing Background Color
        frame.getContentPane().setBackground(Color.pink);
        frame.setBounds(400,400,800,800);
        frame.getContentPane();
    }

    public static void main(String args[]){
        new PlannerWindow();
    }

}
