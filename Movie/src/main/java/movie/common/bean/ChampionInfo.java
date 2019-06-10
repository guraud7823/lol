package movie.common.bean;

import java.util.ArrayList;

public class ChampionInfo {
	private ArrayList<Integer> freeChampionIdsForNewPlayers = new ArrayList<Integer>();
	private  ArrayList<Integer> freeChampionIds = new ArrayList<Integer>();
	private int maxNewPlayerLevel;
	public ArrayList<Integer> getFreeChampionIdsForNewPlayers() {
		return freeChampionIdsForNewPlayers;
	}
	public void setFreeChampionIdsForNewPlayers(ArrayList<Integer> freeChampionIdsForNewPlayers) {
		this.freeChampionIdsForNewPlayers = freeChampionIdsForNewPlayers;
	}
	public ArrayList<Integer> getFreeChampionIds() {
		return freeChampionIds;
	}
	public void setFreeChampionIds(ArrayList<Integer> freeChampionIds) {
		this.freeChampionIds = freeChampionIds;
	}
	public int getMaxNewPlayerLevel() {
		return maxNewPlayerLevel;
	}
	public void setMaxNewPlayerLevel(int maxNewPlayerLevel) {
		this.maxNewPlayerLevel = maxNewPlayerLevel;
	}
}
