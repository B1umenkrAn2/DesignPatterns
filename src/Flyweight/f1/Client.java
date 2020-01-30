package Flyweight.f1;

// dynamic feature in this class
public class Client {
    public static void main(String[] args) {

        // create a factory
        WebSiteFactory webSiteFactory = new WebSiteFactory();

        // first type;
        WebSite webSite1 = webSiteFactory.getWebSiteCategory("news");
        webSite1.use(new User("user1"));

        WebSite webSite2 = webSiteFactory.getWebSiteCategory("twitter");
        webSite2.use(new User("user2"));

        WebSite webSite3 = webSiteFactory.getWebSiteCategory("newspaper");
        webSite3.use(new User("user3"));

        WebSite webSite4 = webSiteFactory.getWebSiteCategory("news");
        webSite4.use(new User("user4"));

        System.out.println("total type is "+webSiteFactory.getWebSiteCount());

    }
}
