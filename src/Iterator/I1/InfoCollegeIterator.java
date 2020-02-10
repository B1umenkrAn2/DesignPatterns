package Iterator.I1;

import java.util.Iterator;
import java.util.List;

public class InfoCollegeIterator implements Iterator {

    List<Department> list;
    int index = -1;


    public InfoCollegeIterator(List<Department> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        if (index >= list.size() - 1)
            return false;
        index += 1;
        return true;
    }

    @Override
    public Object next() {

        return  list.get(index);
    }
}
