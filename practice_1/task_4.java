package practice_1;
import java.util.Scanner;
public class task_4 {

	public static void main(String [] args) {
		Scanner scann=new Scanner(System.in);
		int a=scann.nextInt();
		int b=scann.nextInt();
		int c=scann.nextInt();
		int d=b*b-4*a*c;
		if(d<0) {
			System.out.println("error");
		}
		else {
			System.out.println(d);
		}
		scann.close();
	}
}
