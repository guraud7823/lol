package movie.common.bean;

import java.util.HashMap;

public class Summoner {
	private String type = new String();
	private String version = new String();
	private HashMap<String, Summoner_data> data = new HashMap<String, Summoner_data>();
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public HashMap<String, Summoner_data> getData() {
		return data;
	}
	public void setData(HashMap<String, Summoner_data> data) {
		this.data = data;
	}
}
