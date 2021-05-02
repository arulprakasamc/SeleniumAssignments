package org.university;

public class College extends University {

	@Override
	public void ug() {
	System.out.println("This is overrided method PG");
		
	}
	
	public static void main(String[] args) {
		College col = new College();
		col.ug();
		col.pg();
	}
}
