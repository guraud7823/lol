package movie.common.bean;

import java.util.ArrayList;
import java.util.HashMap;

public class ParticipantDto {
	private HashMap<String, Object> stats = new HashMap<String, Object>(); //Participant statistics. 
	private int participantId;
	private ArrayList<RuneDto> runes = new ArrayList(); //List of legacy Rune information. Not included for matches played with Runes Reforged. 
	private ParticipantTimelineDto timeline = new ParticipantTimelineDto(); // Participant timeline data.  
	private int teamId; // 100 for blue side. 200 for red side.  
	private int spell2Id; //Second Summoner Spell id. 
	private ArrayList<MasteryDto> masteries = new ArrayList(); //List of legacy Mastery information. Not included for matches played with Runes Reforged. 
	private String highestAchievedSeasonTier = new String(); // Highest ranked tier achieved for the previous season in a specific subset of queueIds, if any, otherwise null. Used to display border in game loading screen. Please refer to the Ranked Info documentation 
	private int spell1Id; //First Summoner Spell id. 
	private int championId;
	public HashMap<String, Object> getStats() {
		return stats;
	}
	public void setStats(HashMap<String, Object> stats) {
		this.stats = stats;
	}
	public int getParticipantId() {
		return participantId;
	}
	public void setParticipantId(int participantId) {
		this.participantId = participantId;
	}
	public ArrayList<RuneDto> getRunes() {
		return runes;
	}
	public void setRunes(ArrayList<RuneDto> runes) {
		this.runes = runes;
	}
	public ParticipantTimelineDto getTimeline() {
		return timeline;
	}
	public void setTimeline(ParticipantTimelineDto timeline) {
		this.timeline = timeline;
	}
	public int getTeamId() {
		return teamId;
	}
	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}
	public int getSpell2Id() {
		return spell2Id;
	}
	public void setSpell2Id(int spell2Id) {
		this.spell2Id = spell2Id;
	}
	public ArrayList<MasteryDto> getMasteries() {
		return masteries;
	}
	public void setMasteries(ArrayList<MasteryDto> masteries) {
		this.masteries = masteries;
	}
	public String getHighestAchievedSeasonTier() {
		return highestAchievedSeasonTier;
	}
	public void setHighestAchievedSeasonTier(String highestAchievedSeasonTier) {
		this.highestAchievedSeasonTier = highestAchievedSeasonTier;
	}
	public int getSpell1Id() {
		return spell1Id;
	}
	public void setSpell1Id(int spell1Id) {
		this.spell1Id = spell1Id;
	}
	public int getChampionId() {
		return championId;
	}
	public void setChampionId(int championId) {
		this.championId = championId;
	}
}
