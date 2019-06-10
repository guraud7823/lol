package movie.common.bean;

import java.util.ArrayList;

public class CurrentGameInfo {
	private long gameId; // The ID of the game  
	private long gameStartTime; //The game start time represented in epoch milliseconds 
	private String platformId = new String(); // The ID of the platform on which the game is being played  
	private String gameMode = new String(); // The game mode
	private long mapId; // The ID of the map 
	private String gameType = new String(); // The game type  
	private ArrayList<BannedChampion> bannedChampions = new ArrayList(); //Banned champion information 
	private Observer observers = new Observer(); // The observer information 
	private ArrayList<CurrentGameParticipant> participants = new ArrayList(); //The participant information 
	private long gameLength; //The amount of time in seconds that has passed since the game started 
	private long gamegameQueueConfigIdId; // The queue type (queue types are documented on the Game Constants page)  
}
