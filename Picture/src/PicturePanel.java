import javax.swing.*;
import java.awt.*;

public class PicturePanel extends JPanel {
    public PicturePanel(){
        setBackground(Color.LIGHT_GRAY);
    }
    public void paint(Graphics g){
        super.paint(g);

        g.setColor(Color.red);
        g.fillRect(225,175,150,60);
        g.fillRect(200,200,200,60);

        g.setColor(Color.white);
        g.fillOval(200,200,200,200);

        g.setColor(Color.blue);
        g.fillOval(150,400,300,500);

        g.setColor(Color.black);
        g.fillOval(340,275,23,23);
        g.fillOval(240,275,23,23);

        g.setColor(Color.cyan);
        g.fillOval(340,275,20,20);
        g.fillOval(240,275,20,20);

        g.setColor(Color.black);
        g.fillRect(250,350,100,10);

    }
}
