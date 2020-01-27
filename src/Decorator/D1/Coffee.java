package Decorator.D1;

public class Coffee extends Drink {
    @Override
    public float cost() {
        return super.getPrice();
    }
}
