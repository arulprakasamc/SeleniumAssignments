package week3.assignments;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class ReverseMap {

	public static void main(String[] args) {
		
		Map<Integer,String> employee = new TreeMap<Integer,String>(Collections.reverseOrder());
		employee.put(100, "Raj");
		employee.put(101, "Arun");
		employee.put(102, "Saran");
		employee.put(103, "Karthik");
		System.out.println(employee);
			
		}
	
	}
