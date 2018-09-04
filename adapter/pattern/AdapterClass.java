public class AdapterClass extends Adaptee implements Client {

    @Override
    public void operation1() {
        method1();
    }

    @Override
    public void operation2() {
        method2();
    }
}