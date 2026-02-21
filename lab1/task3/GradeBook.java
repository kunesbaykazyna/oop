package lab1.task3;
import practice2.Student;
import java.util.ArrayList;
public class GradeBook {
	private Course course;
	private ArrayList<Student> students;
	private ArrayList<Double> grades;
	
	{
		students=new ArrayList<>();
		grades=new ArrayList<>();
	}
	
	public GradeBook() {
	}
	
	public GradeBook(Course course) {
		this.course=course;
	}
	
	public void addStudent(Student student, double grade) {
	    students.add(student);
	    grades.add(grade);
	}
	 
	public String displayMessage() {
		return "Welcome to the grade book for "+course.getName();
	}
	
	public double average() {
		if (grades.isEmpty()) return 0;
		double sum = 0;
		for (double g : grades) {
			sum += g;
		}
		return sum / grades.size();
	}

	public String minGrade() {
		if (grades.isEmpty()) return "No grades.";
	    double min = grades.get(0);
	    int index = 0;
	    for (int i = 1; i < grades.size(); i++) {
	    	if (grades.get(i) < min) {
	    		min = grades.get(i);
	            index = i;
	        }
	    }
	       	Student s = students.get(index);
	        return min + " (" + s.getName() + " Id: " + s.getId() + ")";
	    }
	
	public String maxGrade() {
		if (grades.isEmpty()) return "No grades.";
		double max = grades.get(0);
		int index = 0;
		for (int i = 1; i < grades.size(); i++) {
			if (grades.get(i) > max) {
				max = grades.get(i);
				index = i;
			}
		}
		Student s = students.get(index);
	    return max + " (" + s.getName() + " Id: " + s.getId() + ")";
	    }
	
    public String toString() {
	    return "GradeBook for " + course.getName() + " with " + students.size() + " students.";
	}

    public String outputBarChart() {
    	String chart ="";
    	
    	int[] dis=new int [11];
    	for(double g:grades) {
    		if(g==100) {
    			dis[10]++;
    		}
    		else {
    			dis[(int)(g/10)]++;
    		}
    	}
    	for(int i=0;i<=10;i++) {
    		if(i<10) {
    			chart+=String.format("%02d-%02d",i*10,i*10+9);
    		}
    		else {
    			chart+="100: ";
    		}
    		for(int j=0;j<dis[i];j++) {
    			chart+="*";
    		}
    		chart+="\n";
    	}
    	return chart;
    	
    }
    
    public String displayReport() {

        String report = "";

        report += toString() + "\n\n";

        report += "Average grade: " + average() + "\n";
        report += "Minimum grade: " + minGrade() + "\n";
        report += "Maximum grade: " + maxGrade() + "\n";

        report += outputBarChart();

        return report;
    }

}
