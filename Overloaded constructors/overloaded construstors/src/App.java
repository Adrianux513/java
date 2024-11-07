public class App {
    public static void main(String[] args) throws Exception {
        

        Pizza pizza = new Pizza("double", "tomato", "chedar", "salami");

        System.out.println("Here is your ingredients of your pizza: ");
        System.out.println(pizza.bread);
        System.out.println(pizza.souce);
        System.out.println(pizza.cheese);
        System.out.println(pizza.topping);
    }
}
