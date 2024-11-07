import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class ProgressBarDemo {

    JFrame frame = new JFrame();
    JProgressBar bar = new JProgressBar(0,100);

    ProgressBarDemo() {

        bar.setValue(0);
        bar.setBounds(0,0,420,50);
        bar.setStringPainted(true); //dodaje % do progress bar
        bar.setFont(new Font("MV Boli",Font.BOLD,25));
        bar.setForeground(Color.red);
        bar.setBackground(Color.black);

        frame.add(bar);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);

        fill();
    }
    
    public void fill(){
        int counter =100;

        while(counter>1){
            bar.setValue(counter);
            bar.setString(counter + " / 100HP");  //pokazuje liczę a nie %
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            counter -=1;
        }
        bar.setString("You die ;c");
    }
    
}
