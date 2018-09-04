public class AmericaShopping implements Shopping {

    private final double USD_RATE = 0.75;
    private final double CUSTOMS_DUTY = 1.1;
    private final double CUSTOMS_DUTY_NORMAL = 1.5;

    @Override
    public double calculatePrice(List<Product> products) {
        double totalPrice = 0;
        double deliveryCost = 10;
        for(Product product : products) {
            if(product.getSize == Size.NORMAL) {
                totalPrice += product.getPrice() * CUSTOMS_DUTY_NORMAL;
                deliveryCost += 5;
            }
            else {
                totalPrice += product.getPrice() * CUSTOMS_DUTY;
                deliveryCost += 2;
            }
        }
        return (totalPrice + deliveryCost) * USD_RATE;
    }

    @Override
    public boolean checkAvailability(Product product) {
        if(product.getSize == Size.BIG)
            return false;
        else
            return true;
    }

    @Override
    public Currency getCurrency {
        return Currency.USD;
    }
}