public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public Product build() {
        builder.buildPart1();
        builder.buildPart2();
        return builder.getProduct();
    }
}
