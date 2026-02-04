package practice1;
import java.util.Scanner;
public class Balance {

	public static void main(String [] args) {
		System.out.println("Enter your current balance: ");
		Scanner scann=new Scanner(System.in);
		int b=scann.nextInt();
		System.out.println("Yout balance: "+b);
		System.out.println("Please enter: ");
		int n=scann.nextInt();
		int new_balance=b+n;
		System.out.println("Your new balance: "+new_balance);
		scann.close();
	}
}
