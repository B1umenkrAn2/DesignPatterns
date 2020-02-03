package Visitor.V1;

public class Women extends Person{
    @Override
    public void accept(Action action) {
        action.getWomenResult(this);
    }
}
