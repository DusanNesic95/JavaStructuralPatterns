package net.sytes.codeline.adapter;

public class RoundHole {

	private final int radius;
	
	public RoundHole(int radius) {
		this.radius = radius;
		System.out.println("The radius of the hole is: " + (radius * Math.sqrt(2)));
	}
	
	public int getRadius() {
		return radius;
	}
	
}
