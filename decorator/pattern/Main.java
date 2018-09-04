public class Main {

    public static void main() {
        Component component;
        component = new Component1();

        //decorating 'product'
        component = new Decorator1(component);
        component = new Decorator2(component);

        component.getName(); //Component1 + Decorator1 + Decorator2;
        component.getValue(); //18
    }
}
