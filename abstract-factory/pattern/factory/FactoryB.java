public class FactoryB extend AbstractFactory {

    @Override
    public AbstractProduct1 createProduct1(Product1Type type) {
        //set args to constructor based on type
        if(type == Product1Type.SMALL)
            return new Product1B("SMALL");
        else
            return new Product1B();
    }

    @Override
    public AbstractProduct2 createProduct2(Product2Type type) {
        //ignore args for this type
        return new Product2B();
    }
}