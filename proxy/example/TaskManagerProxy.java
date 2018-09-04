public class TaskManagerProxy implements TaskManager {

    @Override
    public List<Task> getTasks() {
    	if(isNetworkActive()) {
            init();
            return taskManager.getTasks();
    	}
    	else {
            //try to get the last saved task list from cache
            List<Task> tasks = getTaskFromCache();
            if(tasks.isEmpty()) {
                //show message about any tasks available
            }
            else {
                //show message about no internet connection, so tasks are not up to date
            }
            return tasks;
        }
    }

    @Override
    public void addTask(Task task) {
        if(isNetworkActive()) {
            if(isAccessProvided()) {
                init();
                taskManager.addTask(task);
            }
            else {
            	//show message about user authorization
            	addTaskToCache(task);
            }
        }
        else {
            //show message about no internet connection
            addTaskToCache(task);
        }
    }

    @Override
    public void deleteTask(Task task) {
        if(isNetworkActive()) {
            if(isAccessProvided()) {
                init();
                taskManager.deleteTask(task);
            }
            else {
                //show message about user authorization
                deleteTaskFromCache(task);
            }
        }
        else {
            //show message about no internet connection
            deleteTaskFromCache(task);
        }
    }

    private boolean isNetworkActive() {
        //check network connection state
        return true; //mock
    }

    private boolean isAccessProvided() {
    	//check is user authorized
    	return true; //mock
    }

    private void init() {
    	if(taskManager == null)
    	    taskManager = new TaskManager();
    }

    private List<Task> getTaskFromCache() {
    	List<Task> tasks = new ArrayList();
    	//get tasks from Cache
    	return tasks;
    }

    private void addTaskToCache(Task task) {
    	//add task to Cache
    	//add task to "resend list" in Cache
    }

    private void deleteTaskFromCache(Task task) {
    	//delete task from Cache
    	//add task to "deleted list" in Cache
    }
}