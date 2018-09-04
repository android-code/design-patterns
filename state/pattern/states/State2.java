public class State2 implements {

    public void handle(Context context) {
        //do some specific action for State2
        context.action2(true);
        context.setState(new State3());
    }
}