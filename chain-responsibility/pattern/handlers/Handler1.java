public class Handler1 extends Handler {

    @Override
    protected void action(Request request) {
        //do specific action for Handler1
    }

    @Override
    protected boolean canExecute(Request request) {
        if(request.getType() == Type.TYPE1)
            return true;
        else
            return false;
    }
}