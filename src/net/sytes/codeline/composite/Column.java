package net.sytes.codeline.composite;

public class Column extends Composite {

	public Column(int value) {
		super(value);
	}

	@Override
	public void traverse() {
		System.out.println("Column");
		super.traverse();
	}
	
}
