package practice4.t5.services;

import java.util.*;
import practice4.t5.model.Sorter;

public class CountingSort implements Sorter {

	@Override
	public int[] sort(int[] arr) {
		 List<Integer> list = new ArrayList<>();
		 Map<Integer, Integer> freq = new HashMap<>();

		 for (int num : arr) {
		     list.add(num);
		     int count = freq.getOrDefault(num, 0);
		     freq.put(num, count + 1);
		 }
		 
		 list.sort((a, b) -> {
			    int countA = freq.get(a);
			    int countB = freq.get(b);

			    if (countA > countB) {
			        return -1; 
			    } 
			    else if (countA < countB) {
			        return 1; 
			    } 
			    else {
			        if (a < b) {
			            return -1; 
			        } else if (a > b) {
			            return 1;
			        } else {
			            return 0;
			        }
			    }
			});
		 
		 for (int i = 0; i < arr.length; i++) {
			    arr[i] = list.get(i);
			}

		 return arr;
	}

	
}
