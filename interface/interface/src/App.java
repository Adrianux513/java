public class App {
    public static void main(String[] args) throws Exception {
        
        Rabbit rabbit = new Rabbit();

        rabbit.flee();

        Hawk hawk = new Hawk();

        hawk.hunt();

        Fish fish = new Fish();

        fish.flee();
        fish.hunt();
    }
}
