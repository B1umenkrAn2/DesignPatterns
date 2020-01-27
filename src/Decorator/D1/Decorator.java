package Decorator.D1;

public class Decorator extends Drink {
    private Drink obj;

    //
    public Decorator(Drink obj) {
        this.obj = obj;
    }


    //obj.getDes() output the decorator object info
    @Override
    public String getDes(){
//        return super.des+" "+super.getPrice()+"&&"+obj.getDes();

        return obj.getDes()+"&&"+super.des;
    }

    @Override
    public float cost() {
        return super.getPrice() + obj.cost();
    }
}
