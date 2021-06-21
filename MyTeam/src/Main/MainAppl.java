package Main;

import pkgData.Player;

public class MainAppl {

	public static void main(String[] args) {
		Player player = new Player(8, "Alaba", "Defense");
		System.out.println("== " +player);
		
		Player player = new Player(4, "Hinteregger", "Defense");
		System.out.println("== " +player);
		
		Player player = new Player(2, "Dragovic", "Defense");
		System.out.println("== " +player);
		
		Player player = new Player(11, "Arnautivic", "Striker");
		System.out.println("== " +player);
	}

}
