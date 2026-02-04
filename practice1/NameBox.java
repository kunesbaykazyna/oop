package practice1;
import java.util.Scanner;
public class NameBox { 
	public static void main(String [] args) {
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		System.out.print("Enter your name: \n");
		String ss="-".repeat(s.length());
		System.out.println('+'+ss+'+');
		System.out.println('|'+ s + '|');
		System.out.println('+'+ss+'+');
		scan.close();
	}
	
}
