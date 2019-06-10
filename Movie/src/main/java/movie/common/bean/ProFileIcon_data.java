package movie.common.bean;

public class ProFileIcon_data {
	private int id;
	private ProFileIcon_img image = new ProFileIcon_img();
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public ProFileIcon_img getImage() {
		return image;
	}
	public void setImage(ProFileIcon_img image) {
		this.image = image;
	}
}
