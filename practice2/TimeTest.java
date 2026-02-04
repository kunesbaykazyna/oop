package practice2;

public class TimeTest {

	public static void main(String[] args) {
		Time t=new Time(23,12,54);
		System.out.println(t.toStandard());
		System.out.println(t.toUniversal());

	}

}
