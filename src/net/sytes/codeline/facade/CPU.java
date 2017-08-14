package net.sytes.codeline.facade;

public class CPU {

	public void freeze() {
		System.out.println("The part is not receiving power now!");
	}
	
	public void jump(long registerIndex) {
		System.out.println("The pointer is now pointing to the " + registerIndex + " register in memory!");
	}
	
	public void exectue() {
		System.out.println("The command is now executing!");
	}
	
}
