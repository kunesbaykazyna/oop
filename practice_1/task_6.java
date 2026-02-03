package practice_1;
import java.util.Scanner;
public class task_6 {

	public static void main(String [] args) {
		Scanner scann=new Scanner(System.in);
		String s=scann.nextLine();
		StringBuilder res = new StringBuilder();
        res.append(s);
        res.reverse();
        String d=res.toString();
        if(d.equals(s)) {
        	System.out.println("Palindrome ");
        }else {
        	System.out.println("string is not palindrome ");
        }
        
        
        scann.close();
		}
}
