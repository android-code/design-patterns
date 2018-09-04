public class Auctions implements Observer {

    private List<Auction> auctions;
    //other fields

    public Auction(List<Auction> auctions) {
    this.auctions = auctions;
    }

    @Override
    public void update(Observable observable, Object args) {
        if(observable instanceof AuctionManager) {
            if(args instanceof Auction) {
                Auction auction = (Auction) args;
                auctions.add(auction);
                //refresh UI list
            }
            else if(args == instanceof Bid) {
                Bid bid = (Bid) args;
                int auctionIndex = auctions.indexOf(bid.getAuction());
                if(auctionIndex != -1) {
                    auctions.get(auctionIndex).addBid(bid);
                    //refresh UI list
                }
            }
        }
    }

    //other methods
}