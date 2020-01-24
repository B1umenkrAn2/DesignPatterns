package Build.Build2;

public class houseDirector {

    houseBuilder hb = null;
    // pass by constructor


    public houseDirector(houseBuilder hb) {
        this.hb = hb;
    }

    // use set pass the houseBuilder

    public void setHb(houseBuilder hb) {
        this.hb = hb;
    }


    // build process control by this class
    // this process can be modify
    public House construction() {
        this.hb.buildBaisc();
        this.hb.buildWalls();
        this.hb.buildRoof();

        return hb.buildHouse();
    }
}
