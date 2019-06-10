package movie.common.bean;

public class SummonerDTO {
	private int profileIconId; //ID of the summoner icon associated with the summoner.
	private String name = new String(); // Summoner name.  
	private String puuid = new String(); //Encrypted PUUID. Exact length of 78 characters. 
	private long summonerLevel; // Summoner level associated with the summoner.  
	private long revisionDate; // Date summoner was last modified specified as epoch milliseconds. The following events will update this timestamp: profile icon change, playing the tutorial or advanced tutorial, finishing a game, summoner name change  
	private String id = new String(); //Encrypted summoner ID. Max length 63 characters. 
	public int getProfileIconId() {
		return profileIconId;
	}
	public void setProfileIconId(int profileIconId) {
		this.profileIconId = profileIconId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPuuid() {
		return puuid;
	}
	public void setPuuid(String puuid) {
		this.puuid = puuid;
	}
	public long getSummonerLevel() {
		return summonerLevel;
	}
	public void setSummonerLevel(long summonerLevel) {
		this.summonerLevel = summonerLevel;
	}
	public long getRevisionDate() {
		return revisionDate;
	}
	public void setRevisionDate(long revisionDate) {
		this.revisionDate = revisionDate;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAccountId() {
		return accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	private String accountId = new String(); //Encrypted account ID. Max length 56 characters. 
}
