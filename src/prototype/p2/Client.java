package prototype.p2;


// 让一个原型对象克隆自己,从而创建一个新的对象(属性一样)
public class Client {


    public static void main(String[] args) {

        // 原型模式 完成对象克隆
        Sheep sheep = new Sheep();
        Sheep clone = (Sheep) sheep.clone();
        // clone方法在 原object属性改变后 clone的对象的属于也一样改变(当原型更新后 克隆也更新);

    }


}
