package week3.assignments;

import java.util.Map;
import java.util.TreeMap;

public class FindOccurances {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "welcome to Selenium automation";
		
		char[] chars = str.toCharArray();
		
		Map<Character,Integer> uniqueStr = new TreeMap<Character,Integer>();
		
		for (int i = 0; i < chars.length; i++) {
			
			if(uniqueStr.containsKey(chars[i])) {
				int value = uniqueStr.get(chars[i]);
				int newValue = value+1;
				uniqueStr.put(chars[i], newValue);
			} else {
				uniqueStr.put(chars[i], 1);
			}
			
		}
		
		System.out.println(uniqueStr);
	}

}
