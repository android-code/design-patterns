interface Shopping {

    double calculatePrice(List<Product> products);
    boolean checkAvailability(Product product);
    Currency getCurrency();
}