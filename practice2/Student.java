package practice2;

public class Student {
	private String name;
	private static int ID=0;
	private int studentId;
	private int yearsOfStudy;
	
	public Student(String name,int yearsOfStudy) {
		this.name=name;
		this.yearsOfStudy=yearsOfStudy;
		ID++;
		this.studentId=ID;
	}

	public String getName() {
		return name;
	}
	
	public int getYearsOfStudy() {
		 return yearsOfStudy;
	}
	public int getId() {
		return studentId;
	}

}

