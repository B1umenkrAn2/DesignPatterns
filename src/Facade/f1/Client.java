package Facade.f1;

public class Client {
    public static void main(String[] args) {
        HomeFacade homeFacade = new HomeFacade();

        homeFacade.ready();
        homeFacade.play();
        homeFacade.pause();
        homeFacade.end();
    }
}
