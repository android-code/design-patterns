public class Decorator1 extends Decorator {

    public Decorator1(Component component) {
        super(component);
    }

    @Override
    public String getName() {
        return component.getName() + " + Decorator1";
    }

    @Override
    public int getValue() {
        return component.getValue() + 5;
    }
}
