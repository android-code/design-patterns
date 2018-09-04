public enum Status {

	MAGAZINE(0),
	READY(1),
	DELIVER(2),
	DELIVERED(3);

	int status;

	public Status(int status) {
		this.status = status;
	}
}