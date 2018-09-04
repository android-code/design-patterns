public class Exchange {

	private int amount;
	private int leftAmount;
	private double cours;
	private String operations;
	private Currency start;
	private Currency target;

	public Exchange(int amount, Currency start, Currency target) {
		this.amount = amount;
		this.start = start;
		this.target = target;
		//get cours from outside between currencies start and target
		leftAmount = amount * course;
		operations = "";
	}

	public int getLeftAmount() {
		return leftAmount;
	}

	public void setLeftAmount(int left) {
		this.leftAmount = left;
	}

	public void addOperation(String operation) {
		operations += operation + "\n";
	}

	public String getOperations() {
		return operations;
	}
}