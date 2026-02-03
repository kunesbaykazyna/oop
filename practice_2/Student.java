package practice_2;

public class Student {
	private String name;
	private static int ID=0;
	private int studentid;
	private int yearsofstudy;
	
	public Student(String name,int yearsofstudy) {
		this.name=name;
		this.yearsofstudy=yearsofstudy;
			ID++;
			this.studentid=ID;
	}
	
	public String getname() {
		return name;
	}
	
	public int getyearsofstudy() {
		 return yearsofstudy;
	}
	public int getterID() {
		return studentid;
	}

}

