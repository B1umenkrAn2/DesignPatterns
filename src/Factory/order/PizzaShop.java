package Factory.order;

//相当于客户端， 发出订购任务
public class PizzaShop {
    public static void main(String[] args) {
//        orderPizza orderPizza = new orderPizza();

        //using simple factor mode

        new orderPizza(new SimpleFactory());
        System.out.println("Exit");
    }
}
