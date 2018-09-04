public class Box implements Item {

    private String name;
    private String sector;
    private Status status;
    private List<Item> items;

    public Box(String name) {
        this.name = name;
        this.sector = "main";
        this.status = Status.MAGAZINE;
        this.items = new ArrayList();
    }

    @Override
    public String getInfo() {
        String info = name + " contains: ";
        for(Item item : items)
            info = info + item.getInfo() + "\n";
        return info;
    }

    @Override
    public double getPrice() {
        double price = 0;
        for(Item item : items)
            price += item.getPrice();
        return price;
    }

    @Override
    public void changeStatus(Status status) {
        this.status = status;
        for(Item item : items)
            item.changeStatus(status);
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        item.changeStatus(Status.MAGAZINE);
        items.remove(item);
    }

    public void changeSector(String sector) {
        this.sector = sector;
    }

    public String getSector() {
        return sector;
    }
}