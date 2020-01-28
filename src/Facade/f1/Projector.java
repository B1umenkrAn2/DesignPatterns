package Facade.f1;

public class Projector {
    // using singleton

    private static Projector instance = new Projector();

    public static Projector getInstance() {

        return instance;
    }

    public void on() {
        System.out.println("Projector is turn on");
    }

    public void off() {

        System.out.println("Projector is turn off");
    }

    public void focus(){
        System.out.println("focus");
    }
}
