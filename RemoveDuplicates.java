package week1.assignments;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "We learn java basics as part of java sessions in java week1";
		
		int count = 0;
		
		String[] str1=str.split(" ");
		
		for (int i = 0; i < str1.length; i++) {
			
			for (int j = i+1; j < str1.length; j++) {
				
				if(str1[i].equals(str1[j])) {
					count++;
				}	
				
			if(count > 1){
				str = str.replace(str1[i],"");
				count = 0;
				}
			}
		}
		
		System.out.println(str);
	}
}