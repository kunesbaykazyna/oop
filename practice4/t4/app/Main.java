package practice4.t4.app;
import java.util.*;
import practice4.t4.model.*;

public class Main {

	public static void main(String[] args) {
		List <Student> students= new ArrayList<>();
		
		Student s1=new Student("Alice", 3.8);
		Student s2=new Student("Bob", 3.2);
		Student s3= new Student("Charlie", 3.9);
		Student s4=new Student("Diana", 3.5);
		Student s5=new Student("Ethan", 2.9);
		
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		students.add(s5);
		
		Collections.sort(students);
		System.out.println("After sorting by gpa: ");
		for(Student s:students) {
			System.out.println(s.getName()+" "+s.getGpa());
		}
		
		Collections.sort(students,new NameComparator());
		System.out.println("After sorting by name comparator: ");
		for(Student s:students) {
			System.out.println(s.getName()+" "+s.getGpa());
		}
		
		
		}
}
