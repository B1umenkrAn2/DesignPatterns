package Flyweight.f1;
// static feature in this class
public class ConcreteWebSite extends WebSite {
    // website type
    private String type ="";

    // pass the type to definition the website
    public ConcreteWebSite(String type) {

        this.type = type;
    }

    @Override
    public void use(User user) {
        System.out.println("website type is "+type+" , User is "+user.getName());

    }
}
