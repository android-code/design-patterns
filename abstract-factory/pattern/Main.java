public class Main {

    public static void main() {
        //check conditions and choose factory
        AbstractFactory factory = new FactoryA();
        CompleteProduct product = new CompleteProduct(factory);
    }
}
