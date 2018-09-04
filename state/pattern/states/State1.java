public class State1 implements {

    public void handle(Context context) {
        //do some specific action for State1
        context.action1();
        context.setState(new State2());
    }
}