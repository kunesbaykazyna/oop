package practice4.t4.model;

public class Student implements Comparable<Student> {
	private String name;
	private double gpa;
	public String major;
	
	
	public Student(String name,double gpa) {
		this.name=name;
		this.gpa=gpa;
	}

	@Override
	public int compareTo(Student o) {
		 return Double.compare(this.gpa, o.gpa);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getGpa() {
		return gpa;
	}
	
}
