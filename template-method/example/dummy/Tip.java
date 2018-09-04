public class Tip {

	private String description;
	private Date time;
	private int distance;
	//other fields

	public Tip(String description, Date time, int distance) {
		this.description = description;
		this.time = time;
		this.distance = distance;
	}

	public String getDescription() {
		return description;
	}

	public Date getStartTime() {
		return time;
	}

	public int getDistance() {
		return distance;
	}

	//other methods
}