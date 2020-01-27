package Bridge.Bridge1;

public class huawei implements brand {

    @Override
    public void open() {
        System.out.println("huawei is open");
    }

    @Override
    public void close() {
        System.out.println("huawei is close");

    }

    @Override
    public void call() {
        System.out.println("huawei is calling");

    }
}
