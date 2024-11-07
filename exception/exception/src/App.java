import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        //używane jeżeli jest niebezpieczne np. ktoś może dzielić przez 0 lub przez wyraz a nie liczbę i aby można było mu wyświetlić komunikat z błędem
        try{

            System.out.println("Enter a whole numer to devide: ");
            int x = scanner.nextInt();

            System.out.println("Enter a whole numer to devide by: ");
            int y = scanner.nextInt();

            int z = x/y;

            System.out.println("result: "+z);
        }
        catch(ArithmeticException e){   //komunikat jeżeli ktoś będzie chciał dzielić przez 0
            System.out.println("You can't devide by zero!!!");
        }
        catch(InputMismatchException e){    //komunikat jak ktoś wpisze coś innego niż cyfra
            System.out.println("Please enter a number!!!");
        }
        catch(Exception e){     //komunikat jeżeli będzie jakiś błąd (brak cyfry lub dzielenie przez 0, najelpiej wpisać to dopoier kiedy wpiszemy najperw wszytkie inne możeliości żęby ktoś dostał jesny komunikat z czym jest problem)
            System.out.println("Sometging went wrong");
        }
        finally{        //zawsze będzie wyświetlane lub robione po zakończeniu "try"
            scanner.close();
        }
    }
}
