public class MyGenericClass <Thing /*extends Number*/, Thing2>{  //extends numer - można dać tylko subklasy do liczb, nie da rady tekstu itp

    Thing x;
    Thing2 y;

    MyGenericClass(Thing x, Thing2 y) {
        this.x = x;
        this.y = y;
    }

    public Thing2 getValue(){
        return y;
    }
}
