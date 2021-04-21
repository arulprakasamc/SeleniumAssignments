package week1.assignments;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "madam";
		
		String strRev = "";
		char[] chars = str.toCharArray();
		
		for (int i = chars.length-1; i >= 0 ; i--) {
			strRev = strRev + chars[i];
		}
		System.out.println(strRev);
		
		if(str.equals(strRev)) {
			System.out.println("The given string is Palindrome");
		}
		else {
			System.out.println("The given string is not Palindrome");
		}
	}


}
