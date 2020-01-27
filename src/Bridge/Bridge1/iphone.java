package Bridge.Bridge1;

public class iphone implements brand {
    @Override
    public void open() {
        System.out.println("iphone is open");
    }

    @Override
    public void close() {
        System.out.println("iphone is close");

    }

    @Override
    public void call() {
        System.out.println("iphone is calling");

    }
}
