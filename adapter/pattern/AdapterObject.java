public class AdapterObject implements Client {
  
    private Adaptee adaptee;

    public Client() {
        this.adaptee = new Adaptee();
        //some parameters can be passed to initialize Adaptee
    }

    @Override
    public void operation1() {
        adaptee.method1();
    }

    @Override
    public void operation2() {
        adaptee.method2();
    }
}