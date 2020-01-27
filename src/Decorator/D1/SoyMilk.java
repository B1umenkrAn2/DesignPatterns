package Decorator.D1;

public class SoyMilk extends Decorator {
    public SoyMilk(Drink obj) {
        super(obj);
        setDes("SoyMilk");
        setPrice(3.5f);
    }
}
