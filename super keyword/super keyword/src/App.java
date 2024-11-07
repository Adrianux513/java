public class App {
    public static void main(String[] args) throws Exception {
        
        
        Hero hero1 = new Hero("Batman", 42, "$$$");
        Hero hero2 = new Hero("Ironman", 40, "suite");

        System.out.println(hero2.toString());
    }
}
