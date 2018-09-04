public class AuctionHouse implements Observable {

    private List<Observer> observers;
    //other fields

    public AuctionHouse() {
        observers = new ArrayList();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unregisterObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : observers)
            observer.update(this, null);
    }

    @Override
    public void notifyObservers(Object args) {
        for(Observer observer : observers)
            observer.update(this, args);
    }

    public void newBid(NewBidEvent event) {
        //check event details and add if is OK
        Bid bid = event.getBid();
        notifyObservers(bid);
    }

    public void newAuction(NewAuctionEvent auction) {
        //check event details and add if is OK
        Auction auction = event.getAuction();
        notifyObservers(auction);
    }

    //others methods
}