package movie.common.function;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class MakeUrl {
	private String mainURL = "https://kr.api.riotgames.com";
	private String championMasteryURL = "/lol/champion-mastery/v4"; //0
	private String championURL = "/lol/platform/v3"; //1
	private String leagueURL = "/lol/league/v4"; //2
	private String lolStatusURL = "/lol/status/v3"; //3
	private String matchURL = "/lol/match/v4"; //4
	private String spectatorURL = "/lol/spectator/v4"; //5
	private String summonerURL = "/lol/summoner/v4"; //6
	
	public String ChampionMasteryResult(String summonerId) {
		String url = mainURL + championMasteryURL + "/champion-masteries/by-summoner/"+ urlEncoder(summonerId);
		return url;
	}
	public String ChampionMasteryResult(String summonerId, String championId) {
		String url = mainURL + championMasteryURL + "/champion-masteries/by-summoner/"+ urlEncoder(summonerId) + "/by-champion/" + urlEncoder(championId);
		return url;
	}
	public String ChampionMasterySum(String summonerId) {
		String url = mainURL + championMasteryURL + "/scores/by-summoner/"+ urlEncoder(summonerId);
		return url;
	}
	public String ChampionRotation() {
		String url = mainURL + championURL + "/champion-rotations";
		return url;
	}
	public String challengerLeague(int num) {
		String url = mainURL + leagueURL +"/challengerleagues/by-queue/"; 
		url += urlEncoder(queueSelect(num));
		return url;
	}
	public String grandMasterLeague(int num) {
		String url = mainURL + leagueURL +"/grandmasterleagues/by-queue/"; 
		url += urlEncoder(queueSelect(num));
		return url;
	}
	public String masterLeague(int num) {
		String url = mainURL + leagueURL +"/masterleagues/by-queue/"; 
		url += urlEncoder(queueSelect(num));
		return url;
	}
	public String leagueResultToleaugeId(String leagueId) { //리그 번호로 찾기
		String url = mainURL + leagueURL + "/leagues/" + urlEncoder(leagueId);
		return url;
	}
	public String positionalRankQueues () { //??이건 뭐하는거지
		String url = mainURL + leagueURL + "/positional-rank-queues/";
		return url;
	}
	public String leagueResult(String summonerId) {
		String url = mainURL + leagueURL + "/positions/by-summoner/"+ urlEncoder(summonerId);
		return url;
	}
	public String leagueResult(String positionalQueue, String tier, String division, int page) { //전체리그에서 조회함
		String url = mainURL + leagueURL + "/positions/"+ urlEncoder(positionalQueue + tier + division + page);
		return url;
	}
	public String leagueEntryResult(String summonerId) {
		String url = mainURL + leagueURL + "/entries/by-summoner/"+ urlEncoder(summonerId);
		return url;
	}
	public String leagueEntryResult(String positionalQueue, String tier, String division, int page) { //전체리그에서 조회함
		String url = mainURL + leagueURL + "/entries/"+ urlEncoder(positionalQueue + tier + division + page);
		return url;
	}
	public String lolStatus() {
		String url = mainURL + lolStatusURL +"/shard-data";
		return url;
	}
	public String summonerResult(String summonerName) {
		String url = mainURL + summonerURL + "/summoners/by-name/" + urlEncoder(summonerName);
		return url;
	}
	public String matchResult(String matchId) {
		String url = mainURL + matchURL + "/matches/" + urlEncoder(matchId);
		return url;
	}
	public String matchListResult
	(String summonerId, String champion, String queue, String season, String endTime, String beginTime, String endIndex, String beginIndex) {
		String subcmd = "";
		if(!"".equals(champion) && champion != null)
			subcmd = "champion=" + champion + "&";
		if(!"".equals(queue) && queue != null)
			subcmd = subcmd +  "queue=" + queue + "&";
		if(!"".equals(season) && season != null)
			subcmd = subcmd +  "season=" + season + "&";
		if(!"".equals(endTime) && endTime != null)
			subcmd = subcmd +  "endTime=" + endTime + "&";
		if(!"".equals(beginTime) && beginTime != null)
			subcmd = subcmd +  "beginTime=" + beginTime + "&";
		
		subcmd = subcmd + "endIndex=" + endIndex + "&";
		subcmd = subcmd + "beginIndex=" + beginIndex;
		String url = mainURL + matchURL + "/matchlists/by-account/" + urlEncoder(summonerId) + "?" + subcmd;
		return url;
	}
	public String matchTimeLineResult(String matchId) {
		String url = mainURL + summonerURL + "/timelines/by-match/" + urlEncoder(matchId);
		return url;
	}
	public String currentGameResult(String summonerId) {
		String url = mainURL + spectatorURL + "/active-games/by-summoner/" + urlEncoder(summonerId);
		return url;
	}
	public String featuredGameResult() { //주요게임 정보 프로들 전적인듯 ㅇㅅㅇ
		String url = mainURL + spectatorURL + "/featured-games";
		return url;
	}
	private String queueSelect(int num) {
		String ouput = null;
		switch(num){
		case 1:
			ouput = "RANKED_FLEX_TT";
			break;
		case 2:
			ouput = "RANKED_FLEX_SR";
			break;
		case 3:
			ouput = "RANKED_FLEX_TT";
			break;
		default:
			System.out.println("에러");
			}
		return ouput;
	}
	private String urlEncoder(String input) {
		String encodeResult = null;
		try {
			encodeResult = URLEncoder.encode(input, "UTF-8").replace("+","%20");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return encodeResult;
	}
}
