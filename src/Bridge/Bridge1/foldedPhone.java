package Bridge.Bridge1;

public class foldedPhone extends phone {

    public foldedPhone(brand brand) {
        super(brand);
    }

    @Override
    public void open(){
        super.open();
        System.out.println("Folded phone");
    }

    @Override
    public void close(){
        super.close();
        System.out.println("Folded phone");
    }
    @Override
    public void call(){
        super.call();
        System.out.println("Folded phone");
    }
}
