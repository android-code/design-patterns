public class Loan implements Order {

    private OrderManager manager;
    private int amount, repaymentDays;

    public Loan(OrderManager manager, int amount, repaymentDays) {
        this.manager = manager;
    }
    
    @Override
    public void execute() {
        manager.takeLoan(amount, repaymentDays);
    }
}