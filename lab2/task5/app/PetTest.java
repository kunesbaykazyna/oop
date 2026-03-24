package lab2.task5.app;

import lab2.task5.model.*;
import lab2.task5.services.*;

public class PetTest {
    public static void main(String[] args) {
 
        Person p1 = new Employee("Aziya", 30, "Bloger");
        Person p2 = new PhDStudent("Ali", 24, "Comp.Science", "AI");
        Person p3 = new Student("Qazyna", 18, "Site");

        Animal a1 = new Cat("Tory", 2);
        Animal a2 = new Dog("Rex", 3);

        PersonRegistry registry = new PersonRegistry();
        registry.addPerson(p1);
        registry.addPerson(p2);
        registry.addPerson(p3);

        p1.assignPet(a1);
        System.out.println("before vacation:\n" + registry);

        p1.leavePetWith(p2);         
        System.out.println("\nduring vacation:\n" + registry);
        
        p1.retrievePetFrom(p2);
        System.out.println("\nafter vacation:\n" + registry);

        //phdstudent case
        p3.assignPet(a2); 
        p3.leavePetWith(p2);
        
        System.out.println("\nResult:\n" + registry);        
        
    }
}
