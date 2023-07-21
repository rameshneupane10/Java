import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args)
    {
        // for creating a frame
        JFrame frame = new JFrame("java");


        // for creation of label
        JLabel label1 = new JLabel("N1");
        label1.setBounds(10,50,20,20);
        frame.add(label1);

        JLabel label2 = new JLabel("N2");
        label2.setBounds(10,80,20,20);
        frame.add(label2);

        JLabel label3 = new JLabel("result");
        label3.setBounds(10,110,50,20);
        frame.add(label3);

        // for creation of textfield
        JTextField tf1 =new JTextField();
        tf1.setBounds(30,50,80,30);
        frame.add(tf1);

        JTextField tf2 =new JTextField();
        tf2.setBounds(30,80,80,30);
        frame.add(tf2);

        JTextField tf3 =new JTextField();
        tf3.setBounds(30,110,80,30);
        tf3.setEditable(false);
        frame.add(tf3);

        //for creation of button
        JButton okbutton = new JButton("OK");
        okbutton.setBounds(40,150,80,20);
        frame.add(okbutton);
        okbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                int n1 = Integer.parseInt(tf1.getText());
                int n2 = Integer.parseInt(tf2.getText());
                int n3 = n1 + n2 ;
                tf3.setText(String.valueOf(n3));
            }
        });

        JButton exitbutton = new JButton("EXIT");
        exitbutton.setBounds(130,150,80,20);
        frame.add(exitbutton);
        exitbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)

            {
                System.exit(0);
            }
        });
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setVisible(true);
    }
}