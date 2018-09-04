public class Map {

	//some fields
	
	public static Marker getMarker(Coordinates coordinates) {
		//get marker from Map data
		return new Marker("Name", "description", new Coordinates(52.409538, 16.931993), Type.CAR);
	}

	//other methods
}