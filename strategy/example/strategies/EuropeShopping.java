public class EuropeShopping implements Shopping {

    @Override
    public double calculatePrice(List<Product> products) {
        double totalPrice = 0;
        double deliveryCost = 5;
        for(Product product : products) {
            totalPrice += product.getPrice();
            if(product.getSize() == Size.BIG)
                deliveryCost += 2;
        }
        return totalPrice;
    }

    @Override
    public boolean checkAvailability(Product product) {
        return true;
    }

    @Override
    public Currency getCurrency {
        return Currency.EUR;
    }
}