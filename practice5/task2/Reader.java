package practice5.task2;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class Reader {
	public static void main(String[] args) {
		
	    String ipPath="C:\\Users\\User\\Documents\\oop-main\\practice5\\task2\\input.txt";
		String opPath = "C:\\Users\\User\\Documents\\oop-main\\practice5\\task2\\report.txt";
		Map <String,Integer> wordCount=new HashMap<>();
		
		try (BufferedReader bfr = new BufferedReader(new FileReader(ipPath,StandardCharsets.UTF_8));
			PrintWriter wr=new PrintWriter(opPath,StandardCharsets.UTF_8);){
			
			String line ;
			while ((line = bfr.readLine()) != null) {				
				String[] words = line.toLowerCase().split("\\W+");
				
                for (String word : words) {
                    if (word.isEmpty()) continue;
                    wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                }
			}
			
		    List<Map.Entry<String, Integer>> list = new ArrayList<>(wordCount.entrySet());
		    list.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
			
			for (Map.Entry<String, Integer> entry : list) {
			    String word = entry.getKey();
			    Integer count = entry.getValue();
			    wr.println(word + ": " + count);
			    
			    System.out.println(word + ": " + count);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
	

