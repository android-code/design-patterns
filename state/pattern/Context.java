public class Context {

    private State state;

    public Context() {
        //set default state
        state = new State1(this);
    }

    public void request() {
        state.handle(this);
    }

    public void action1() {
        //do something specific for action1
    }

    public void action2(boolean enabled) {
        //do something specific for action2
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }
}