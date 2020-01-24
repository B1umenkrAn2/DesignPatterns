package adapter.adapter2classAdpater;


public class voltageAdapater implements voltage5V {

    private voltage220V voltage220V; // aggregation relation


    // using constructor get class
    public voltageAdapater(adapter.adapter2classAdpater.voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    // using set method get class
    public void setVoltage220V(adapter.adapter2classAdpater.voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    @Override
    public int output5v() {
        int dst=0;
        if (voltage220V !=null){
            int src =voltage220V.output220v();
            System.out.println("using object adapter !");
            dst = src / 44;
            System.out.println("voltage has been change to 5v ");

        }
        return dst;
    }
}
