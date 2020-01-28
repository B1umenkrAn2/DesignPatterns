package Facade.f1;

public class DVDPlayer {

    // using singleton

    private static DVDPlayer instance = new DVDPlayer();

    public static DVDPlayer getInstance() {

        return instance;
    }

    public void on() {
        System.out.println("DVD is turn on");
    }

    public void off() {

        System.out.println("DVD is turn off");
    }

    public void play(){
        System.out.println("DVD is playing");
    }

    public void pause(){
        System.out.println("DVD is pause");
    }




}
