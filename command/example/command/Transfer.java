public class Transfer implements Order {

    private OrderManager manager;
    private String recipient, title;
    private int amount;

    public Transfer(OrderManager manager, String recipient, int amount, String title) {
        this.manager = manager;
    }

    @Override
    public void execute() {
        manager.transferMoney(recipient, amount, title);
    }
}