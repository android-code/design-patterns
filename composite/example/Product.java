public class Product implements Item {

    private String name;
    private Status status;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
        this.status = Status.MAGAZINE;
    }

    @Override
    public String getInfo() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void changeStatus(Status status) {
        this.status = status;
    }
}