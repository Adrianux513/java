public class App {
    public static void main(String[] args) throws Exception {
        
        Car car = new Car("Lamborghini", "Huracan", 2023);

        

        car.setYear(2024);

        System.out.println(car.getMake());
        System.out.println(car.getModel());
        System.out.println(car.getYear());
    }
}
