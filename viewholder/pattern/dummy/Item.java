public class Item {

	private String text;
	private int imageResource;

	public Item(String text, int imageResource) {
		this.text = text;
		this.imageResource = imageResource;
	}

	public String getText() {
		return text;
	}

	public int getImage() {
		return imageResource;
	}
}