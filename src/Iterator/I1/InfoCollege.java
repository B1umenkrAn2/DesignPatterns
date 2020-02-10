package Iterator.I1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class InfoCollege implements College {

    //
    List<Department> departmentList = new ArrayList<>();
    int index = -1;

    public InfoCollege() {
        departmentList = new ArrayList<>();
        addDepartment("2", "2");
    }


    @Override
    public String getName() {
        return "Info College";
    }

    @Override
    public void addDepartment(String name, String desc) {
        departmentList.add(new Department(name, desc));
        index+=1;

    }

    @Override
    public Iterator createIterator() {
        return new InfoCollegeIterator(departmentList);
    }
}
