package Main;

import pkgData.Player;

public class MainAppl {

	public static void main(String[] args) {
		Player player = new Player(5, "Alaba", "Defense");
		System.out.println("== " +player);
		
		player = new Player(10, "Kalajdzic", "Defense");
		System.out.println("== " +player);
	}
	

}
