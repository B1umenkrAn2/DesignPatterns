package Decorator.D1;



public class Chocolate extends Decorator {


    public Chocolate(Drink obj) {

        super(obj);
        setDes("Chocolate");
        setPrice(3.0f);
    }
}
