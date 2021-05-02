package org.calculator;

public class Calculator {
	
	public void add(int num1,int num2)
	{
		int num3 = num1 + num2;
		System.out.println(num3);
	}
	
	
	public void add(int num1,int num2,int num3)
	{
		int num4 = num1 + num2 + num3;
		System.out.println(num4);
	}
	
	
	public void multiply(int num1,int num2)
	{
		int num3 = num1*num2;
		System.out.println(num3);
	}
	
	
	public void multiply(int num1,double num2)
	{
		double num3 = num1*num2;
		System.out.println(num3);
	}
	
	
	public void sub(int num1,int num2)
	{
		int num3 = num1-num2;
		System.out.println(num3);
	}
	
	
	public void sub(int num1,double num2)
	{
		double num3 = num1-num2;
		System.out.println(num3);
	}
	
	
	public void div(int num1,int num2)
	{
		int num3 = num1/num2;
		System.out.println(num3);
	}
	
	public void div(int num1,double num2)
	{
		double num3 = num1/num2;
		System.out.println(num3);
	}
	
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		cal.add(2,5);
		cal.add(3, 5, 2);
		cal.multiply(4, 2);
		cal.multiply(3,3.5);
		cal.sub(4, 2.5);
		cal.sub(2, 6);
		cal.div(4, 4);
		cal.div(3, 7.5);
	}
}
