public class FactoryA extend AbstractFactory {

    @Override
    public AbstractProduct1 createProduct1(Product1Type type) {
        //set args to constructor based on type
        if(type == Product1Type.BIG)
            return new Product1A("BIG");
        else
            return new Product1A();
    }

    @Override
    public AbstractProduct2 createProduct2(Product2Type type) {
        //set args to constructor based on type
        if(type == Product2Type.CIRCLE)
            return new Product2A("CIRCLE");
        else
            return new Product2A();
    }
}