package net.sytes.codeline.main;

import net.sytes.codeline.facade.ComputerFacade;

public class MainFacade {

	public static void main(String[] args) {
		ComputerFacade computer = new ComputerFacade();
		computer.start();
	}
	
}
