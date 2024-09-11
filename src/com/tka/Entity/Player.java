package com.tka.Entity;

public class Player {
private String nm;
private int no;
private String Team;
private int run;
private int Wicket;
@Override
public String toString() {
	return "Player [nm=" + nm + ", no=" + no + ", Team=" + Team + ", run=" + run + ", Wicket=" + Wicket + "]";
}
public String getNm() {
	return nm;
}
public void setNm(String nm) {
	this.nm = nm;
}
public int getNo() {
	return no;
}
public void setNo(int no) {
	this.no = no;
}
public String getTeam() {
	return Team;
}
public void setTeam(String team) {
	Team = team;
}
public int getRun() {
	return run;
}
public void setRun(int run) {
	this.run = run;
}
public int getWicket() {
	return Wicket;
}
public void setWicket(int wicket) {
	Wicket = wicket;
}
public Player(String nm, int no, String team, int run, int wicket) {
	super();
	this.nm = nm;
	this.no = no;
	Team = team;
	this.run = run;
	Wicket = wicket;
}
public Player() {
	super();
}
}
