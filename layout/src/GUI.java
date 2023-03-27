import javax.swing.*;
import java.awt.*;

public class GUI {


    JFrame frame =new JFrame();
    JPanel p1 =new JPanel();
    JPanel p2 =new JPanel();
    JPanel p3 =new JPanel();
    JPanel p4 =new JPanel();
    JPanel p5 =new JPanel();




    public void render()

    {
        frame.setLayout(new BorderLayout());
        p1.setBackground(Color.ORANGE);

        frame.add(p1,BorderLayout.WEST);
        frame.setSize(300,300);


        p2.setBackground(Color.BLUE);
        frame.add(p2,BorderLayout.EAST);

        p3.setBackground(Color.RED);
        frame.add(p3,BorderLayout.NORTH);

        p4.setBackground(Color.GREEN);
        frame.add(p4,BorderLayout.SOUTH);

        p5.setBackground(Color.CYAN);
        frame.add(p5,BorderLayout.CENTER);


        p5.setLayout(new GridLayout(2,2));
        p5.add(new JButton("click me"));
        p5.add(new JButton("click me"));
        p5.add(new JButton("click me"));


        p1.setLayout(new BoxLayout(p1,BoxLayout.Y_AXIS));
        p1.add(new JButton("click me"));
        p1.add(new JButton("click me"));
        p1.add(new JButton("click me"));



        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}
