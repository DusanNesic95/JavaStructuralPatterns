package net.sytes.codeline.main;

import net.sytes.codeline.adapter.RoundHole;
import net.sytes.codeline.adapter.SquarePegAdapter;

public class MainAdapter {

	public static void main(String[] args) {
		RoundHole roundHole = new RoundHole(5);
		SquarePegAdapter adapter;
		
		for (int i = 6; i < 10; i++) {
			adapter = new SquarePegAdapter(i);
			adapter.makeFit(roundHole);
		}
	}
	
}
