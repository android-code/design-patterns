public class Complex {

	private int number;
	private boolean availability;

	public Complex(int number, boolean availability) {
		this.number = number;
		this.availability = availability;
	}

	public int getNumber() {
		return number;
	}

	public boolean getAvailability() {
		return availability;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public void setAvailability(boolean availability) {
		this.availability = availability;
	}
}