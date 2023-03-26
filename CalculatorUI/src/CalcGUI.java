import javax.swing.*;
import javax.swing.plaf.basic.BasicOptionPaneUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcGUI implements ActionListener
{
    JFrame frame = new JFrame();
    JTextField t1 = new JTextField();
    JTextField t2 = new JTextField();
    JTextField t3 = new JTextField();

    JButton button= new JButton("ADD");

    void rendor()
    {
        //textbox first
        t1.setBounds(10,10,150,50);
        frame.add(t1);
        t1.getText();

        //textbox second
        t2.setBounds(10,60,150,50);
        frame.add(t2);
        t2.getText();

        //textbox third
        t3.setBounds(10,110,150,50);
        frame.add(t3);
        t3.getText();


        //button
        button.setBounds(10,175,60,20);
        frame.add(button);
        button.addActionListener(this);



        //frame components
        frame.setSize(400,400);
        frame.setTitle("CALCULATOR");
        frame.setResizable(false);
        frame.setLocationRelativeTo(null); //windows draws to center
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int num1= Integer.parseInt(t1.getText());
        int num2 = Integer.parseInt(t2.getText());

        int sum =num1+num2;
        t3.setText(String.valueOf(sum));

    }
}
