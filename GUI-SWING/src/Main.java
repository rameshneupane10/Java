import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args)
    {

        JFrame frame =new JFrame();
        frame.setTitle("NEW PAGE");

        //login part
        JTextField userName = new JTextField("Enter your username");
        userName.setBounds(10,10,300,50);
        frame.add(userName);

        JTextField password = new JTextField("Enter your password");
        password.setBounds(10,60,300,50);
        frame.add(password);

        //button
        JButton button = new JButton("login");
        button.setBounds(120,120,70,20);
        frame.add(button);

        //combobox
        String [] fruits={"Apple","Banana","Mango"};
        JComboBox comboBox =new JComboBox<>(fruits);
        comboBox.setBounds(120,150,70,20);
        frame.add(comboBox);

        //frame
        frame.setLayout(null);
        frame.setSize(1000,1000);
        frame.getContentPane().setBackground(Color.cyan);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);



    }
}