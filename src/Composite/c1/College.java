package Composite.c1;

import java.util.ArrayList;
import java.util.List;

// College will be Aggregation to University
public class College extends OrganizationComponent {
    List<OrganizationComponent> ozList = new ArrayList<>();

    public College(String name, String des) {
        super(name, des);
    }

    @Override
    public void add(OrganizationComponent oz) {
        ozList.add(oz);
    }

    @Override
    public void remove(OrganizationComponent oz) {
        ozList.remove(oz);
    }

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
        System.out.println("----" + getName() + "--------");

        for (OrganizationComponent oz : ozList) {

            oz.print();
        }
    }
}
