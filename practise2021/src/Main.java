import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main  {

    public static void main(String[] args)
    {
      JFrame frame =new JFrame("multlipliction");
      frame.setSize(500,500);
      frame.setLayout(null);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      JLabel label = new JLabel("1st num:");
      label.setBounds(10,10,20,20);
      frame.add(label);

      JTextField tf1 = new JTextField();
      tf1.setBounds(30,20,60,30);
      frame.add(tf1);

      JTextField tf2 = new JTextField();
      tf2.setBounds(30,80,60,30);
      frame.add(tf2);

      JTextField tf3 = new JTextField();
      tf3.setBounds(30,140,60,30);
      tf3.setEditable(false);
      frame.add(tf3);

      JButton button1 =new JButton();
      button1.setBounds(30,190,50,50);
      frame.add(button1);


      JButton button2 = new JButton();
      button2.setBounds(80,190,50,50);
      frame.add(button2);

      button1.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            int num1 = Integer.parseInt(tf1.getText());
            int num2 = Integer.parseInt(tf2.getText());
           int product =num1 * num2;
           tf3.setText(String.valueOf(product));
        }
      });

      button2.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          System.exit(0);
        }
      });

        frame.setVisible(true);
    }
}