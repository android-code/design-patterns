public class Main {
	
	public static void main() {
	ActionHouse house = new ActionHouse();
	Auctions auctions = new Auctions();
	Bids bids = new Bids();

	//register
	house.registerObserver(auctions);
	house.registerBids(bids);

	//new action coming from server and runs ActionHouse
	house.newBid(bidEvent); //update Bids and Auctions modules
	house.newAuction(auctionEvent); //update Auctions module
	}
}