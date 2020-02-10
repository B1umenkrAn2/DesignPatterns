package Iterator.I1;

import java.util.ArrayList;

public class client {
    public static void main(String[] args) {
        // create college collection

        ArrayList<College> colleges = new ArrayList<>();

        colleges.add(new ComputerCollege());
        colleges.add(new InfoCollege());

        OutPutImpl outPut = new OutPutImpl(colleges);

        outPut.printCollege();

    }
}
