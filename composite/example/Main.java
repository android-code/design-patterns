public class Main {

	public static void main() {
		//workers colect the order
		//small items in bag
		Box bag = new Box("Bag");
		Item item1 = new Item("Bulb", 10.0);
		Item item2 = new Item("Towel", 5.00);
		bag.addItem(item1);
		bag.addItem(item2);

		//fragile products in box
		Box box = new Box("Box");
		Item item3 = new Item("Wine glass", 8.00);
		Item item4 = new Item("Wine glass", 8.00);
		Item item5 = new Item("Jug", 13.00);
		box.addItem(item3);
		box.addItem(item4);
		box.addItem(item5);

		//small and fragile items moved to deliver zone
		bag.changeSector("A1");
		bag.changeStatus(Status.READY);
		box.changeSector("B2");
		box.changeStatus(Status.READY);

		//client canceled one item
		box.removeItem(item4);

		//order is ready to deliver
		//workers get boxes from sectors
		String bagSector = bag.getSector();
		String boxSector = box.getSector();
		Box container = new Box("Container");
		container.addItem(bag);
		container.addItem(box);

		//prepare recipe
		String orderInfo = container.getInfo();
		double orderPrice = container.getPrice();

		//deliver order to client
		container.changeStatus(Status.DELIVER);
	}
}