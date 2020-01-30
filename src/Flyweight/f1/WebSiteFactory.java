package Flyweight.f1;


import java.util.HashMap;

//website Factory base on the request
public class WebSiteFactory {

    // using a collection as a pool

    private HashMap<String, ConcreteWebSite> pool = new HashMap<>();


    // base on the website type than return the website. if dont have this website create a new one and add to pool
    public WebSite getWebSiteCategory(String type) {
        if (!pool.containsKey(type)) {
            pool.put(type, new ConcreteWebSite(type));
        }
        return (WebSite) pool.get(type);
    }

    // get the total type website which in the pool
    public int getWebSiteCount(){
        return pool.size();
    }

}
