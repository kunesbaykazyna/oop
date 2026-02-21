package lab1.task3;
import practice2.Student;
import java.util.Scanner;
public class GradeBookTest {

	public static void main(String[] args) {
		
		Course c1=new Course("OOP","we will learn java",5,"pp1,pp2,ads");
		GradeBook gb = c1.getGradebook();
        System.out.println(gb.displayMessage());
		
		System.out.println("Please enter numer of students: ");

        Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
        scan.nextLine();

        for (int i = 0; i < n; i++) {

            System.out.print("Student name: ");
            String name = scan.nextLine();

            System.out.print("Student id: ");
            int id = scan.nextInt();

            System.out.print("Grade: ");
            double grade = scan.nextDouble();
            scan.nextLine();

            Student s = new Student(name, id);
            gb.addStudent(s, grade);
        }

        System.out.println();
        System.out.print(gb.displayReport());
        scan.close();
	}

}
