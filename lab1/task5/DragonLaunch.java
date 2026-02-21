package lab1.task5;
import java.util.Vector;

public class DragonLaunch {
    private Vector<Person> people = new Vector<>();

    public void kidnap(Person p) {
        getPeople().add(p);
    }

    public boolean willDragonEatOrNot() {
        int j = 0; 
        for (int i = 0; i < getPeople().size(); i++) {
            Person current = getPeople().get(i);
           
            if (j > 0 && getPeople().get(j - 1).getGender() == Gender.BOY && current.getGender() == Gender.GIRL) {
                j--; 
            } else {
                getPeople().set(j, current);
                j++;
            }
        }
        getPeople().setSize(j);
        return j > 0;
    }
 
	public Vector<Person> getPeople() {
		return people;
	}
	
	public String toString() {
		return getPeople().size()+"";
	}
}