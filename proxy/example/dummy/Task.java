public class Task {

	private String name;
	private String description;
	private Priority priority;
	//other fields

	public Task(String name, String description, Priority priority) {
		this.name = name;
		this.description = description;
		this.priority = priority;
	}

	public String toJson() {
		StringBuilder builder = new StringBuilder();
		builder.append("{'name':").append(name);
		builder.append("'description':").append(description);
		builder.append("'priority':").append(priority).append("}");
		return builder.toString();
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public Priority getPriority() {
		return priority;
	}

	//other methods

	public enum Priority {

		LOW(0),
		NORMAL(1),
		HIGH(2);

		int priority;

		public Priority(int priority) {
			this.priority = priority;
		}
	}
}