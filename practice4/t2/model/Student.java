package practice4.t2.model;


public class Student extends Person implements CanHavePizza,CanHaveRetake,Movable {

	public Student(String name, int age, String title) {
		super(name, age, title);
	}

	@Override
	public void move() {
		System.out.print("dance...");
	}

	@Override
	public void haveRetake() {	
		System.out.print("Student have reatke for oop!..");
	}

	@Override
	public void eatPizza() {		
		System.out.print("Student eat retake...");
	}

}
