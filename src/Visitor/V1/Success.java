package Visitor.V1;

public class Success extends Action {
    @Override
    public void getManResult(Man man) {
        System.out.println("Man's result is good");
    }

    @Override
    public void getWomenResult(Women women) {
        System.out.println("Women's result is good");
    }
}
