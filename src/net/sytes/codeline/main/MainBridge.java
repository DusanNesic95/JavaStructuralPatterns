package net.sytes.codeline.main;

import net.sytes.codeline.bridge.GreenColor;
import net.sytes.codeline.bridge.Pentagon;
import net.sytes.codeline.bridge.RedColor;
import net.sytes.codeline.bridge.Shape;
import net.sytes.codeline.bridge.Triangle;

public class MainBridge {

	public static void main(String[] args) {
		Shape triangle = new Triangle(new RedColor());
		triangle.applyColor();
		
		Shape pentagon = new Pentagon(new GreenColor());
		pentagon.applyColor();
	}
	
}
