package movie.lol.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.codehaus.jackson.map.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import movie.common.bean.Champion_data;
import movie.common.bean.Champion_skins;
import movie.common.bean.Champion_spells;
import movie.common.function.MapperStatic;

@Controller
public class getChampionDetailInfoController {
	Logger log = LoggerFactory.getLogger(this.getClass());
	
	@RequestMapping(value="/lol/championinfodetail.do" )//해당주소
	public ModelAndView openChampionDetailInfo(HttpServletRequest request, HttpSession session) throws Exception, IOException{
		ModelAndView mv = new ModelAndView("lol/championinfodetail");//실행될 jsp파일
		String champKey = request.getParameter("championKey");
		ObjectMapper mapper = new ObjectMapper();
		HashMap<String,Object> ChampInfo = new HashMap<String,Object>();
		ArrayList<Champion_skins> ChampSkins = new ArrayList<Champion_skins>();
		ArrayList<HashMap<String,String>> spellVars = new ArrayList<HashMap<String,String>>();
		String champNm = MapperStatic.getChampionFull().getKeys().get(champKey);
			
		Champion_data champion_data = MapperStatic.getChampionFull().getData().get(champNm);
		
		ChampInfo.put("name", champion_data.getName());
		ChampInfo.put("key", champion_data.getKey());
		ChampInfo.put("img", champion_data.getImage().getFull());
		ChampInfo.put("title", champion_data.getTitle());
		ChampInfo.put("info",champion_data.getInfo());
		ChampInfo.put("stats",champion_data.getStats());
		ChampInfo.put("tags",champion_data.getTags());
		ChampInfo.put("id", champion_data.getId());
		
		Iterator<Champion_skins> skinitr = champion_data.getSkins().iterator();
		while(skinitr.hasNext()) {
			ChampSkins.add(skinitr.next());
		}
		
		for(int i=0; i<4 ; i++) {
			HashMap<String, String> varsMap = new HashMap<String,String>();
			spellVars.add(varsMap);
			for(int j=0; j<champion_data.getSpells().get(i).getVars().size(); j++) {
				String varsText = champion_data.getSpells().get(i).getVars().get(j).getCoeff().toString();
				String varsLink = champion_data.getSpells().get(i).getVars().get(j).getLink();
				String varsKey = champion_data.getSpells().get(i).getVars().get(j).getKey();
				if(varsLink.equals("spelldamage")) {varsText = varsText + " AP";}
				else if(varsLink.equals("attackdamage")) {varsText = varsText + " AD";}
				else if(varsLink.equals("bonusattackdamage")) {varsText = varsText + " 추가AD";}
				else if(varsLink.equals("armor")) {varsText = "방어력의" + varsText;}
				else if(varsLink.equals("bonusarmor")) {varsText = "추가방어력의 " + varsText;}
				else if(varsLink.equals("health")) {varsText = "전체체력의 " + varsText;}
				else if(varsLink.equals("bonushealth")) {varsText = "추가체력의 " + varsText;}
				else if(varsLink.equals("bonusspellblock")) {varsText = "추가마법저항력의 " + varsText;}
				else if(varsLink.equals("@text")) {}
				else{}
				spellVars.get(i).put(varsKey, varsText);
			}
		}
		mv.addObject("ChampInfo",ChampInfo);
		mv.addObject("ChampSkins",ChampSkins);
		mv.addObject("ChampStats",champion_data.getStats());
		mv.addObject("Passive",champion_data.getPassive());
		mv.addObject("SpellQ",champion_data.getSpells().get(0));
		mv.addObject("SpellW",champion_data.getSpells().get(1));
		mv.addObject("SpellE",champion_data.getSpells().get(2));
		mv.addObject("SpellR",champion_data.getSpells().get(3));
		mv.addObject("SpellVars",spellVars);
		return mv;
	}
}
