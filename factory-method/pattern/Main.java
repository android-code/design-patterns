public class Main {
	
    public static void main() {
        ProductFactory factory = new ProductFactory1();
        Product product1 = factory.createProduct(TYPE1);
        Product product2 = factory.createProduct(TYPE2);
    }
}