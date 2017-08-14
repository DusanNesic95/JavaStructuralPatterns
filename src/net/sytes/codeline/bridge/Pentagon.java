package net.sytes.codeline.bridge;

public class Pentagon extends Shape {

	public Pentagon(Color color) {
		super(color);
	}
	
	@Override
	public void applyColor() {
		System.out.println("Pentagon is filled with color.");
		color.applyColor();
	}

}
