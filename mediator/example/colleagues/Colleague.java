public abstract class Colleague {

    protected Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    public void sendMessage(Message message) {
        mediator.send(this, message);
    }

    public abstract void receive(Message message);
}