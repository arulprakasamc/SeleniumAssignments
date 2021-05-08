package week3.assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] input = {"HCL","Wipro","Aspire Systems","CTS"};
		
		List<String> companies = new ArrayList<String>();
				
		for (int i = 0; i < input.length; i++) {
			companies.add(input[i]);
		}
		
		Collections.sort(companies);
		//System.out.println(companies);
		
		String[] itemsArray = new String[companies.size()];
		companies.toArray(itemsArray);
		int size = itemsArray.length;
		
		for (int i = size-1; i >=0; i--) {
		System.out.println(itemsArray[i]);
		}
	
		}
	}

