package practice5.task1.app;

import java.util.Scanner;

public class SafeDivider {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		while(true) {
		try {
			int x1 = Integer.parseInt(sc.nextLine());
			int x2 = Integer.parseInt(sc.nextLine());
			
			int check = x1 / x2; 
			double res = (double) x1 / x2;
			System.out.println("Result: " + res);
			break;
			}
		
		catch(ArithmeticException e) {
			e.printStackTrace();
		}
		catch(NumberFormatException e) {
			e.printStackTrace();
			sc.nextLine();
		}
		
		}
		sc.close();
	}
}
