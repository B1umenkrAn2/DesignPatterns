package Decorator.D1;

public class CoffeeShop {
    public static void main(String[] args) {

        // using Decorator model order a drink

        Drink order = new LongBlack();
        System.out.println("drink is " + order.getDes() + "\nTotal price is " + order.cost());

        order = new Milk(order);

        System.out.println("drink is " + order.getDes() + "\nTotal price is " + order.cost());

        order = new Chocolate(order);

        System.out.println("drink is " + order.getDes() + "\nTotal price is " + order.cost());

    }
}
