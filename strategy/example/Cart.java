public class Cart {

    private Shopping shopping;
    private List<Product> products;

    public Context(Shopping shopping) {
        this.shopping = shopping;
        products = new ArrayList();
    }

    public void setShoppingRegion(Shopping shopping) {
        this.shopping = shopping;
    }

    public double getTotalPrice() {
        return shopping.calculatePrice(products);
    }

    public boolean addProduct(Product product) {
        if(shopping.checkAvailability(product)) {
          products.add(product);
          return true;
        }
        else return false;
    }

    public boolean removeProduct(Product product) {
        return products.remove(product);
    }
}