package Facade.f1;

public class PopCorn {
    // using singleton

    private static PopCorn instance = new PopCorn();

    public static PopCorn getInstance() {

        return instance;
    }

    public void on() {
        System.out.println("PopCorn is turn on");
    }

    public void off() {

        System.out.println("PopCorn is turn off");
    }

    public void pop(){
        System.out.println("PopCorn is playing");
    }
}
