package movie.common.bean;

import java.util.HashMap;

public class ProFileIcon{
	private String type = new String();
	private String version = new String();
	private HashMap<String, ProFileIcon_data> data = new HashMap<String, ProFileIcon_data>();
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
	public HashMap<String, ProFileIcon_data> getData() {
		return data;
	}
	public void setData(HashMap<String, ProFileIcon_data> data) {
		this.data = data;
	}
}


