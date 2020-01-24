package Build.Build2;

public class commonHouse extends houseBuilder{

    @Override
    public void buildBaisc() {
        System.out.println("basic");
    }

    @Override
    public void buildWalls() {
        System.out.println("basic walls");
    }

    @Override
    public void buildRoof() {
        System.out.println("basic roof");
    }
}
