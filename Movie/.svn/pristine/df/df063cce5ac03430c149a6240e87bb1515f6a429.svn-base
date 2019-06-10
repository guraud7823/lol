package movie.lol.controller;

import java.io.IOException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import movie.common.bean.Champion_data;
import movie.common.bean.Champion_skins;
import movie.common.bean.LeagueEntryDTO;
import movie.common.bean.MatchDto;
import movie.common.bean.MatchReferenceDto;
import movie.common.bean.MatchlistDto;
import movie.common.bean.ProFileIcon_data;
import movie.common.bean.SummonerDTO;
import movie.common.function.ConvertToJson;
import movie.common.function.MakeUrl;
import movie.common.function.MapperStatic;

@Controller
public class getSummonerIDController {
	Logger log = LoggerFactory.getLogger(this.getClass());
	
	@RequestMapping(value="/lol/match.do" )//해당주소
	public ModelAndView openMatch(HttpServletRequest request, HttpSession session) throws Exception, IOException{
		ModelAndView mv = new ModelAndView("lol/match");//실행될 jsp파일
		String summonerId = request.getParameter("summonerID");
		String getSummonerInfoUrl = null;
		String getLeagueInfoUrl = null;
		MakeUrl makeUrl = new MakeUrl();
		ObjectMapper mapper = new ObjectMapper();
		ConvertToJson convertToJson = new ConvertToJson();
		
		try {
			getSummonerInfoUrl = convertToJson.convertJson(makeUrl.summonerResult(summonerId));
			
			SummonerDTO summonerDTO = mapper.readValue(getSummonerInfoUrl, SummonerDTO.class);
			
			String getMatchListInfoUrl = null;
			
			getLeagueInfoUrl = convertToJson.convertJson(makeUrl.leagueEntryResult(summonerDTO.getId()));
			getMatchListInfoUrl = convertToJson.convertJson(makeUrl.matchListResult(summonerDTO.getAccountId(),null,null,null,null,null,"5","0"));
			
			ArrayList<LeagueEntryDTO> leagueEntryDTOList=  mapper.readValue(getLeagueInfoUrl, new TypeReference<ArrayList<LeagueEntryDTO>>(){});
			LeagueEntryDTO soloRank = null;
			LeagueEntryDTO teamRank = null;
			for(int i=0; i<leagueEntryDTOList.size(); i++) {
				if("RANKED_SOLO_5x5".equals(leagueEntryDTOList.get(i).getQueueType()))
					soloRank = leagueEntryDTOList.get(i);
				else if("RANKED_FLEX_SR".equals(leagueEntryDTOList.get(i).getQueueType()))
					teamRank = leagueEntryDTOList.get(i);
			}
			MatchlistDto  matchlistDto = mapper.readValue(getMatchListInfoUrl, MatchlistDto.class);
			ProFileIcon_data proFileIcon_data = MapperStatic.getProfileIcon().getData().get(Integer.toString(summonerDTO.getProfileIconId()));
	
			//매칭정보 파싱
			ArrayList<MatchDto> matchDto = new ArrayList<MatchDto>();
			for(int i=0; i< matchlistDto.getMatches().size(); i++) {
				String getmatchInfoUrl = convertToJson.convertJson(makeUrl.matchResult(Long.toString(matchlistDto.getMatches().get(i).getGameId())));
				matchDto.add(mapper.readValue(getmatchInfoUrl, MatchDto.class));	
			}
			
			ArrayList<HashMap<String,Object>> matchInfo = new ArrayList<HashMap<String,Object>>();
			ArrayList<HashMap> playerInfo;
			for(int i=0; i< matchDto.size(); i++) {
				HashMap<String, Object> matchMap = new HashMap<String, Object>();
				playerInfo = new ArrayList<HashMap>();
				for(int j=0; j< matchDto.get(i).getParticipants().size(); j++) {
					String champNm = MapperStatic.getChampionFull().getKeys().get(Integer.toString(matchDto.get(i).getParticipants().get(j).getChampionId()));		
					
					HashMap<String, Object> map = new HashMap<String, Object>();
					map.put("accountId",matchDto.get(i).getParticipantIdentities().get(j).getPlayer().getAccountId());
					map.put("summonerName",matchDto.get(i).getParticipantIdentities().get(j).getPlayer().getSummonerName());
					map.put("summonerId",matchDto.get(i).getParticipantIdentities().get(j).getPlayer().getSummonerId());
					map.put("participantId",matchDto.get(i).getParticipantIdentities().get(j).getParticipantId());
					map.put("teamId",matchDto.get(i).getParticipants().get(j).getTeamId());
					map.put("timeline",matchDto.get(i).getParticipants().get(j).getTimeline());
					map.put("championId",matchDto.get(i).getParticipants().get(j).getChampionId());
					map.put("stats",matchDto.get(i).getParticipants().get(j).getStats());
					map.put("championImg",MapperStatic.getChampionFull().getData().get(champNm).getImage().getFull());
					map.put("championName",MapperStatic.getChampionFull().getData().get(champNm).getName());
					
					//아이템
					map.put("item0Info",MapperStatic.getItem().getData().get(Integer.toString((Integer)matchDto.get(i).getParticipants().get(j).getStats().get("item0"))));
					map.put("item1Info",MapperStatic.getItem().getData().get(Integer.toString((Integer)matchDto.get(i).getParticipants().get(j).getStats().get("item1"))));
					map.put("item2Info",MapperStatic.getItem().getData().get(Integer.toString((Integer)matchDto.get(i).getParticipants().get(j).getStats().get("item2"))));
					map.put("item3Info",MapperStatic.getItem().getData().get(Integer.toString((Integer)matchDto.get(i).getParticipants().get(j).getStats().get("item3"))));
					map.put("item4Info",MapperStatic.getItem().getData().get(Integer.toString((Integer)matchDto.get(i).getParticipants().get(j).getStats().get("item4"))));
					map.put("item5Info",MapperStatic.getItem().getData().get(Integer.toString((Integer)matchDto.get(i).getParticipants().get(j).getStats().get("item5"))));
					map.put("item6Info",MapperStatic.getItem().getData().get(Integer.toString((Integer)matchDto.get(i).getParticipants().get(j).getStats().get("item6"))));
					
					double sum = 0.00f;
					for (double f : matchDto.get(i).getParticipants().get(j).getTimeline().getCreepsPerMinDeltas().values()) {
					    sum += f;
					}
					map.put("CreepsPerMinDeltasAvg",sum/matchDto.get(i).getParticipants().get(j).getTimeline().getCreepsPerMinDeltas().size());
					
					for(int k=0; k< MapperStatic.getRunesReforged().size(); k++) {//룬
						if(MapperStatic.getRunesReforged().get(k).getId() == (Integer)matchDto.get(i).getParticipants().get(j).getStats().get("perkPrimaryStyle")) {
							map.put("perkPrimaryStyleImg", MapperStatic.getRunesReforged().get(k).getIcon());
							map.put("perkPrimaryStyleName", MapperStatic.getRunesReforged().get(k).getName());;
						}
						if(MapperStatic.getRunesReforged().get(k).getId() == (Integer)matchDto.get(i).getParticipants().get(j).getStats().get("perkSubStyle")) {
							map.put("perkSubStyleImg", MapperStatic.getRunesReforged().get(k).getIcon());
							map.put("perkSubStyleImgName", MapperStatic.getRunesReforged().get(k).getName());
						}
					}
					
					Iterator<String> itr = MapperStatic.getSummoner().getData().keySet().iterator();
					while(itr.hasNext()) {
						String key = itr.next();
						if(Integer.parseInt(MapperStatic.getSummoner().getData().get(key).getKey()) == matchDto.get(i).getParticipants().get(j).getSpell1Id()) {
							map.put("spell1IdName", MapperStatic.getSummoner().getData().get(key).getName());
							map.put("spell1IdCooldownBurn", MapperStatic.getSummoner().getData().get(key).getCooldownBurn());
							map.put("spell1IdDescription", MapperStatic.getSummoner().getData().get(key).getDescription());
							map.put("spell1IdImg", MapperStatic.getSummoner().getData().get(key).getImage().getFull());
						}
						if(Integer.parseInt(MapperStatic.getSummoner().getData().get(key).getKey()) == matchDto.get(i).getParticipants().get(j).getSpell2Id()) {
							map.put("spell2IdName", MapperStatic.getSummoner().getData().get(key).getName());
							map.put("spell2IdCooldownBurn", MapperStatic.getSummoner().getData().get(key).getCooldownBurn());
							map.put("spell2IdDescription", MapperStatic.getSummoner().getData().get(key).getDescription());
							map.put("spell2IdImg", MapperStatic.getSummoner().getData().get(key).getImage().getFull());
						}
					}
					playerInfo.add(map);
				}
				
				SimpleDateFormat sdfCurrent = new SimpleDateFormat ("yyyy년 MMMMM dd일 aaa hh시 mm분 "); 
				Timestamp currentTime = new Timestamp(matchDto.get(i).getGameCreation()); 
				String gameCreationStart = sdfCurrent.format(currentTime); 
	
				
				matchMap.put("playerInfo",playerInfo);
				matchMap.put("gameDuration",matchDto.get(i).getGameDuration());
				matchMap.put("gameType",matchDto.get(i).getGameType());
				matchMap.put("gameMode",matchDto.get(i).getGameMode());
				matchMap.put("queueId",matchDto.get(i).getQueueId());
				matchMap.put("gameCreation",gameCreationStart);
				matchInfo.add(matchMap);
			}
			mv.addObject("matchInfo",matchInfo);	
			mv.addObject("matchlist",matchlistDto);	
			mv.addObject("summonerinfo",summonerDTO);	
			mv.addObject("profileiconFile",proFileIcon_data);
			mv.addObject("soloRank",soloRank);
			mv.addObject("teamRank",teamRank);
		}
		catch(Exception e) {
			mv.setViewName("lol/matchError");
		}
		return mv;
	}
	@RequestMapping(value="/lol/match.ajax" )
	public ModelAndView openMatchMore(HttpServletRequest request, HttpSession session) throws Exception, IOException{
		ModelAndView mv = new ModelAndView("jsonView");
		String summonerId = request.getParameter("summonerID");
		String getSummonerInfoUrl = null;
		String getLeagueInfoUrl = null;
		MakeUrl makeUrl = new MakeUrl();
		ObjectMapper mapper = new ObjectMapper();
		ConvertToJson convertToJson = new ConvertToJson();
		
		getSummonerInfoUrl = convertToJson.convertJson(makeUrl.summonerResult(summonerId));
		
		SummonerDTO summonerDTO = mapper.readValue(getSummonerInfoUrl, SummonerDTO.class);
		
		String getMatchListInfoUrl = null;
		
		getLeagueInfoUrl = convertToJson.convertJson(makeUrl.leagueEntryResult(summonerDTO.getId()));
		getMatchListInfoUrl = convertToJson.convertJson(makeUrl.matchListResult(summonerDTO.getAccountId(),null,null,null,null,null,"5","0"));
		
		ArrayList<LeagueEntryDTO> leagueEntryDTOList=  mapper.readValue(getLeagueInfoUrl, new TypeReference<ArrayList<LeagueEntryDTO>>(){});
		LeagueEntryDTO soloRank = null;
		LeagueEntryDTO teamRank = null;
		for(int i=0; i<leagueEntryDTOList.size(); i++) {
			if("RANKED_SOLO_5x5".equals(leagueEntryDTOList.get(i).getQueueType()))
				soloRank = leagueEntryDTOList.get(i);
			else if("RANKED_FLEX_SR".equals(leagueEntryDTOList.get(i).getQueueType()))
				teamRank = leagueEntryDTOList.get(i);
		}
		MatchlistDto  matchlistDto = mapper.readValue(getMatchListInfoUrl, MatchlistDto.class);
		ProFileIcon_data proFileIcon_data = MapperStatic.getProfileIcon().getData().get(Integer.toString(summonerDTO.getProfileIconId()));

		//매칭정보 파싱
		ArrayList<MatchDto> matchDto = new ArrayList<MatchDto>();
		for(int i=0; i< matchlistDto.getMatches().size(); i++) {
			String getmatchInfoUrl = convertToJson.convertJson(makeUrl.matchResult(Long.toString(matchlistDto.getMatches().get(i).getGameId())));
			matchDto.add(mapper.readValue(getmatchInfoUrl, MatchDto.class));	
		}
		
		ArrayList<HashMap<String,Object>> matchInfo = new ArrayList<HashMap<String,Object>>();
		ArrayList<HashMap> playerInfo;
		for(int i=0; i< matchDto.size(); i++) {
			HashMap<String, Object> matchMap = new HashMap<String, Object>();
			playerInfo = new ArrayList<HashMap>();
			for(int j=0; j< matchDto.get(i).getParticipants().size(); j++) {
				String champNm = MapperStatic.getChampionFull().getKeys().get(Integer.toString(matchDto.get(i).getParticipants().get(j).getChampionId()));		
				
				HashMap<String, Object> map = new HashMap<String, Object>();
				map.put("accountId",matchDto.get(i).getParticipantIdentities().get(j).getPlayer().getAccountId());
				map.put("summonerName",matchDto.get(i).getParticipantIdentities().get(j).getPlayer().getSummonerName());
				map.put("summonerId",matchDto.get(i).getParticipantIdentities().get(j).getPlayer().getSummonerId());
				map.put("participantId",matchDto.get(i).getParticipantIdentities().get(j).getParticipantId());
				map.put("teamId",matchDto.get(i).getParticipants().get(j).getTeamId());
				map.put("timeline",matchDto.get(i).getParticipants().get(j).getTimeline());
				map.put("championId",matchDto.get(i).getParticipants().get(j).getChampionId());
				map.put("stats",matchDto.get(i).getParticipants().get(j).getStats());
				map.put("championImg",MapperStatic.getChampionFull().getData().get(champNm).getImage().getFull());
				map.put("championName",MapperStatic.getChampionFull().getData().get(champNm).getName());
				
				//아이템
				map.put("item0Info",MapperStatic.getItem().getData().get(Integer.toString((Integer)matchDto.get(i).getParticipants().get(j).getStats().get("item0"))));
				map.put("item1Info",MapperStatic.getItem().getData().get(Integer.toString((Integer)matchDto.get(i).getParticipants().get(j).getStats().get("item1"))));
				map.put("item2Info",MapperStatic.getItem().getData().get(Integer.toString((Integer)matchDto.get(i).getParticipants().get(j).getStats().get("item2"))));
				map.put("item3Info",MapperStatic.getItem().getData().get(Integer.toString((Integer)matchDto.get(i).getParticipants().get(j).getStats().get("item3"))));
				map.put("item4Info",MapperStatic.getItem().getData().get(Integer.toString((Integer)matchDto.get(i).getParticipants().get(j).getStats().get("item4"))));
				map.put("item5Info",MapperStatic.getItem().getData().get(Integer.toString((Integer)matchDto.get(i).getParticipants().get(j).getStats().get("item5"))));
				map.put("item6Info",MapperStatic.getItem().getData().get(Integer.toString((Integer)matchDto.get(i).getParticipants().get(j).getStats().get("item6"))));
				
				double sum = 0.00f;
				for (double f : matchDto.get(i).getParticipants().get(j).getTimeline().getCreepsPerMinDeltas().values()) {
				    sum += f;
				}
				map.put("CreepsPerMinDeltasAvg",sum/matchDto.get(i).getParticipants().get(j).getTimeline().getCreepsPerMinDeltas().size());
				
				for(int k=0; k< MapperStatic.getRunesReforged().size(); k++) {//룬
					if(MapperStatic.getRunesReforged().get(k).getId() == (Integer)matchDto.get(i).getParticipants().get(j).getStats().get("perkPrimaryStyle")) {
						map.put("perkPrimaryStyleImg", MapperStatic.getRunesReforged().get(k).getIcon());
						map.put("perkPrimaryStyleName", MapperStatic.getRunesReforged().get(k).getName());;
					}
					if(MapperStatic.getRunesReforged().get(k).getId() == (Integer)matchDto.get(i).getParticipants().get(j).getStats().get("perkSubStyle")) {
						map.put("perkSubStyleImg", MapperStatic.getRunesReforged().get(k).getIcon());
						map.put("perkSubStyleImgName", MapperStatic.getRunesReforged().get(k).getName());
					}
				}
				
				Iterator<String> itr = MapperStatic.getSummoner().getData().keySet().iterator();
				while(itr.hasNext()) {
					String key = itr.next();
					if(Integer.parseInt(MapperStatic.getSummoner().getData().get(key).getKey()) == matchDto.get(i).getParticipants().get(j).getSpell1Id()) {
						map.put("spell1IdName", MapperStatic.getSummoner().getData().get(key).getName());
						map.put("spell1IdCooldownBurn", MapperStatic.getSummoner().getData().get(key).getCooldownBurn());
						map.put("spell1IdDescription", MapperStatic.getSummoner().getData().get(key).getDescription());
						map.put("spell1IdImg", MapperStatic.getSummoner().getData().get(key).getImage().getFull());
					}
					if(Integer.parseInt(MapperStatic.getSummoner().getData().get(key).getKey()) == matchDto.get(i).getParticipants().get(j).getSpell2Id()) {
						map.put("spell2IdName", MapperStatic.getSummoner().getData().get(key).getName());
						map.put("spell2IdCooldownBurn", MapperStatic.getSummoner().getData().get(key).getCooldownBurn());
						map.put("spell2IdDescription", MapperStatic.getSummoner().getData().get(key).getDescription());
						map.put("spell2IdImg", MapperStatic.getSummoner().getData().get(key).getImage().getFull());
					}
				}
				playerInfo.add(map);
			}
			
			SimpleDateFormat sdfCurrent = new SimpleDateFormat ("yyyy년 MMMMM dd일 aaa hh시 mm분 "); 
			Timestamp currentTime = new Timestamp(matchDto.get(i).getGameCreation()); 
			String gameCreationStart = sdfCurrent.format(currentTime); 

			
			matchMap.put("playerInfo",playerInfo);
			matchMap.put("gameDuration",matchDto.get(i).getGameDuration());
			matchMap.put("gameType",matchDto.get(i).getGameType());
			matchMap.put("gameMode",matchDto.get(i).getGameMode());
			matchMap.put("queueId",matchDto.get(i).getQueueId());
			matchMap.put("gameCreation",gameCreationStart);
			matchInfo.add(matchMap);
		}
		mv.addObject("matchInfo",matchInfo);	
		mv.addObject("matchlist",matchlistDto);	
		mv.addObject("summonerinfo",summonerDTO);	
		mv.addObject("profileiconFile",proFileIcon_data);
		mv.addObject("soloRank",soloRank);
		mv.addObject("teamRank",teamRank);
		
		return mv;
	}
}
