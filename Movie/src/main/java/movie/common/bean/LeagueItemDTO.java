package movie.common.bean;

public class LeagueItemDTO {
	private String summonerName = new String();
	private boolean hotStreak;
	private MiniSeriesDTO miniSeries = new MiniSeriesDTO();
	private int wins;
	private boolean veteran;
	private int losses;
	private boolean freshBlood;
	private boolean inactive;
	private String rank = new String();
	private String summonerId = new String(); //Player's summonerId (Encrypted) 
	private int leaguePoints;
}
