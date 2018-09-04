public class Colleague1 implements Colleague {

    public Colleague1(Mediator mediator) {
        super(mediator);
        this.mediator.register(this);
    }

    @Override 
    public void receive(Object args) {
        if(args instanceof String) {
            //do action
        }
        else if(args instanceof Integer) {
            //do action
        }
        else {
            //do action
        }
    }

    public void setText(String text) {
        //do something inside class with text
        mediator.send(this, text);
    } 

    //other methods
}