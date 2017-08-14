package net.sytes.codeline.composite;

public class Primitive implements Component {

	private int value;
	
	public Primitive(int value) {
		this.value = value;
	}
	
	@Override
	public void traverse() {
		System.out.println("Value: " + value);
	}

}
