public class CompleteProduct {

    private AbstractProduct1 product1;
    private AbstractProduct2 product2;

    public CompleteProduct(AbstractFactory factory) {
        product1 = factory.createProduct1();
        product2 = factory.createProduct2();
    }

    //other methods
}