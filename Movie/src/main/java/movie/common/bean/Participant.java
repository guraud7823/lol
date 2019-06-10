package movie.common.bean;

public class Participant {
	private long profileIconId; // The ID of the profile icon used by this participant 
	private long championId; // The ID of the champion played by this participant  
	private String summonerName = new String(); // The summoner name of this participant  
	private boolean bot; // Flag indicating whether or not this participant is a bot  
	private long spell2Id; // The ID of the second summoner spell used by this participant  
	private long teamId; // The team ID of this participant, indicating the participant's team  
	private long spell1Id; //The ID of the first summoner spell used by this participant 
}
