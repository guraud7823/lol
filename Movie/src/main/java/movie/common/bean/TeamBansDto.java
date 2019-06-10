package movie.common.bean;

public class TeamBansDto {
	private int pickTurn; //Turn during which the champion was banned. 
	private int championId; // Banned championId.  
	public int getPickTurn() {
		return pickTurn;
	}
	public void setPickTurn(int pickTurn) {
		this.pickTurn = pickTurn;
	}
	public int getChampionId() {
		return championId;
	}
	public void setChampionId(int championId) {
		this.championId = championId;
	}
} 
