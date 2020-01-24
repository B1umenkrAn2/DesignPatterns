package Build.Build2;


public class client {

    public static void main(String[] args) {
        // using one of feature to build a house
        commonHouse ch = new commonHouse();
        // using director to build
        houseDirector hd = new houseDirector(ch);
        //get the product
        House house = hd.construction();

        // other feature
        hightBuild hightBuild = new hightBuild();
        // change the build to build other product
        hd.setHb(hightBuild);

        House house2 = hd.construction();

    }
}
