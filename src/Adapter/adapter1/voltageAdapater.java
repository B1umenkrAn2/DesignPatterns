package Adapter.adapter1;


public class voltageAdapater extends voltage220V implements voltage5V {


    @Override
    public int output5v() {
        // get 220v first
        int srcV = output220v();
        int dstV = srcV / 44;  //
        return dstV;
    }
}
