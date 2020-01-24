package factory1.pizza;

public abstract class Pizza {
    private String name;

    //各种子class的构建需求不同，所以使用抽象方法。
    public abstract void prepare();

    public void bake() {
        System.out.println(name + " baking ");
    }

    public void cut() {
        System.out.println(name + " cut ");

    }

    public void box() {
        System.out.println(name + " box ");

    }

    public void setName(String name) {
        this.name = name;
    }


}
