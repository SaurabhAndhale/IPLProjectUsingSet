package com.tka.Service;

import java.util.HashSet;
import java.util.Set;

import com.tka.Dao.ILplPlayerDao;
import com.tka.Entity.Player;

public class IPLPlayerService {
	ILplPlayerDao dao = null;

	public Set<Player> getAllPlayerService() {
		dao = new ILplPlayerDao();
		Set<Player> db = dao.getAllPlayer();
		return db;

	}

	public Set<Player> getteamnameService(String ch) {
		dao = new ILplPlayerDao();
		Set<Player> db = dao.getAllPlayer();
		Set<Player> db1 = new HashSet<Player>();
		for (Player p1 : db) {
			if (p1.getTeam().contains(ch)) {
				db1.add(p1);
			}
		}
		return db1;

	}

	public Set<Player> getPlayernameService(String ch) {
		dao = new ILplPlayerDao();
		Set<Player> db = dao.getAllPlayer();
		Set<Player> db2 = new HashSet<Player>();
		for (Player p1 : db) {
			if (p1.getNm().contains(ch)) {
				db2.add(p1);
			}
		}
		return db2;

	}

	public Set<Player> getPlayerRunService(int run) {
		dao = new ILplPlayerDao();
		Set<Player> db = dao.getAllPlayer();
		Set<Player> db3 = new HashSet<Player>();
		for (Player p1 : db) {
			if (p1.getRun() == run) {
				db3.add(p1);
			}
		}
		return db3;

	}
}