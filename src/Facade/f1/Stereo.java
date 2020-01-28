package Facade.f1;

public class Stereo {
    // using singleton

    private static Stereo instance = new Stereo();

    public static Stereo getInstance() {

        return instance;
    }

    public void on() {
        System.out.println(" Stereo is turn on ");
    }

    public void off() {

        System.out.println(" Stereo is turn off ");
    }

    public void Vup() {
        System.out.println("Stereo is voice up");
    }

    public void VDown() {

        System.out.println("Stereo is  voice down");
    }
}
