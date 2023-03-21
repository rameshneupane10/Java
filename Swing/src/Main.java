import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args)
    {
        JFrame frame = new JFrame(" Hello World");
        frame.setTitle("Hello world from set title");
        frame.setResizable(false);   //disables the rezise
        frame.setSize(400 ,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);


        //adding of BUTTON
        JButton button = new JButton("click here");
        button.setBounds(100, 100, 100 ,50 );
        frame.add(button);

        JFormattedTextField formattedTextField = new JFormattedTextField("add text here:");
        formattedTextField.setBounds(100, 20, 200 ,50 );
        formattedTextField.getText();
        frame.add(formattedTextField);



        
        frame.getContentPane().setBackground(Color.red);





    }
}