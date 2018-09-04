public class Marker {

	private String name;
	private String description;
	private Coordinates coordinates;
	private Type type;
	//other fields

	public Marker(String name, String description, Coordinates coordinates, Type type) {
		this.name = name;
		this.description = description;
		this.coordinates = coordinates;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public Coordinates getCoordinates() {
		return coordinates;
	}

	public Type getType() {
		return type;
	}

	public String toString() {
		return "Marker\n name: " + name + "\n" + "description: " + description + "\n"
		+ "coordinates: " + coordinates.getLatitude() + ", " + coordinates.getLongitude() + "\n"
		+ "type: " + type.toString();
	}

	//other methods

	public enum Type {

		WALK(1),
		CAR(2),
		PUBLIC_TRANSPORT(3),
		TRUCK(4);
		//more types

		private int type;

		public Type(int type) {
			this.type = type;
		}

		public String toString() {
			switch(type) {
				case WALK:
					return "WALK";
				case CAR:
					return "CAR";
				case PUBLIC_TRANSPORT:
					return "PUBLIC_TRANSPORT";
				case TRUCK:
					return "TRUCK";
				default:
					return "UNKNOWN";
			}
		}
	}
}