package Composite.c1;

import java.util.HashMap;

public class Client {
    public static void main(String[] args) {
        // from big to small


        OrganizationComponent university = new University("top", "top office-dec");

        OrganizationComponent College1 = new College("College1", "College1-dec");
        OrganizationComponent College2 = new College("College2", "College2-dec");


        OrganizationComponent Department1 = new Department("Department1", "Department1-dec");
        OrganizationComponent Department2 = new Department("Department2", "Department2-dec");
        OrganizationComponent Department3 = new Department("Department3", "Department3-dec");
        OrganizationComponent Department4 = new Department("Department4", "Department4-dec");
        OrganizationComponent Department5 = new Department("Department5", "Department5-dec");

        College1.add(Department1);
        College1.add(Department3);
        College1.add(Department5);

        College2.add(Department2);
        College2.add(Department4);

        university.add(College1);
        university.add(College2);

        university.print();
        College1.print();
        College2.print();



    }
}
