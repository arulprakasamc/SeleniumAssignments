package week1.assignments;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "I am a software tester"; 
		
		String[] str1 = str.split(" ");
		
		for (int i = 0; i < str1.length; i++) {
			
			
			if(i % 2 == 0)
			{
				System.out.print(str1[i] + " ");
				
			} else {
				char[] chars = str1[i].toCharArray();
				for (int j = chars.length-1; j >= 0; j--) {
				System.out.print(chars[j]);
					
				}
				System.out.print(" ");
			}
			
		}
	}

}
