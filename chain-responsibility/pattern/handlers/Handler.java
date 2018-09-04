public abstract class Handler {

    protected Handler successor;
    //some fields

    protected abstract void action(Request request);
    protected abstract boolean canExecute(Request request);

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public void handle(Request request) {
        if(canExecute(request))
            action(request);
        else if(successor != null)
            successor.handle(request);
    }

    //some other methods
}