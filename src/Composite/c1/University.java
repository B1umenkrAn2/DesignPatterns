package Composite.c1;

import java.util.ArrayList;
import java.util.List;

// University is top part of this structure
public class University extends OrganizationComponent {
    List<OrganizationComponent> ozList = new ArrayList<>();

    //constructor
    public University(String name, String des) {
        super(name, des);
    }

    // override add method
    @Override
    public void add(OrganizationComponent oz) {
        ozList.add(oz);
    }

    // override remove method
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
        System.out.println("-----" + getName() + "---------");

        for (OrganizationComponent oz : ozList) {
            oz.print();
        }
    }
}
