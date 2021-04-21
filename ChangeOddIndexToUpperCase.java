package week1.assignments;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "changeme";
		
		char[] chars = str.toCharArray();
		
		for (int i = 0; i < chars.length; i++) {
			 
			if (i % 2 == 0) {
				char ch1 = Character.toUpperCase(chars[i]);
				System.out.print(ch1);
			}
				else {
					System.out.print(chars[i]);
				}
				}
				
			}
			
		}
	
