package movie.common.bean;

import java.util.ArrayList;

public class FeaturedGameInfo {
	private long gameId; // The ID of the game 
	private long gameStartTime; // The game start time represented in epoch milliseconds  
	private String platformId = new String(); // The ID of the platform on which the game is being played  
	private String gameMode = new String(); //The game mode(Legal values: CLASSIC, ODIN, ARAM, TUTORIAL, ONEFORALL, ASCENSION, FIRSTBLOOD, KINGPORO) 
	private long mapId; //The ID of the map 
	private String gameType = new String(); // The game type(Legal values: CUSTOM_GAME, MATCHED_GAME, TUTORIAL_GAME)  
	private ArrayList<BannedChampion> bannedChampions = new ArrayList(); // Banned champion information  
	private Observer observers = new Observer(); //The observer information 
	private ArrayList<Participant> participants = new ArrayList(); // The participant information  
	private long gameLength; //The amount of time in seconds that has passed since the game started 
	private long gameQueueConfigId; // The queue type (queue types are documented on the Game Constants page)  
}
