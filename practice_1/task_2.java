package practice_1;
import java.util.Scanner;
import java.lang.Math;
public class task_2 {

	public static void  main(String [] args) {
		Scanner a=new Scanner(System.in);
		int aa=a.nextInt();
		int perimetr=4*aa;
		int area=aa*aa;
		double length_of_diagonal=aa*Math.sqrt(2);
		System.out.println("Perimetr: "+perimetr);
		System.out.println("Area: "+area);
		System.out.println("Length of diagonal: "+length_of_diagonal);
		a.close();
	}
}
