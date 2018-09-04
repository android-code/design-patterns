public class Main {

    public static void main() {
        Builder concreteBuilder = new ConcreteBuilder();
        Director director = new Director(concreteBuilder);
        Product product = director.build();
    }
}
