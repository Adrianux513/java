import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame {

    MyFrame(){

        this.setTitle("Mega tytuł");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //exit out of application
        this.setResizable(false);
        this.setSize(420,420);  //sets the x-dimension and y-dimentions
        this.setVisible(true);  //make this visible

        ImageIcon image = new ImageIcon("ikonka.png");  //create an ImageIcon

        this.setIconImage(image.getImage());  //change icon of this
        this.getContentPane().setBackground(Color.cyan);  //chango color of background
    }
}
