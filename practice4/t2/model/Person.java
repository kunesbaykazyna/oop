package practice4.t2.model;


public class Person {
	private String name;
	private int age;
	private String title;
	
	public Person(String name,int age,String title) {
		this.name=name;
		this.age=age;
		this.title=title;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getTitle() {
		return title;
	}
	
}
