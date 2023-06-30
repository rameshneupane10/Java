import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Closeable;

public class Main implements ActionListener {
    static JTextField textField1 = new JTextField();
    static JTextField textField2 = new JTextField();
    static JTextField textField3 = new JTextField();

    public static void main(String[] args) {
        JFrame frame = new JFrame("Multiplication");

        frame.setBounds(500, 500, 250, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        textField1.setBounds(20, 20, 50, 50);
        frame.add(textField1);

        textField2.setBounds(80, 20, 50, 50);
        frame.add(textField2);

        textField3.setBounds(140, 20, 50, 50);
        textField3.setEditable(false);
        frame.add(textField3);

        JButton button = new JButton("Mul");
        button.setBounds(90, 80, 50, 50);
        button.addActionListener(new Main());
        frame.add(button);

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int num1 = Integer.parseInt(textField1.getText());
        int num2 = Integer.parseInt(textField2.getText());

        int product = num1 * num2;
        textField3.setText(String.valueOf(product));
    }
}
