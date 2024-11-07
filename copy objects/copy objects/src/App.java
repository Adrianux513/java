public class App {
    public static void main(String[] args) throws Exception {
        
        //przy kopiowaniu w ten sposób obiekty mają dwie różne adesacje w pamięci ale te same wartości przy kopiowaniu
        //gdybyśmy zrobili car2=car1 to miały by te same wartości ale rónież tą samą adewsację w pamięci
        
        Car car1 = new Car("Lamborghini", "Huracan", 2021);
        //Car car2 = new Car("Ferrari", "Italia", 2016);
        //car2.copy(car1);
        //w ten sposób również będą 2 różne adresacje w pamięci
        Car car2 = new Car(car1);


        System.out.println(car1);
        System.out.println(car2);
        System.out.println();
        System.out.println(car1.getMake());
        System.out.println(car1.getModel());
        System.out.println(car1.getYear());
        System.out.println();
        System.out.println(car2.getMake());
        System.out.println(car2.getModel());
        System.out.println(car2.getYear());
    }
}
