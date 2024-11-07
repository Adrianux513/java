
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame {

    MyPanel panel;
    Image icon;

    MyFrame(){

        panel = new MyPanel();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        icon = new ImageIcon("2.jpg").getImage();
        this.setIconImage(icon);

        this.add(panel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    
    
}
