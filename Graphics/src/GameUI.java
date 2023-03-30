import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameUI extends JPanel implements ActionListener
{
        int GameUIX=10;
        int GameUIY=10;


        GameUI()
        {
            setBackground(Color.cyan);
            JButton button =new JButton("click to move");
            add(button);
            button.addActionListener(this);
        }

        @Override
        protected void paintComponent (Graphics g)
        {
            super.paintComponent(g);
            g.setColor(Color.black);
            g.fillRect(GameUIX,GameUIY, 100, 100);

            g.setColor(Color.white);
            g.fillRect(GameUIX,GameUIY, 100, 100);
//
//            g.setColor(Color.black);
//            g.fillRect(10, 210, 100, 100);
//
//            g.setColor(Color.white);
//            g.fillRect(10, 310, 100, 100);
//
//            g.setColor(Color.white);
//            g.fillRect(110, 10, 100, 100);
//
//            g.setColor(Color.black);
//            g.fillRect(210, 10, 100, 100);
//
//            g.setColor(Color.white);
//            g.fillRect(310, 10, 100, 100);
//
//            g.setColor(Color.white);
//            g.fillRect(210, 110, 100, 100);
//
//            g.setColor(Color.black);
//            g.fillRect(210, 210, 100, 100);
//
//            g.setColor(Color.white);
//            g.fillRect(110, 210, 100, 100);
//
//            g.setColor(Color.black);
//            g.fillRect(110, 110, 100, 100);
//
//            g.setColor(Color.black);
//            g.fillRect(110, 310, 100, 100);
//
//            g.setColor(Color.white);
//            g.fillRect(210, 310, 100, 100);
//
//            g.setColor(Color.black);
//            g.fillRect(310, 110, 100, 100);
//
//            g.setColor(Color.white);
//            g.fillRect(310, 210, 100, 100);
//
//            g.setColor(Color.black);
//            g.fillRect(310, 310, 100, 100);

        }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("clicked");
        GameUIX+=10;
        GameUIY+=10;
        repaint();
    }
}


