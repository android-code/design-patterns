public class StandingOrder implements Order {

    private OrderManager manager;
    private String recipient;
    private int amount, intervalDays;

    public StandingOrder(OrderManager manager, String recipient, int amount, int intervalDays) {
        this.manager = manager;
    }
    
    @Override
    public void execute() {
        manager.scheduleStandingOrder(recipient, amount, intervalDays);
    }
}