package Adapter.adapter3interfaceAdapter;

public class Client {

    public static void main(String[] args) {
        absAdapter aa = new absAdapter() {

            @Override
            public void m1() {
                System.out.println("using m1 method ");
            }

        };

        aa.m1();
    }
}
