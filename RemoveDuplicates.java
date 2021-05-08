package week3.assignments;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "PayPal";
		
		char[] chars = input.toCharArray();
		
		Set<Character> charSet = new LinkedHashSet<Character>();
		
		Set<Character> dupCharSet = new LinkedHashSet<Character>();
		
		for (int i = 0; i < chars.length; i++) {
			char str = chars[i];
			if (str != ' ') {
				charSet.add(new Character(chars[i]));

			}


			if (charSet.contains(chars[i])) {
				dupCharSet.add(new Character(chars[i]));

			}

		}

		if (dupCharSet.equals(charSet)) {
			charSet.remove(dupCharSet);
		}


				System.out.println(charSet);
			
		}
}
		
	
