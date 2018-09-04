public class Facade {

    private Element1 element1;
    private Element2 element2;

    public Facade() {
        element1 = new Element1();
        element2 = new Element2();
    }

    public void operation1(Action action) {
        if(action == Action.INCREASE)
            element1.increase();
        else if(action == Action.DECREASE)
            element1.decrease();
        else if(action == Action.DOUBLE)
            element1.makeDouble();
        else
        element2.restart();
    }

    public void operation2() {
        if(Utils.isAccessProvided()) {
            element2.startAction(element1.getState());
            element1.refreshState();
        }
        else
            Utils.printError();
    }
}
