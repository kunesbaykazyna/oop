package practice4.t2.app;

//import java.util.ArrayList;
//import java.util.List;
import practice4.t2.model.*;
import practice4.t2.services.Restaurant;

public class Main {

	public static void main(String[] args) {
		Restaurant res=new Restaurant();
		Student p1=new Student("Aruzhan",18,"it student",10000);
		Cat c1=new Cat("Tory",2);
		System.out.println(p1.getBalance());
		res.servePizza(c1);
		res.servePizza(p1);
	}


}
