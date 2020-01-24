package adapter.adapter1;

public class client {

    public static void main(String[] args) {


        phone phone = new phone();

        phone.charging(new voltageAdapater());
    }
}
