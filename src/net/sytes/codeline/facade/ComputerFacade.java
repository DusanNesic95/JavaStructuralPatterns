package net.sytes.codeline.facade;

public class ComputerFacade {

	private CPU processor;
	private Memory ram;
	private HardDrive ssd;
	
	public ComputerFacade() {
		this.processor = new CPU();
		this.ram = new Memory();
		this.ssd = new HardDrive();
	}
	
	public void start() {
		processor.freeze();
		ram.load(0, ssd.read(0, 20));
		processor.jump(0);
		processor.exectue();
	}
	
}
