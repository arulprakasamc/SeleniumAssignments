package org.student;

import org.department.Department;

public class Student extends Department {

	public void studentName() {
		System.out.println("This is Student name");
	}
	
	public void studentDept() {
		System.out.println("This is student department");
	}
	
	public void studentId() {
		System.out.println("This is student ID");
	}
	
	public static void main(String[] args) {
		Student std = new Student();
		
	}
}


