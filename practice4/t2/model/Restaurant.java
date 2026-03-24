package practice4.t2.model;

public class Restaurant {
	 boolean servePizza(CanHavePizza eater) {
		 eater.eatPizza();
		 if (eater instanceof Person) {
			 return true;
		 }
		 return false;
		 }

}
