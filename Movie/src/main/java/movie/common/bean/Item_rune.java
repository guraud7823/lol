package movie.common.bean;

public class Item_rune {
	private boolean isrune;
	private int tier;
	private String type = new String();
	public boolean isIsrune() {
		return isrune;
	}
	public void setIsrune(boolean isrune) {
		this.isrune = isrune;
	}
	public int getTier() {
		return tier;
	}
	public void setTier(int tier) {
		this.tier = tier;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
}
