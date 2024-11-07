
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws Exception {
        
        try{
        FileReader reader = new FileReader("tekst.txt");
        int data = reader.read();
        while(data != -1){
            System.out.print((char)data);
            data = reader.read();
        }
        reader.close();
        
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
