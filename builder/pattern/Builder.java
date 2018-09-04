public abstract class Builder {

    protected Product product;

    public Product getProduct() {
        return product;
    }

    public abstract void buildPart1();
    public abstract void buildPart2();
}
