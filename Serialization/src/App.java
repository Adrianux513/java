import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;

public class App {
    public static void main(String[] args) throws Exception {
        
        User user = new User();

        user.name = "Adrianek";
        user.password = "lolz";

        FileOutputStream fileOut = new FileOutputStream("UserInfo.ser");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(user);
        out.close();
        fileOut.close();

        System.out.println("object info saved! ;)");

        long serialVersionUID = ObjectStreamClass.lookup(user.getClass()).getSerialVersionUID();
        System.out.println(serialVersionUID);
    }
}
