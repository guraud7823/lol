package movie.lol.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.annotation.Resource;

import org.codehaus.jackson.map.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import movie.common.bean.ChampionInfo;
import movie.common.bean.Champion_data;
import movie.common.function.ConvertToJson;
import movie.common.function.MakeUrl;
import movie.common.function.MapperStatic;
import movie.sample.service.SampleService;

@Controller
public class SampleController {
	Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Resource(name="SampleService")// resource 어노테이션통해 빈을 수동등록(serive 어노테이션에 접근을위해)
	private SampleService sampleService;
	
	@RequestMapping(value="/lol/main.do")//해당주소
	public ModelAndView openMain(Map<String, Object> commandMap) throws Exception{
		ModelAndView mv = new ModelAndView("lol/main");//실행될 jsp파일
		
		MakeUrl makeUrl = new MakeUrl();
		ConvertToJson convertToJson = new ConvertToJson();
		ObjectMapper mapper = new ObjectMapper();
		String championRotationInfo = null;
		
		championRotationInfo = convertToJson.convertJson((makeUrl.ChampionRotation()));
		ChampionInfo championInfo = mapper.readValue(championRotationInfo, ChampionInfo.class);
		
		ArrayList<String> freeChampName = new ArrayList<String>();
		ArrayList<String> freeChampKey = new ArrayList<String>();
		ArrayList<String> freeChampImg = new ArrayList<String>();
		ArrayList<String> freeNewChampName = new ArrayList<String>();
		ArrayList<String> freeNewChampKey = new ArrayList<String>();
		ArrayList<String> freeNewChampImg = new ArrayList<String>();

		//로테이션
		Iterator<Integer> freeItr = championInfo.getFreeChampionIds().iterator();
		while(freeItr.hasNext()) {
			String champNm = MapperStatic.getChampionFull().getKeys().get((Integer.toString(freeItr.next())));
			Champion_data champion_data = MapperStatic.getChampionFull().getData().get(champNm);
			
		  freeChampName.add((champion_data.getName()));
		  freeChampKey.add((champion_data.getKey()));
		  freeChampImg.add((champion_data.getImage().getFull()));
		}
		
		//신규유저를 위한 로테이션
		freeItr = championInfo.getFreeChampionIdsForNewPlayers().iterator();
		while(freeItr.hasNext()) {
			String champNm = MapperStatic.getChampionFull().getKeys().get((Integer.toString(freeItr.next())));
			Champion_data champion_data = MapperStatic.getChampionFull().getData().get(champNm);
			
			freeNewChampName.add((champion_data.getName()));
			freeNewChampKey.add((champion_data.getKey()));
			freeNewChampImg.add((champion_data.getImage().getFull()));
		 
		}
		
		//List<Map<String, Object>> list = sampleService.selectBoardList(commandMap);
		//mv.addObject("list",list);
		mv.addObject("freeNewChampName",freeNewChampName);
		mv.addObject("freeNewChampKey",freeNewChampKey);
		mv.addObject("freeNewChampImg",freeNewChampImg);
		mv.addObject("freeChampName",freeChampName);
		mv.addObject("freeChampKey",freeChampKey);
		mv.addObject("freeChampImg",freeChampImg);
		return mv;
	}
}
