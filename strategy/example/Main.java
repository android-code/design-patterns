public class Main {

	public static void main() {
		//check world region
		Shopping shopping;
		if(Region.EUROPE)
		    shopping = new EuropeShopping();
		else if(Region.AMERICA)
		    shopping = new AmericaShopping();
		else {
		    //stop shopping or choose another strategy if is possible
		}

		//if delivery not available for products show message  
		Cart cart = new Cart(shopping);
		cart.addProduct(new Product(1, "Ball", 5, Size.NORMAL));  
		cart.addProduct(new Product(2, "Notebook", 100, Size.NORMAL));
		cart.addProduct(new Product(3, "Smartphone", 80, Size.SMALL));
		cart.addProduct(new Product(4, "Desk", 50, Size.LARGE)); //in America this product is not available to deliver

		//check total price at the end
		double totalPrice = cart.getTotalPrice();
		Currency currency = cart.getCurrency();
		//Europe: 192EUR, America: 193,125USD (without Desk)
	}
}