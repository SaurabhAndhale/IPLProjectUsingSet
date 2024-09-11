package com.tka.Client;

import java.util.Set;

import com.tka.Controller.IPLController;
import com.tka.Entity.Player;

class IPLClient {
	public static void main(String[] args) {
		IPLController controller = new IPLController();
		Set<Player> db = controller.getAllPlayerController();

		for (Player player : db) {
			System.out.println(player);
		}

		System.out.println("---------------------------------");
		Set<Player> db1 = controller.getteamnameController("CSK");

		for (Player player : db1) {
			System.out.println(player);
		}

		System.out.println("---------------------------------");
		Set<Player> db2 = controller.getPlayerRunController(100000);

		for (Player player : db2) {
			System.out.println(player);
		}

		System.out.println("---------------------------------");
		Set<Player> db3 = controller.getPlayernameController("msd");

		for (Player player : db3) {
			System.out.println(player);
		}

		System.out.println("---------------------------------");
	}
	}
	

