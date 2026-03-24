package lab2.task1.subsuper.app;
import java.util.HashSet;
import lab2.task1.subsuper.model.*;

public class Test {

	public static void main(String[] args) {
		
        HashSet<Person> accounts = new HashSet<>();
        
        Person p1=new Client("Aruzhan",19,"87755673117","a.kopzhanova@kbtu.kz");
        
        Person p2=new Client("Qazyna", 18,"87089052760","k.kunesbay@kbtu.kz");
        
        Person p3=new Client("Ayan",23,"87001114961","mekelay@gmail.com");
        
        Person p4=new Client("Qazyna", 18,"87089052760","k.kunesbay@kbtu.kz");
   
        accounts.add(p1);
        accounts.add(p2);
        accounts.add(p3);
        accounts.add(p4);

        System.out.println("Clients in HashSet:");
        for (Person a : accounts) {
            System.out.println(a.toString());
        }

        System.out.println("Number of clients: " + accounts.size());
	}

}
