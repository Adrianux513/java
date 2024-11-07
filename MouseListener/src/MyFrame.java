
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame implements MouseListener {


    JLabel label;
    ImageIcon icon1;
    ImageIcon icon2;
    ImageIcon icon3;
    ImageIcon icon4;

    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(new FlowLayout());
        

        icon1 = new ImageIcon("1.png");
        icon2 = new ImageIcon("2.jpg");
        icon3 = new ImageIcon("3.jpg");
        icon4 = new ImageIcon("4.png");

        label = new JLabel();

        /*label.setBounds(0, 0, 100, 100);
        label.setBackground(Color.red);
        label.setOpaque(true);*/

        label.addMouseListener(this);
        label.setIcon(icon1);

        this.add(label);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        label.setIcon(icon1);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("You pressed a mouse");
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        label.setIcon(icon2);
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        label.setIcon(icon3);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        label.setIcon(icon4);
        
    }
    
}
