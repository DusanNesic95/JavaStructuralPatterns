package net.sytes.codeline.adapter;

public class SquarePegAdapter {

	private final SquarePeg squarePeg;
	
	public SquarePegAdapter(double width) {
		this.squarePeg = new SquarePeg(width);
	}
	
	public void makeFit(RoundHole roundHole) {
		double ammount = squarePeg.getWidth() - roundHole.getRadius() * Math.sqrt(2);
		
		if (ammount > 0) {
			System.out.println("Reducing the width of the Square Peg with the size of: " + squarePeg.getWidth());
			squarePeg.setWidth(squarePeg.getWidth() -  ammount);
			System.out.println("The width of the peg is now: " + squarePeg.getWidth());
		} else {
			System.out.println("The size of the peg is: " + squarePeg.getWidth() + ", and it does not require reduction.");
		}
	}
	
}
