package lab2.task5.services;

import java.util.Vector;
import lab2.task5.model.Person;

public class PersonRegistry {
    private Vector<Person> people = new Vector<>();

    public void addPerson(Person p) { 
    	people.add(p); 
    }

    @Override
    public String toString() {
        String result = "";
        for (Person p : people) {
            result += p.toString() + "\n";
        }
        return result;
    }
}
