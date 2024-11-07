import java.io.File;

public class App {
    public static void main(String[] args) throws Exception {
        
        File file = new File("wiadomosc.txt");

        if(file.exists()){
            System.out.println("That file exists! :O");
            System.out.println(file.getPath());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.isFile());
            //file.delete();
        }
        else{
            System.out.println("That file doesn't exist! ;c");
        }
    }
}
