public class ProductFactory1 implements ProductFactory {
    
    @Override
    public Product createProduct(Type type) {
        switch(type) {
            case TYPE1:
              return new Product1();
            case TYPE2:
              return new Product2();
            case TYPE3:
              return new Product3();
        }
        throw new IllegalArgumentException("Product type not recognized");
    }
}