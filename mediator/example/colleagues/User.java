public class User implements Colleague {

    private String name;
    //other fields

    public User(String name, Mediator mediator) {
        super(mediator);
        this.mediator.register(this);
        this.name = name;
    }

    @Override
    public void receive(Message message) {
        if(message.getFile() != null) {
            //show file
        }
        else {
            //show text message
        }
    }

    public void getName() {
        return name;
    }

    //other methods
}