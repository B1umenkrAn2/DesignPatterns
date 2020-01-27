package factory.order;

import factory.pizza.CheesePizza;
import factory.pizza.GreekPizza;
import factory.pizza.Pizza;

public class SimpleFactory {

    // base on orderType to return the pizza type
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;

        System.out.println("using simple factory mode");
        if (orderType.equals("greek")) {
            pizza = new GreekPizza();
            pizza.setName("greek");
        } else if (orderType.equals("cheese")) {
            pizza = new CheesePizza();
            pizza.setName("cheese");
        }

        return pizza;

    }

    // simpleFactory also know as static factory
    public static Pizza createPizza2(String orderType) {
        Pizza pizza = null;

        System.out.println("using simple factory mode");
        if (orderType.equals("greek")) {
            pizza = new GreekPizza();
            pizza.setName("greek");
        } else if (orderType.equals("cheese")) {
            pizza = new CheesePizza();
            pizza.setName("cheese");
        }

        return pizza;

    }

}
