package lab1.task3;

public class Course {

	private String name;
	private String description;
	private int numberOfCredits;
	private String prerequisite; // List<Course>
	private GradeBook gradeBook;
	
	public Course(String name,String description,int numberOfCredits,String prereq) {
		this.name=name;
		this.description=description;
		this.numberOfCredits=numberOfCredits;
		this.prerequisite=prereq;
		this.gradeBook= new GradeBook(this);
	}
	
	public Course(String name,String des) {
		this.name=name;
		this.description=des;
	}

	public String getName() {
		return name;
	}

	/**public String getDescription() {
		return description;
	}

	public int getNumberOfCredits() {
		return numberOfCredits;
	}

	public String getPrerequsite() {
		return prerequisite;
	}**/
	public String toString() {
		return "Course"+name+"("+description+")"+" Credits: "+numberOfCredits+prerequisite;
	}

	public GradeBook getGradebook() {
		return gradeBook;
	}
	
}
