package Bridge.Bridge1;

public class uprightPhone extends phone {

    public uprightPhone(brand brand) {
        super(brand);
    }

    @Override
    public void open(){
        super.open();
        System.out.println("uprightPhone phone");
    }

    @Override
    public void close(){
        super.close();
        System.out.println("uprightPhone phone");
    }
    @Override
    public void call(){
        super.call();
        System.out.println("uprightPhone phone");
    }
}
