
import javax.swing.JFrame;

public class MyFrame extends JFrame {

    DragPanel dragPanel = new DragPanel();
    
    MyFrame(){

        this.add(dragPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Drag & Drop demo");
        this.setSize(600, 600);
        this.setVisible(true);
    }
}
