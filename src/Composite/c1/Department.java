package Composite.c1;

import java.util.ArrayList;
import java.util.List;

// department will be aggregation to college
public class Department extends OrganizationComponent{

    // as the leaf part of this structure, this class dont have other part
//    List<OrganizationComponent> ozList = new ArrayList<>();

    public Department(String name, String des) {
        super(name, des);
    }

//    @Override
//    public void add(OrganizationComponent oz) {
//        ozList.add(oz);
//    }
//
//    @Override
//    public void remove(OrganizationComponent oz) {
//        ozList.remove(oz);
//    }

    @Override
    public String getName() {

        return super.getName();
    }

    @Override
    public String getDes() {

        return super.getDes();
    }

    @Override
    protected void print() {
        System.out.println(getName());
    }
}
