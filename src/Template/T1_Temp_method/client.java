package Template.T1_Temp_method;

public class client {
    public static void main(String[] args) {
        System.out.println("making red bean soy milk");
        SoyMilk redBeanSoyMile = new RedBeanSoyMilk();
        redBeanSoyMile.make();


        System.out.println("\nmaking Peanut soy milk");
        SoyMilk PeanutSoyMilk = new PeanutSoyMilk();
        PeanutSoyMilk.make();


        System.out.println("\nmaking prue soy milk");

        SoyMilk pure = new PureSoyMilk();
        pure.make();
    }
}
