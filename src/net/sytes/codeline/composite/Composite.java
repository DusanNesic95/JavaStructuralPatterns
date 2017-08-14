package net.sytes.codeline.composite;

public abstract class Composite implements Component {

	private Component[] children = new Component[9];
	private int total = 0;
	private int value;
	
	public Composite(int value) {
		this.value = value;
	}
	
	public void add(Component component) {
		children[total++] = component;
	}

	@Override
	public void traverse() {
		System.out.println("Value is: " + value);
		for (int i = 0; i < total; i++) {
			children[i].traverse();
		}
	}
	
}
