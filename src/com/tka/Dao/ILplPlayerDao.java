package com.tka.Dao;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.tka.Entity.Player;

public class ILplPlayerDao {
public Set<Player> getAllPlayer(){
//	System.out.println("IPLPlayerDao --> IPLPlayerService");
	Set<Player> db=new HashSet<Player>();
//	int [] c= {1,2,3};
	db.add(new Player("msd",7,"CSK",100000,50));
	db.add(new Player("rutu",18,"CSK",1000,2));
	db.add(new Player("Rohit",45,"mi",1000,45));
	db.add(new Player("Surya",48,"mi",1000,40));
	db.add(new Player("Rahul",22,"LSG",1000,42));
	return db;
}


}
