
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class MyFrame extends JFrame implements ActionListener {


    JButton button;
    JCheckBox checkBox;
    ImageIcon checkIcon; 
    ImageIcon xIcon; 

    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        checkIcon = new ImageIcon("checkmark.jpg");
        xIcon = new ImageIcon("x.jpg");

        button = new JButton();
        button.setText("submit");
        button.addActionListener(this);

        checkBox = new JCheckBox();
        checkBox.setText("I'm not a robot");
        checkBox.setFocusable(false);  //znika obramówka w okół tekstu
        checkBox.setFont(new Font("Consolas", Font.PLAIN, 35));
        checkBox.setIcon(xIcon);
        checkBox.setSelectedIcon(checkIcon);

        this.add(button);
        this.add(checkBox);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==button){
            System.out.println(checkBox.isSelected());
        }
    }
    
}
