package Build.Build1;

public class HightHouse extends AbsHouse {
    @Override
    public void buildBasic() {
        System.out.println("base");
    }

    @Override
    public void buildWalls() {
        System.out.println("wall");
    }

    @Override
    public void buildRoof() {
        System.out.println("roof");
    }
}
