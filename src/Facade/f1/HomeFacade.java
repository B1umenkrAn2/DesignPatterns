package Facade.f1;

public class HomeFacade {
    private Light light;
    private PopCorn popCorn;
    private DVDPlayer dvdPlayer;
    private Projector projector;
    private Screen screen;
    private Stereo stereo;

    public HomeFacade() {
        this.light = Light.getInstance();
        this.popCorn = PopCorn.getInstance();
        this.dvdPlayer = DVDPlayer.getInstance();
        this.projector = Projector.getInstance();
        this.screen = Screen.getInstance();
        this.stereo = Stereo.getInstance();
    }

    public void ready() {
        popCorn.on();
        popCorn.pop();
        screen.down();
        projector.on();
        stereo.on();
        dvdPlayer.on();
        light.dim();
    }

    public void play() {
        dvdPlayer.play();
    }

    public void pause() {
        dvdPlayer.pause();
    }

    public void end() {
        popCorn.off();
        light.bright();
        screen.up();
        projector.off();
        stereo.off();
        dvdPlayer.off();
    }

}
