public class Invoker {

    //could be list of commands to provide additional history control if needed
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void start(Command command) {
        command.execute();
    }
}