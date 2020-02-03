package Visitor.V1;

public class Fail extends Action {
    @Override
    public void getManResult(Man man) {
        System.out.println("Women's result is F");
    }

    @Override
    public void getWomenResult(Women women) {
        System.out.println("Women's result is F");
    }
}
