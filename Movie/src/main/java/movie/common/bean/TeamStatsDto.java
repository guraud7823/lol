package movie.common.bean;

import java.util.ArrayList;

public class TeamStatsDto {
	private boolean firstDragon; // Flag indicating whether or not the team scored the first Dragon kill.  
	private boolean firstInhibitor; // Flag indicating whether or not the team destroyed the first inhibitor.  
	private ArrayList<TeamBansDto> bans = new ArrayList(); //If match queueId has a draft, contains banned champion data, otherwise empty. 
	private int baronKills; //Number of times the team killed Baron. 
	private boolean firstRiftHerald; //Flag indicating whether or not the team scored the first Rift Herald kill. 
	private boolean firstBaron; // Flag indicating whether or not the team scored the first Baron kill.  
	private int riftHeraldKills; // Number of times the team killed Rift Herald.  
	private boolean firstBlood; //Flag indicating whether or not the team scored the first blood. 
	private int teamId; //100 for blue side. 200 for red side. 
	private boolean firstTower; // Flag indicating whether or not the team destroyed the first tower.  
	private int vilemawKills; // Number of times the team killed Vilemaw.  
	private int inhibitorKills; // Number of inhibitors the team destroyed.  
	private int towerKills; // Number of towers the team destroyed.  
	private int dominionVictoryScore; // For Dominion matches, specifies the points the team had at game end.  
	private String win = new String(); //String indicating whether or not the team won. There are only two values visibile in public match history. 
	private int dragonKills; //Number of times the team killed Dragon. 
	public boolean isFirstDragon() {
		return firstDragon;
	}
	public void setFirstDragon(boolean firstDragon) {
		this.firstDragon = firstDragon;
	}
	public boolean isFirstInhibitor() {
		return firstInhibitor;
	}
	public void setFirstInhibitor(boolean firstInhibitor) {
		this.firstInhibitor = firstInhibitor;
	}
	public ArrayList<TeamBansDto> getBans() {
		return bans;
	}
	public void setBans(ArrayList<TeamBansDto> bans) {
		this.bans = bans;
	}
	public int getBaronKills() {
		return baronKills;
	}
	public void setBaronKills(int baronKills) {
		this.baronKills = baronKills;
	}
	public boolean isFirstRiftHerald() {
		return firstRiftHerald;
	}
	public void setFirstRiftHerald(boolean firstRiftHerald) {
		this.firstRiftHerald = firstRiftHerald;
	}
	public boolean isFirstBaron() {
		return firstBaron;
	}
	public void setFirstBaron(boolean firstBaron) {
		this.firstBaron = firstBaron;
	}
	public int getRiftHeraldKills() {
		return riftHeraldKills;
	}
	public void setRiftHeraldKills(int riftHeraldKills) {
		this.riftHeraldKills = riftHeraldKills;
	}
	public boolean isFirstBlood() {
		return firstBlood;
	}
	public void setFirstBlood(boolean firstBlood) {
		this.firstBlood = firstBlood;
	}
	public int getTeamId() {
		return teamId;
	}
	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}
	public boolean isFirstTower() {
		return firstTower;
	}
	public void setFirstTower(boolean firstTower) {
		this.firstTower = firstTower;
	}
	public int getVilemawKills() {
		return vilemawKills;
	}
	public void setVilemawKills(int vilemawKills) {
		this.vilemawKills = vilemawKills;
	}
	public int getInhibitorKills() {
		return inhibitorKills;
	}
	public void setInhibitorKills(int inhibitorKills) {
		this.inhibitorKills = inhibitorKills;
	}
	public int getTowerKills() {
		return towerKills;
	}
	public void setTowerKills(int towerKills) {
		this.towerKills = towerKills;
	}
	public int getDominionVictoryScore() {
		return dominionVictoryScore;
	}
	public void setDominionVictoryScore(int dominionVictoryScore) {
		this.dominionVictoryScore = dominionVictoryScore;
	}
	public String getWin() {
		return win;
	}
	public void setWin(String win) {
		this.win = win;
	}
	public int getDragonKills() {
		return dragonKills;
	}
	public void setDragonKills(int dragonKills) {
		this.dragonKills = dragonKills;
	}
}
