package org.bank;

public class AxisBank extends BankInfo {
	
	public void deposit() {
		System.out.println("This is Axis bank deposit account");
	}
	
	public static void main(String[] args) {
		AxisBank bank = new AxisBank();
		bank.deposit();
	}
}
