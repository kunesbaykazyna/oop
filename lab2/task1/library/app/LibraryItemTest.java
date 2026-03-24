package lab2.task1.library.app;

import lab2.task1.library.model.*;

public class LibraryItemTest {

	public static void main(String[] args) {
		LibraryItem l=new Book("The Little Book of Ikigai","Ken Mogi",2017,100);
		System.out.print(l.toString());
	}

}
