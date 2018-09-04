public class Network {

	private String operation;
	//other fields

	public void setOperation(String operation) {
		this.operation = operation;
	}

	public void send(String data) {
		//send data with operation type
	}

	public List<Task> getTasks() {
		List<Task> tasks = new ArrayList();
		//get tasks from server
		return tasks;
	}

	//other methods
}