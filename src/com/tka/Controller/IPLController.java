package com.tka.Controller;

import java.util.HashSet;
import java.util.Set;

import com.tka.Dao.ILplPlayerDao;
import com.tka.Entity.Player;
import com.tka.Service.IPLPlayerService;

public class IPLController {
	IPLPlayerService Service = null;

	public Set<Player> getAllPlayerController() {
		Service = new IPLPlayerService();
		Set<Player> db = Service.getAllPlayerService();
		return db;

	}

	public Set<Player> getteamnameController(String ch) {
		Service = new IPLPlayerService();
		Set<Player> db1 = Service.getteamnameService(ch);

		return db1;

	}
	public Set<Player> getPlayernameController(String name) {
		Service = new IPLPlayerService();
		Set<Player> db2 = Service.getPlayernameService(name);

		return db2;
	}
	public Set<Player> getPlayerRunController(int run) {
		Service = new IPLPlayerService();
		Set<Player> db3 = Service.getPlayerRunService(run);

		return db3;
}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	