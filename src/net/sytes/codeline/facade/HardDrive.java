package net.sytes.codeline.facade;

public class HardDrive {

	public String read(long lba, long size) {
		return "Rading data from sector " + lba + " with the size of " + size + " bytes!";
	}
	
}
