package Adapter.adapter2classAdpater;

public class client {

    public static void main(String[] args) {


        phone phone = new phone();

        // using aggregation relation
        phone.charging(new voltageAdapater(new voltage220V()));
    }
}
