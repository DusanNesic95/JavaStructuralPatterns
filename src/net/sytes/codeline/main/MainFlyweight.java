package net.sytes.codeline.main;

import net.sytes.codeline.flyweight.Circle;
import net.sytes.codeline.flyweight.ShapeFactory;

public class MainFlyweight {

	private static final String colors[] = {"Red", "Green", "Blue", "White", "Black"};
	
	public static void main(String[] args) {
		for (int i = 0; i < 20; ++i) {
			Circle circle = (Circle) ShapeFactory.getCircle(getRandomColor());
			circle.setX(getRandomCoordinate());
			circle.setY(getRandomCoordinate());
			circle.setRadius(100);
			circle.draw();
		}
	}
	
	private static String getRandomColor() {
		return colors[(int)(Math.random() * colors.length)];
	}
	
	private static int getRandomCoordinate() {
		return (int)(Math.random() * 100);
	}
	
}
