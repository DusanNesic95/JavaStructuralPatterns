package net.sytes.codeline.proxy;

public class RealImage implements Image {

	private String filename = null;
	
	public RealImage(final String filename) {
		this.filename = filename;
		loadImageFromDisk();
	}
	
	@Override
	public void displayImage() {
		System.out.println("Displaying " + filename);
	}
	
	private void loadImageFromDisk() {
		System.out.println("Loading " + filename);
	}
	
}
