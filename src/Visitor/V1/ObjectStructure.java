package Visitor.V1;

import java.util.LinkedList;
import java.util.List;


// data structure to manage person collection
public class ObjectStructure {
    private List<Person> persons = new LinkedList<>();

    public void attache(Person person){

        persons.add(person);
    }

    public void detach(Person p){

        persons.remove(p);
    }

    //display the result of list

    public void display(Action action){

        for (Person p:persons
             ) {
            p.accept(action);
        }
    }
}
