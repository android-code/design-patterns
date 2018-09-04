public class Bids implements Observer {

    private Auction auction;
    private List<Bid> bids;
    //other fields

    public Bids(Auction auction) {
        this.auction = auction;
        this.bids = auction.getBids();
    }

    @Override
    public void update(Observable observable, Object args) {
        if(observable instanceof AuctionManager) {
            if(args instanceof Bid) {
                Bid bid = (Bid) args;
                if(bid.getAuction() == auction) {
                    bids.add(bid);
                    //refresh UI list
                }
            }
        }
    }

    //other methods
}