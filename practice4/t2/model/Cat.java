package practice4.t2.model;

public class Cat implements CanHavePizza,Movable{
	private String name;
	private int age;
	
	public Cat(String name,int age) {
		this.name=name;
		this.age=age;
	}

	@Override
	public void eatPizza() {
		System.out.println("Cat eat pizza");
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public void move() {
		System.out.println("move...");
	}
	
}
