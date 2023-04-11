import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener
{
    JFrame frame = new JFrame();

    JButton button1 = new JButton("MAX");
    JButton button2 =new JButton("MIN");

    int num=1;
    JLabel label =new JLabel(String.valueOf(num));

    public void rendor()
    {

        //frame components
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);
        frame.setResizable(false);
        frame.setLayout(null);

        //button 1 components
        button1.setBounds(10,10,60,20);
        button1.setBackground(Color.GREEN);
        button1.addActionListener(this);
        frame.add(button1);

        //button 2 components
        button2.setBounds(100,10,60,20);
        button2.setBackground(Color.RED);
        button2.addActionListener(this);
        frame.add(button2);

        //label components
        label.setBounds(80,40,200,50);
        frame.add(label);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==button1)
        {
           num++;
            label.setText(String.valueOf(num));

        }
        if(e.getSource()==button2)
        {
            num--;
            label.setText(String.valueOf(num));

        }
    }
}
