import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class MyPanel extends JPanel {

    Image image;

    MyPanel() {

        image = new ImageIcon("3.jpg").getImage();
        this.setPreferredSize(new Dimension(500,500));
    }

    public void paint(Graphics g){

        Graphics2D g2D = (Graphics2D) g;

        g2D.setPaint(Color.blue);
        g2D.setStroke(new BasicStroke(5));

        g2D.drawImage(image, 0, 100, null);

        //g2D.drawLine(0, 0, 500, 500);  //linia

        //g2D.drawRect(0, 0, 100, 200);  //prostokąt
        //g2D.fillRect(0, 0, 100, 200);  //zamalowany prostokąt

        //g2D.drawOval(0, 0, 100, 100);  //okrąg
        //g2D.fillOval(0, 0, 100, 100);  // zamalowany okrąg

        //g2D.setPaint(Color.red);
        //g2D.drawArc(0, 0, 100, 100, 0, 180);
        //g2D.fillArc(0, 0, 100, 100, 0, 180);
        //g2D.setPaint(Color.white);
        //g2D.fillArc(0, 0, 100, 100, 180, 180);

        int[] xPoints = {150,250,350};
        int[] yPoints = {300,150,300};
        //g2D.drawPolygon(xPoints, yPoints, 3);
        g2D.fillPolygon(xPoints, yPoints, 3);

        g2D.setFont(new Font("Ink Free", Font.BOLD, 50));
        g2D.drawString("U R A WINNER!!! ;D", 50, 50);

        
    }

    
    
}
