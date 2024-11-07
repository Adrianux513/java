
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JFrame;

public class MyFrame extends JFrame implements ActionListener {


    JComboBox comboBox;

    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        String[] animals = {"dog","cat","bird"};

        comboBox = new JComboBox(animals);
        comboBox.addActionListener(this);

        //comboBox.setEditable(true);
        //System.out.println(comboBox.getItemCount());    //wyspisuje ile jest opcji do wyboru
        comboBox.addItem("horse");  //dodawanie opcji
        comboBox.insertItemAt("pig", 0);  //dodawanie opcji na danej pozycji
        comboBox.setSelectedIndex(0);  //który ma być wybrany domyślnie
        comboBox.removeItem("cat");  //usuwanie opcji poprzez wpisanie nazwy
        comboBox.removeItemAt(0);  //usuwanie opcji poprzez wybór indeksu
        //comboBox.removeAllItems();  //usuwanie wszystkich opcji

        this.add(comboBox);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==comboBox){
            System.out.println(comboBox.getSelectedItem());
            //System.out.println(comboBox.getSelectedIndex());
        }
    }
    
}
