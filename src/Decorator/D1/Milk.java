package Decorator.D1;

public class Milk extends Decorator {
    public Milk(Drink obj) {
        super(obj);
        setDes("Milk");
        setPrice(2.0f);
    }
}
