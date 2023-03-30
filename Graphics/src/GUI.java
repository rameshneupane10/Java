import javax.swing.*;
import java.awt.*;

public class GUI

{
    JFrame frame =new JFrame();
    GameUI gameUI = new GameUI();



    public void  rendor()
    {
        frame.add(gameUI);
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
