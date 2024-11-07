
public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
        //System.out.println("elo elo");


                                                                                                    //zmienne
        /*int x = 513;
        double y = 123.456;
        boolean z = false;
        char symbol = '@';
        String name = "Adrianek";
        System.out.println("My int number is: "+x+" and my double numer is: "+y+" of course my boolean could be only true and false and it is: "+z+"char can hold only one symbol or letter: "+symbol+" String przechowuje to co się mu napisze na przykład: "+name);
        */


                                                                                                //zamiana string
        /*String a = "water";
        String b = "vodka";
        String temp;

        temp = a;
        a=b;
        b=temp;
        System.out.println("a: "+a);
        System.out.println("b: "+b);
        */

                                                                                        //wprowadzanie danych (funkcja scanner) !trzeba dodać na początek import java.util.Scanner;!
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name? ");
        String name = scanner.nextLine();
        System.out.println("How old are you? ");
        int age = scanner.nextInt();
        //scanner.nextLine();                                //trzeba dodać taką linijkę ponieważ po nextint \n które jest używane jako enter przechodzi do następnej liniki przez co pomijane jest następne pytanie
        System.out.println("What is your favourite food? ");
        String food = scanner.nextLine();

        System.out.println("Hello "+name);
        System.out.println("You are "+age+" years old");
        System.out.println("You like "+food);
        */
        


                                                                                 // interfejs graficzny !trzeba dodać na początek: import javax.swing.JOptionPane;
        /*String name = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null, "Hello " +name);
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));                    //podczas wpisywania danych innych niż string trzeba je zmienić za pomocą parse
        JOptionPane.showMessageDialog(null, "You are: "+age);
        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
        JOptionPane.showMessageDialog(null, "Your hight is: "+heigh);
        */


                                                                                        //działania matematyczne
        /*double x = 3.14;
        double y = 10;
        double z;

        double a = Math.max(x, y);      //maksymalna wartość
        double b = Math.abs(y);         //nwm zbyt skomplikowane
        double c = Math.sqrt(y);        //pierwiastek
        double d = Math.round(x);       //zakrąglanie
        double e = Math.ceil(x);        //zaokrąglanie w górę
        double f = Math.floor(x);       //zaokrąglanie w dół

        System.out.println(e);

        //liczenie przeciwprostokątnej
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter side x: ");
        x = scanner.nextDouble();
        System.out.println("Enter side y: ");
        y = scanner.nextDouble();

        z = Math.sqrt((x*x)+(y*y));
        System.out.println("The hypotenuse (przeciw prostokatna) is: " +z);

        scanner.close();
        */

                                                                               // wartości losowe !biblioteka: import java.util.Random;!
        /*Random random = new Random();

        int x = random.nextInt(-6,6)+1;
        double y = random.nextDouble();
        boolean z = random.nextBoolean();

        System.out.println(x);
        */

                                                                                                        //if
        /*int age = 5;
        if(age>=75){
            System.out.println("Ok Boomer!");
        }
        else if(age >=18){
            System.out.println("You are an adoult!");
        }
        else if(age >=13){
            System.out.println("You are a teenager!");
        }
        else{
            System.out.println("You are not an adoult!");
        }
        */


                                                                                         // switch i case (wygodniejsze niż if jeżeli jest dużo warunków)
        /*String day = "ys";

        switch(day){
            case "Monday": System.out.println("It is Monday!");
            break;
            case "Tuesday": System.out.println("It is Tuesday!");
            break;
            case "Wednesday": System.out.println("It is Wednesday!");
            break;
            case "Thursday": System.out.println("It is Thursday!");
            break;
            case "Friday": System.out.println("It is Friday!");
            break;
            case "Saturday": System.out.println("It is Saturday!");
            break;
            case "Sunday": System.out.println("It is Sunday!");
            break;
            default: System.out.println("This is not a day!");          //jeżeli nie będzie pasowała żadna opcja
        }
            */


                                             //operacje logiczne dla kilku warunków  &&-AND-wszystkie warunki muszą być spełnione; ||-or-conajmniej jeden z warunków musi być spełniony; !-not-odwrotność jeżeli tak to nie ;)
            /*int temp = 19;                   //przykład &&
            if(temp>30){
                System.out.println("It is hot outside");
            }
            else if(temp<=30 && temp>=20){
                System.out.println("It is warm outside");
            }
            else{
                System.out.println("It is cold outside");
            }
                                            //przykład ||
            Scanner scanner = new Scanner(System.in);
            System.out.println("You are playing the game! Press q or Q to quit");
            String response = scanner.next();

            if(response.equals("q") || response.equals("Q")){
                System.out.println("You quit the game");
            }
            else{
                System.out.println("You are still in game *pew pew*");
            }
            */


                                                                            //pętla while
            /*Scanner scanner = new Scanner(System.in);
            String name = "";

            while(name.isBlank()){
                System.out.print("Enter your name: ");
                name = scanner.nextLine();
            }

            System.out.println("Hello "+name);
            */


                                                                            //pętla for
            /*for (int i=10; i>=0; i-=2) {            //i-=2 zmiejsza i o 2
                System.out.println(i);
            }
            System.out.println("Happy new year!");
            */


                                                                                                        //pętla w pętli
            /*Scanner scanner = new Scanner(System.in);

            int rows;
            int columns;
            String symbols = "";

            System.out.print("Enter # of rows: ");
            rows = scanner.nextInt();
            System.out.print("Enter # of columns: ");
            columns = scanner.nextInt();
            System.out.print("Enter symbol to use: ");
            symbols = scanner.next();

            for (int i=1; i<=rows; i++) {
                for (int j=1; j<=columns; j++){
                    System.out.print(symbols);
                }
                System.out.println();
            }
            */


                                                                                                            //lista
            /*String[] lambo = {"Huracan", "Aventador", "Revuelto"};
            lambo[0] = "Gallardo";

            String[] cars = new String[3];
            cars[0] = "BMW";
            cars[1] = "Audi";
            cars[2] = "Mercedes";

            for (int i=0; i<cars.length; i++) {
                System.out.println(cars[i]);   
            }
            */


                                                                                                                //Lista 2D
            /*String[][] cars = new String[3][3];  //deklaracje po kolei

            cars[0][0] = "BMW";
            cars[0][1] = "Audi";
            cars[0][2] = "Mercedes";
            cars[1][0] = "Lambo";
            cars[1][1] = "Ferrari";
            cars[1][2] = "McLaren";
            cars[2][0] = "Supra";
            cars[2][1] = "GT-R";
            cars[2][2] = "RX7";

            //deklaracja od razu 
            String[][] cars =  {
                                    {"BMW", "Audi", "Mercedes"}, 
                                    {"Lambo", "Ferrari", "McLaren"}, 
                                    {"Supra", "GT-R", "RX7"}
                                };
            for (int i=0; i<cars.length; i++) {
                
                for (int j=0; j<cars.length; j++){
                    System.out.print(cars[i][j]+"    ");
                }
                System.out.println();
            }
                */

            
            /*String name = "Adrianek";

            //boolean result = name.equalsIgnoreCase("adrianek");         //dopisek ignoreCase nie sprawdza wielkości liter, samo equals sprawdza dokładnie też wielkość liter
            //int result = name.length();                                 //sprawdza długość
            //char result = name.charAt(1);                           //wypisuje dany wskazany symbol (litera, znak specjalny, itp.)
            //int result = name.indexOf("a");                           //wypisuje na której pozycji jest dany symbol
            //boolean result = name.isEmpty();                            //sprawdza czy nasz string jest pusty
            //String result = name.toUpperCase();                           //zamienia wszystkie litery na duże
            //String result = name.toLowerCase();                             //zamienia wszystkie litery na małe
            //String result = name.trim();                               //kasuje spacje przed i po wyrazie
            //String result = name.replace('a', 'Q');         //zamienia podaną literę na podaną, jeżeli są dwie takie same to zamieni obie

            System.out.println(result);
            */



                                    //wrapper class to pełne nazwy z dużej litery zmiennych, do których można przypisać funkcje po "." jak w przypadku String który jest powyżej
            /*Boolean a = true;
            Character b = '@';
            Integer c = 123;
            Double d = 3.14;
            String e = "Adrianek";
            */


                                                                                                //ArrayList - umożliwia dynanmicznie zmianę wielkości listy
            /*ArrayList<String> food = new ArrayList<String>(); 

            food.add("Pizza");
            food.add("hamburger");
            food.add("hotdog");

            food.set(0, "sushi");                      //zamienia element w liście
            food.remove(2);                                    //usuwa dany element z listy 
            food.clear();                                            //czyści listę

            for (int i = 0; i < food.size(); i++) {
                System.out.println(food.get(i));   
            }
            */


                                                                                                            //ArrayList w ArrayList
            /*ArrayList<ArrayList<String>> groceryList = new ArrayList();

            ArrayList<String> bakeryList = new ArrayList();
            bakeryList.add("pasta");
            bakeryList.add("garlic bread");
            bakeryList.add("donuts");

            ArrayList<String> produceList = new ArrayList();
            produceList.add("tomatoes");
            produceList.add("zucchini");
            produceList.add("peppers");

            ArrayList<String> drinksList = new ArrayList();
            drinksList.add("soda");
            drinksList.add("coffe");

            groceryList.add(bakeryList);
            groceryList.add(produceList);
            groceryList.add(drinksList);


            System.out.println(groceryList.get(1).get(2));                      //pierwszy get wybiera z której listy wybieramy, drugi get wybiera którą pozcyję z wybranej listy wybieramy
            */


                                                                            //pętla for-each - krótsza oraz mniej kroków ale mniej elsatyczna od zwykłej for; działa tak samo dla zwykłej listy jak i arraylisty
            /*//String[] animals = {"cat", "dog", "rat", "bird"};

            ArrayList<String> animals = new ArrayList<String>();

            animals.add("cat");
            animals.add("dog");
            animals.add("rat");
            animals.add("bird");

            for(String i : animals){                        //typ zmiennej - index - dla każdego - Lista
                System.out.println(i);
            }
            */

                                                                        //metody/funkcje    GIGA WAŻNE static void xyz trzeba dodać w klamrach odpowiadających za public class (inaczej nie działa funkcja)
            /*String name = "Adrianek";
            int age = 22;

            hello(name,age);

            static void hello(String name, int age){                   //to musi być w klamrach public class (aktualnie to nie zadziała!!!)
                System.out.println("hello "+name);
                System.out.println("You are "+age);
            }
            */

            /*int x = 4;                                             //metody int
            int y = 5;

            int z = add(x,y);
            System.out.println(z);

            static int add(int x, int y){               //to musi być w klamrach public class
            int z = x + y;    
            return z;
            }
                */



            /*int x = add(1,2,9,9);                             //overoloaded function - metoda ma taką samą nazwę ale musi zawierać inny parametr
            //lub
            double x = add(1.0,2.0,3.0,4.9);
            System.out.println(x);
            
        
    
        static int add(int a, int b){                                   //to musi być w klamrach public class
            System.out.println("This is overloaded method #1");
            return a + b;
        }
        static int add(int a, int b, int c){
            System.out.println("This is overloaded method #2");
            return a + b + c;
        }
        static int add(int a, int b, int c, int d){
            System.out.println("This is overloaded method #3");
            return a + b + c + d;
        }
            static dobule add(dobule a, dobule b){                                   //to musi być w klamrach public class
            System.out.println("This is overloaded method #4");
            return a + b;
        }
        static dobule add(dobule a, dobule b, dobule c){
            System.out.println("This is overloaded method #5");
            return a + b + c;
        }
        static dobule add(dobule a, dobule b, dobule c, dobule d){
            System.out.println("This is overloaded method #6");
            return a + b + c + d;
        } 
            */

        

        //printf - metoda kontroli formatu i wyświatlania tekstu w konsoli; potrzebne są 2 argumenty = format string + "object/variable/value"; %flags,precision,width,conversion-character
        /*boolean myBoolean = true;
        char myChar = '@';
        String myString = "Adrianek";
        int myInt = 69;
        double myDouble = 1000;
        */

        //conversion-character
        /*System.out.printf("%b", myBoolean);
        System.out.printf("%c", myChar);
        System.out.printf("%s", myString);
        System.out.printf("%d", myInt);
        System.out.printf("%f", myDouble);*/

        //width - po % dajemy ile ma być pustych znaków przez wpisaniem zmiennej patrząc od ostatniej litery, jeżeli damy -10 to puste pola będą po prawej
        //System.out.printf("Hello %10s",myString);

        //precision - ile ma być cyft po przecinku
        //System.out.printf("You have this much money %.1f", myDouble);

        //flags - 
        // - :left-justify
        // + :dodaje + lub - przed numeric value
        // 0 :same 0
        // , :dodaje . jeżeli numer jest większy niż 1000

        //System.out.printf("You have this much money %,f", myDouble);


        final double pi = 3.14159;

        System.out.println(pi);
    }
}
