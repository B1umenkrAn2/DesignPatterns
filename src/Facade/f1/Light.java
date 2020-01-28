package Facade.f1;

public class Light {
    private static Light instance = new Light();

    public static Light getInstance() {

        return instance;
    }

    public void on() {
        System.out.println(" Light is turn on ");
    }

    public void off() {

        System.out.println(" Light is turn off ");
    }

    public void dim() {
        System.out.println(" Light become dim ");
    }

    public void bright() {
        System.out.println(" Light become bright ");
    }
}
