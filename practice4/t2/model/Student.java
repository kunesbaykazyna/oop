package practice4.t2.model;


public class Student extends Person implements CanHavePizza,CanHaveRetake,Movable {

	public Student(String name, int age, String title,double balance) {
		super(name, age, title,balance);
	}

	@Override
	public void move() {
		System.out.println("move...");
	}

	@Override
	public void haveRetake() {	
		System.out.println("Student have reatke for oop!..");
	}

	@Override
	public void eatPizza() {		
		System.out.println("Student eat pizza...");
	}

}
