package movie.common.function;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;
import org.springframework.core.io.ClassPathResource;

import movie.common.bean.Champion;
import movie.common.bean.Item;
import movie.common.bean.LeagueEntryDTO;
import movie.common.bean.ProFileIcon;
import movie.common.bean.RunesReforged;
import movie.common.bean.Summoner;

public class MapperStatic {
	private static MapperStatic mapperStatic = new MapperStatic();
	private static Map<String, Object> champion;
	private static Champion championFull;
	private static Item item;
	private static Map<String, Object> language;
	private static Map<String, Object> map;
	private static Map<String, Object> missionAssets;
	private static ProFileIcon profileIcon;
	private static ArrayList<RunesReforged> runesReforged;
	private static Map<String, Object> sticker;
	private static Summoner summoner;
	
	@SuppressWarnings("unchecked")
	private MapperStatic() {
		ObjectMapper mapper = new ObjectMapper();
		try {
			champion = mapper.readValue(new ClassPathResource("json/ko_KR/champion.json").getFile(), Map.class);
			championFull = mapper.readValue(new ClassPathResource("json/ko_KR/championFull.json").getFile(), Champion.class);
			item = mapper.readValue(new ClassPathResource("json/ko_KR/item.json").getFile(), Item.class);
			language = mapper.readValue(new ClassPathResource("json/ko_KR/language.json").getFile(), Map.class);
			map = mapper.readValue(new ClassPathResource("json/ko_KR/map.json").getFile(), Map.class);
			missionAssets = mapper.readValue(new ClassPathResource("json/ko_KR/mission-assets.json").getFile(), Map.class);
			profileIcon = mapper.readValue(new ClassPathResource("json/ko_KR/profileicon.json").getFile(), ProFileIcon.class);
			runesReforged = mapper.readValue(new ClassPathResource("json/ko_KR/runesReforged.json").getFile(), new TypeReference<ArrayList<RunesReforged>>(){});
			sticker = mapper.readValue(new ClassPathResource("json/ko_KR/sticker.json").getFile(), Map.class);
			summoner = mapper.readValue(new ClassPathResource("json/ko_KR/summoner.json").getFile(), Summoner.class);
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public static MapperStatic getMapperStatic() {
		return mapperStatic;
	}

	public static Map<String, Object> getChampion() {
		return champion;
	}

	public static Champion getChampionFull() {
		return championFull;
	}

	public static Item getItem() {
		return item;
	}

	public static Map<String, Object> getLanguage() {
		return language;
	}

	public static Map<String, Object> getMap() {
		return map;
	}

	public static Map<String, Object> getMissionAssets() {
		return missionAssets;
	}

	public static ProFileIcon getProfileIcon() {
		return profileIcon;
	}

	public static ArrayList<RunesReforged> getRunesReforged() {
		return runesReforged;
	}

	public static Map<String, Object> getSticker() {
		return sticker;
	}

	public static Summoner getSummoner() {
		return summoner;
	}
}
