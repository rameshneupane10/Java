import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class GUI implements ActionListener
{
    JFrame frame = new JFrame("NOTEPAD");

    JTextArea textArea = new JTextArea();

    JButton button =new JButton("save");

    public void rendor()
    {
        frame.setSize(500,500);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.add(button);
        frame.add(textArea);
        frame.setLocationRelativeTo(null);

        textArea.setBounds(5,0,490,490);


        button.setBounds(200,400,90,30);
        button.addActionListener(this);

        File file = new File("text.txt");
        try
        {
            file.createNewFile();
        }
        catch (IOException ex)
        {
            System.out.println(ex);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource()==button)
        {
            try
            {
                FileWriter fileWriter = new FileWriter("text.txt");
                fileWriter.write(String.valueOf(textArea.getText()));
                fileWriter.close();
            }
            catch (IOException ex)
            {
                System.out.println(ex);
            }

        }

    }
}


