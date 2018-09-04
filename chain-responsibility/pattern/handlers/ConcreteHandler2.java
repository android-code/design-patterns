public class ConcreteHandler2 extends Handler {

    @Override
    protected void action(Request request) {
        //do specific action for ConcreteHandler2
    }

    @Override
    protected boolean canExecute(Request request) {
        if(request.getType() == Type.TYPE2)
            return true;
        else
            return false;
    }
}