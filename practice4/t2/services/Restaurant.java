package practice4.t2.services;

import practice4.t2.model.CanHavePizza;
import practice4.t2.model.Person;

public class Restaurant {
	double totalBalance;
	public boolean servePizza(CanHavePizza eater) {
		 
		eater.eatPizza();
		if (eater instanceof Person) {
			 Person person = (Person) eater;
		     totalBalance=person.getBalance() - 4500;
			System.out.print(totalBalance);

			return true;
		 }
		 return false;
	}
}
