public class Route {

	private List<Marker> markers;
	private List<Tip> tips;
	//other fields

	public Route() {
		markers = new ArrayList();
		tips = new ArrayList();
	}

	public void setMarkers(List<Marker> markers) {
		this.markers = markers;
	}

	public void setTips(List<Tip> tips) {
		this.tips = tips;
	}

	public List<Marker> getMarkers() {
		return markers;
	}

	public List<Tip> getTips() {
		return tips;
	}

	//other methods
}