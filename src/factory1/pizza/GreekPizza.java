package factory1.pizza;

public class GreekPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("prepare for this kind ");
    }
}
