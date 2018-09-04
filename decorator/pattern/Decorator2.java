public class Decorator2 extends Decorator {

    public Decorator2(Component component) {
        super(component);
    }

    @Override
    public String getName() {
        return component.getName() + " + Decorator2";
    }

    @Override
    public int getValue() {
        return component.getValue() + 3;
    }
}
