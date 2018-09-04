public class Main {

	public static void main() {
		//login to app as authorized user
		TaskManager taskManager = new TaskManagerProxy();
		List<Task> tasks = taskManager.getTasks();
		//show tasks in UI

		//delete some task
		taskManager.deleteTask(tasks.get(0));

		//prepare task
		Task task = new Task("name", "description", Priority.HIGH);
		//internet connection lost
		taskManager.addTask(task); //task will be add only to cache
	}
}