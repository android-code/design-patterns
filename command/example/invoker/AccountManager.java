public class AccountManager {

    private List<Order> orders = new ArrayList<>();

    public void takeOrder(Order order) {
    	//authorize
    	//if authorization success then execue order
    	order.execute();
    }

    public void takeOrders() {
    	//authorize
    	//if authorization success then execue orders
        for(Order order : orders) 
    		order.execute();
    }

    public void addOrder(Order order) {
    	orders.add(order);
    }

    public void clearOrders() {
    	orders.clear();
    }
}