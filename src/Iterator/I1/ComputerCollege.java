package Iterator.I1;

import java.util.Iterator;

public class ComputerCollege implements College {
    Department[] departments;
    int numOfDepartment = 0;

    public ComputerCollege() {
        departments = new Department[5];
        addDepartment("1", "1");
    }

    @Override
    public String getName() {

        return "Computer College";
    }

    @Override
    public void addDepartment(String name, String desc) {
        departments[numOfDepartment] = new Department(name, desc);
        numOfDepartment += 1;
    }

    @Override
    public Iterator createIterator() {
        return new ComputerCollegeIterator(departments);
    }
}
