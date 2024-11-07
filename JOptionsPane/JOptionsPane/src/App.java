
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        
        //JOptionPane.showMessageDialog(null, "This is some useless info", "title", JOptionPane.PLAIN_MESSAGE);
        //JOptionPane.showMessageDialog(null, "This is some useless info", "title", JOptionPane.INFORMATION_MESSAGE);
        //JOptionPane.showMessageDialog(null, "This is some useless info", "title", JOptionPane.QUESTION_MESSAGE);
        //JOptionPane.showMessageDialog(null, "This is some useless info", "title", JOptionPane.WARNING_MESSAGE);
        //JOptionPane.showMessageDialog(null, "This is some useless info", "title", JOptionPane.ERROR_MESSAGE);

        int answer = JOptionPane.showConfirmDialog(null, "Choose the answer", "This is my title", JOptionPane.YES_NO_CANCEL_OPTION);
    
        switch(answer){
            case -1:
            System.out.println("You close window");
            break;

            case 0:
            System.out.println("Yes");
            break;

            case 1:
            System.out.println("No");
            break;

            case 2:
            System.out.println("Cancel");
            break;
        }

        String name = JOptionPane.showInputDialog("What is your name?: ");
        System.out.println("Hello "+ name);

        String[] responses = {"No, you're awesome!", "thank you", "*blush*"};
        ImageIcon icon = new ImageIcon("ikonka.jpg");
        JOptionPane.showOptionDialog(null, "You are awesome!", "secret message", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, icon, responses, 0);
    }
}
