package practice3.animal.app;
import java.util.*;
import practice3.animal.model.Animal;
import practice3.animal.model.Dog;

public class AnimalTest {
	
	public static void main(String[] args) {
		
		List<Animal> animals = new ArrayList<>();
		
		animals.add(new Animal("Generic Animal", 5));
	    animals.add(new Dog("Rex", 3, "German Shepherd"));
	    animals.add(new Dog("Buddy", 2, "Golden Retriever"));
	    
	    for (Animal a : animals) {
	        a.getInfo();
	        a.makeSound();
	        a.eat("meat");
	        
	        System.out.println("--------------------");
	    }
	    }	
}
