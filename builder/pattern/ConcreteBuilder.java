public class ConcreteBuilder extends Builder {

    public void buildPart1() {
        product.setPart1("oval");
    }

    public void buildPart2() {
        product.setPart2("green");
    }
}
