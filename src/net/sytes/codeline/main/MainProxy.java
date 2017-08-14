package net.sytes.codeline.main;

import net.sytes.codeline.proxy.Image;
import net.sytes.codeline.proxy.ProxyImage;

public class MainProxy {

	public static void main(String[] args) {
		final Image image1 = new ProxyImage("Logo.jpg");
		final Image image2 = new ProxyImage("Header.png");
		
		image1.displayImage();
		image1.displayImage();
		image2.displayImage();
		image2.displayImage();
		image1.displayImage();
	}

}
