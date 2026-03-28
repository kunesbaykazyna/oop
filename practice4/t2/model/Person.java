package practice4.t2.model;


public class Person{
	private String name;
	private int age;
	private String title;
	private double balance;
	
	public Person(String name,int age,String title,double balance) {
		this.name=name;
		this.age=age;
		this.title=title;
		this.balance=balance;
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
	
	public double getBalance() {
		return balance;
	}

	public void setBalance(double d) {
		balance-=d;
	}
	
}
