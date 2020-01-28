package Facade.f1;

public class Screen {
    // using singleton

    private static Screen instance = new Screen();

    public static Screen getInstance() {

        return instance;
    }

    public void up() {
        System.out.println("Screen is up");
    }

    public void down() {

        System.out.println("Screen is down");
    }


}
