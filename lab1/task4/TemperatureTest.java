package lab1.task4;

public class TemperatureTest {

	public static void main(String[] args) {
		Temperature tt=new Temperature(37.0,'C');
		System.out.println(tt.convertC());
		System.out.println(tt.convertF());
		System.out.print(tt.toString());
		
	}

}
