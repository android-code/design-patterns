public abstract class RouteFinder {

    private Route route = new Route();

    public Route find(Coordinates start, Coordinates destination) {
        route = new Route();
        Marker startPoint = Map.getMarker(start);
        Marker endPoint = Map.getMarker(destination);

        logSearching("Search trace: " + start.toString() + " - " + destination.toString());

        saveSearch(startPoint);
        saveSearch(destinationPoint);

        List<Marker> trackPoints = getTrackPoints(startPoint, destinationPoint);
        if(trackPoints.size() > 2) {
            List<Tip> tips = getRouteTips(trackPoints);
            route.setTrackPoints(trackPoints);  
            route.setTips(tips);
            return true;
        }
        else return false;
    }

    public Route getRoute() {
        return route;
    }

    protected abstract List<Marker> getTrackPoints(Marker start, Marker destination);
    protected abstract List<Tip> getRouteTips(List<Marker> trackPoints);

    protected void saveSearch(Marker point) {
        //add search to local memory to improve search suggestions
    }

    protected void logSearching(String text) {
    	Logger.log(text);
    }

    //some others operations
}