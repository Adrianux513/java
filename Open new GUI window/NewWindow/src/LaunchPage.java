import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class LaunchPage implements ActionListener {

    JFrame frame = new JFrame();
    JButton button = new JButton("New Window");


    public LaunchPage() {

        button.setBounds(100,160,200,40);
        button.setFocusable(false);
        button.addActionListener(this);

        frame.add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource()==button){
            frame.dispose();  //po kliknięciu przycisku zamyka się okno w nim i zostaje tylko z napisem hello; uniemożliwia to tworzenie większej ilości okien
            NewWindow myWindow = new NewWindow();
        }
    }

    
    
}
