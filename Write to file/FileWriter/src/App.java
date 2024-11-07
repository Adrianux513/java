import java.io.FileWriter;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws Exception {
        
        try {
        FileWriter writer = new FileWriter("tekst.txt");
        writer.write("Ala ma kota \nKot ma Ale \nKtoś ma coś \nCoś ma ktoś");
        writer.append("\n(tekst na końcu ;*)");
        writer.close();
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
