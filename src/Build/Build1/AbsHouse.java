package Build.Build1;

public abstract class AbsHouse {

    public abstract void buildBasic();

    public abstract void buildWalls();

    public abstract void buildRoof();


    // 此方法过于耦合, 对各个部位的扩展性差
    public void build() {
        this.buildBasic();
        this.buildWalls();
        this.buildRoof();

    }

}
