public class Pizza {
    
    String bread;
    String souce;
    String cheese;
    String topping;

    //kilka klas o tej samej nazwie lecz o różnych parametrach na wypadek gdyby 
    //ktoś czegoś nie chciał wpisać

    Pizza(){
    }

    Pizza(String bread){
        this.bread = bread;
    }

    Pizza(String bread, String souce){
        this.bread = bread;
        this.souce = souce;
    }

    Pizza(String bread, String souce, String cheese){
        this.bread = bread;
        this.souce = souce;
        this.cheese = cheese;
    }

    Pizza(String bread, String souce, String cheese, String topping){
        this.bread = bread;
        this.souce = souce;
        this.cheese = cheese;
        this.topping = topping;
    }
}
