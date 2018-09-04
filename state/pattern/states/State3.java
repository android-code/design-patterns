public class State3 implements {

    public void handle(Context context) {
        //do some specific action for State3
        context.action2(false);
        context.setState(new State1());
    }
}