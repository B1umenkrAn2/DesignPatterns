package Iterator.I1;

import java.util.Iterator;

public class ComputerCollegeIterator implements Iterator {

    // aggregate the collection object
    Department[] departments;
    int index = 0;

    public ComputerCollegeIterator(Department[] departments) {
        this.departments = departments;
    }

    @Override
    public boolean hasNext() {
        if (index >= departments.length || departments[index] == null)
            return false;

        return true;

    }

    @Override
    public Object next() {
        Department department = departments[index];
        index++;
        return department;
    }

}
