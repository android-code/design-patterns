public class NetworkTaskManager implements TaskManager {

    private Network network;

    public NetworkTaskManager() {
        network = new Network();
        //set network server, port, etc
    }

    @Override
    public List<Task> getTasks() {
        //prepare and send request
        network.setOperation("GET");
        return network.getTasks();
    }

    @Override
    public void addTask(Task task) {
        //prepare and send request with
        network.setOperation("POST");
        network.send(task.toJson());
    }

    @Override
    public void deleteTask(Task task) {
        //prepare and send request
        network.setOperation("DELETE");
        network.send(task.toJson());
    }
}