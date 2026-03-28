package practice4.t5.main;
import java.util.Arrays;
import practice4.t5.services.CountingSort;

public class App {
	 public static void main(String[] args) {

	        int[] arr = {5, 3, 1, 4, 3, 2, 5, 0, 10, 7};
	        System.out.println("Before: "+Arrays.toString(arr));
	        
	        CountingSort sorter = new CountingSort();
	        int[] sorted = sorter.sort(arr);
	        
	        System.out.println("After: " + Arrays.toString(sorted));
	    }
}
