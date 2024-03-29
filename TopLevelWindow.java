import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class TopLevelWindow implements ActionListener{

    JButton button = new JButton("Press me B*****");
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
        frame.getContentPane().add(button, BorderLayout.PAGE_END);
        button.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //Changing Background Color
        PlannerWindow planner = new PlannerWindow();
        planner.createWindow();
        frame.setVisible(false);
       /*  frame.getContentPane().setBackground(Color.pink);
        frame.setBounds(400,400,800,800);
        frame.getContentPane();
        */
    }

    public static void main(String args[]){
        new TopLevelWindow();
    }
}