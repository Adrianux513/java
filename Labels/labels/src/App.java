import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class App {
    public static void main(String[] args) throws Exception {
        
        ImageIcon image = new ImageIcon("ikonka.jpg");
        Border border = BorderFactory.createLineBorder(Color.green,3);

        JLabel label = new JLabel();  //create a label
        label.setText("Smutna zaba JPG");  //set text of label
        label.setIcon(image);  //add a image
        label.setHorizontalTextPosition(JLabel.CENTER);  //set text left, center or right of imageicon
        label.setVerticalTextPosition(JLabel.TOP);  //set text top, center or bottom of imageicon
        label.setForeground(Color.cyan);  //set color of text
        label.setFont(new Font("MV Boli",Font.PLAIN,100));  //set font of text
        label.setIconTextGap(10);  //set gap of text to image
        label.setBackground(Color.black);  //set background color
        label.setOpaque(true);  //display background color
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER);  //set vertical position of icon+text within label
        label.setHorizontalAlignment(JLabel.CENTER);  //set horizontal postion of icon+text within label
        //label.setBounds(100, 100, 282, 320);  //set x,y postion within frame as well as dimensions

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        //frame.setLayout(null);
        frame.setVisible(true);
        frame.add(label);
        frame.pack();
    }
}
