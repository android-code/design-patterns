public class ConcreteMediator implements Mediator {

    private List<Colleague> colleagues;

    public Mediator() {
        this.colleagues = new ArrayList();
    }

    public void register(Colleague colleague) {
        colleagues.add(colleague);
    }

    @Override
    public void send(Colleague colleague, Object args) {
        //find receivers by type, variables or other things depends on way of storing colleagues
        if(colleague instanceof Colleague1) {
            if(args instanceof String)
                notifyAll(Colleague2.class, args);
            else if(args instanceof Integer)
                notifyAll(Colleague3.class args);
        }
        else if(colleague instanceof Colleague2) {
            if(args instanceof String)
                notifyAll(Colleague3.class, args);
            else if(args instanceof Integer)
                notifyAll(Colleague1.class args);
        }
        else if(colleague instanceof Colleague3) {
            notifyAll(Colleague.class, args);
        }
    }

    private void notifyAll(Class type, Object args) {
        for(Colleague colleague : colleagues) {
            if(type.isInstance(colleague))
                colleague.receive(args);
        }
    }
}