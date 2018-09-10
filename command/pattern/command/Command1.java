public class Command1 implements Command {

    private Receiver receiver;

    public Command1(Receiver receiver) {
        this.receiver = receiver;
    }
    
    @Override
    public void execute() {
        //run specific action by itself or using receiver
        receiver.action1();
    }
}