package Build.Build2;

public abstract class houseBuilder {

    protected House house = new House();

    //build process

    public abstract void buildBaisc();

    public abstract void buildWalls();

    public abstract void buildRoof();

    public House buildHouse() {

        return house;

    }
}
