package factory.order;

import factory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class orderPizza {

    //构造器
//    public orderPizza() {
//        Pizza pizza = null;
//        String orderType;
//        do{
//            orderType=getType();
//            if (orderType.equals("greek")){
//                pizza= new GreekPizza();
//                pizza.setName("greek");
//            }else if (orderType.equals("cheese")){
//                pizza=new CheesePizza();
//                pizza.setName("cheese");
//            }else {
//                break;
//            }
//            pizza.prepare();
//            pizza.bake();
//            pizza.cut();
//            pizza.box();
//        }while (true);
//    }

    // crate a simpleFactory
    SimpleFactory simpleFactory;
    // constructor
    public orderPizza(SimpleFactory simpleFactory) {
        setSimpleFactory(simpleFactory);
    }

    public void setSimpleFactory(SimpleFactory simpleFactory) {
        String orderType = ""; // user input
        this.simpleFactory = simpleFactory;// simpleFactory object

        do {
            orderType = getType();
            Pizza pizza = this.simpleFactory.createPizza(orderType);
            if (pizza!=null){
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }else if (pizza==null){
                System.out.println("we dont have this kind pizza");
                break;
            }


        } while (true);
    }


    private String getType() {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza type: ");
            String str = reader.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }

}
