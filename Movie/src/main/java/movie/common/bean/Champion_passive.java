package movie.common.bean;

public class Champion_passive {
	private String name = new String();
	private String description = new String();
	private Champion_image image = new Champion_image();
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Champion_image getImage() {
		return image;
	}
	public void setImage(Champion_image image) {
		this.image = image;
	}
}
