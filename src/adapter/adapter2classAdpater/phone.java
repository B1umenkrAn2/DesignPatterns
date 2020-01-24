package adapter.adapter2classAdpater;

public class phone {

    public void charging(voltage5V voltage5V){

        if (voltage5V.output5v()!= 5){
            System.out.println("cant charging voltage higher than 5V");
        }
        System.out.println("charging now !");

    }
}
