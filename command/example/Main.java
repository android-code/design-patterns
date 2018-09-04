public class Main {

	public static void main() {
		//user navigate to account's orders view
		AccountManager accountManager = new AccountManager();
		OrderManager orderManager = new OrderManager();

		//user create and execute single order
		accountManager.takeOrder(new Loan(orderManager, 10000, 90)); //authorize and execute

		//user decided to create orders and authorizate all of them once
		accountManager.addOrder(new Transfer(orderManager, "12 3456 7890", 500, "For trip"));
		accountManager.addOrder(new Transfer(orderManager, "30 4050 6070", 500, "Auction nr 987"));
		accountManager.addOrder(new StandingOrder(orderManager, "11 2222 3333", 80, "Netflix"));

		//authorize and take all orders
		accountManager.takeOrders();
	}
}