package movie.common.bean;

import java.util.HashMap;

public class Champion {
	private String type = new String();
	private String format = new String();
	private String version = new String();
	private HashMap<String, Champion_data> data = new HashMap<String, Champion_data>();
	private HashMap<String, String> keys = new HashMap<String, String>();
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getFormat() {
		return format;
	}
	public void setFormat(String format) {
		this.format = format;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public HashMap<String, Champion_data> getData() {
		return data;
	}
	public void setData(HashMap<String, Champion_data> data) {
		this.data = data;
	}
	public HashMap<String, String> getKeys() {
		return keys;
	}
	public void setKeys(HashMap<String, String> keys) {
		this.keys = keys;
	}
}
