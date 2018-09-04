public class Admin implements Colleague {

    public User(Mediator mediator) {
        super(mediator);
        this.mediator.registerAdmin(this);
    }

    @Override
    public void receive(Message message) {
        //show message
        //log
    }

    //other methods
}
