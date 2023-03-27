import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PhoneBook implements ActionListener {
    JFrame frame = new JFrame();
    JTextField t1 = new JTextField();
    JTextField t2 = new JTextField();
    JTextField t3 = new JTextField();
    JButton button = new JButton("insert");
    JButton button2 = new JButton("reset");

    JTable table;
    DefaultTableModel model;

    JLabel label1 = new JLabel("name:");
    JLabel label2 = new JLabel("city:");
    JLabel label3 = new JLabel("phone:");

    public void render() {
        // first textbox
        t1.setBounds(70, 10, 100, 50);
        frame.add(t1);

        // second textbox
        t2.setBounds(70, 65, 100, 50);
        frame.add(t2);

        // third textbox
        t3.setBounds(70, 120, 100, 50);
        frame.add(t3);

        // first button
        button.setBounds(90, 180, 80, 20);
        frame.add(button);
        button.addActionListener(this);

        // second button
        button2.setBounds(190, 180, 80, 20);
        frame.add(button2);
        button2.addActionListener(this);

        // table
        String[] columns = {"Name", "City", "Phone"};
        model = new DefaultTableModel(columns, 0);
        table = new JTable(model);
        table.setBounds(50, 220, 300, 150);
        frame.add(table);

        // labels
        label1.setBounds(10, 20, 30, 20);
        frame.add(label1);
        label2.setBounds(10, 80, 30, 20);
        frame.add(label2);
        label3.setBounds(10, 140, 30, 20);
        frame.add(label3);

        // frame components 
        frame.setResizable(false);
        frame.setSize(500, 500);
        frame.setTitle("PHONEBOOK");
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button)
        {
            String name = t1.getText();
            String city = t2.getText();
            String num = t3.getText();
            Object[] data = {name, city, num};
            model.addRow(data);
            t1.setText("");
            t2.setText("");
            t3.setText("");
        }
        else if (e.getSource() == button2) {
            t1.setText("");
            t2.setText("");
            t3.setText("");
        }
    }
}
