package practice4.t4.model;

import java.util.Comparator;

public class MajorComparator implements Comparator <Student>{

	@Override
	public int compare(Student o1, Student o2) {
		return o1.major.compareTo(o2.major);
	}

}
