package org.system;

public class Desktop extends Computer {

	public void desktopSize() {
		System.out.println("This is desktop size");
		
	}
	
	public static void main(String[] args) {
		
		Desktop machine = new Desktop();
		machine.desktopSize();
		machine.computerModel();
		
	}

}