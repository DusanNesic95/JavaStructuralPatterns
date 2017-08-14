package net.sytes.codeline.bridge;

public class Triangle extends Shape {

	public Triangle(Color color) {
		super(color);
	}
	
	@Override
	public void applyColor() {
		System.out.println("Trianle is filled with color.");
		color.applyColor();
	}

}
