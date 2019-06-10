package movie.common.bean;

public class RunesReforged {
	private int id;
	private String key = new String();
	private String icon = new String();
	private String name = new String();
	private Object slots = new Object();
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Object getSlots() {
		return slots;
	}
	public void setSlots(Object slots) {
		this.slots = slots;
	}
}
