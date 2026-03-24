package lab2.task1.subsuper.model;

import java.util.Objects;

public class Person { 
	private String name;
	private int age;
	private String phoneNumber;
	
	public Person(String name,int age,String phoneNumber) {
		this.name=name;
		this.age=age;
		this.phoneNumber=phoneNumber;
	}
	
	@Override
	public String toString() {
		return "name: "+name+" age: "+age+" phone number: "+phoneNumber;
	}
	
	@Override
	public boolean equals(Object o) {
		if(this==o)return true;
		if(o==null || !(o instanceof Person)) return false;
		Person p=(Person) o;
		return Objects.equals(getPhoneNumber(), p.getPhoneNumber());
	}

	@Override
	public int hashCode() {
		return java.util.Objects.hash(phoneNumber);
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
	
}
