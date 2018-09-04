public class PublicTransportRoute extends RouteFinder {

    @Override
    protected List<Marker> getTrackPoints(Marker start, Marker destination) {
        List<Marker> markers = new ArrayList();
        //find the nereast station to start Marker and the nearest station to destination
        //connect with public transport providers to get possible routes between stations
        //add walk or car track points between start Marker and start station
        //add stations to track points
        //add walk or car track points between end station and destination Marker
        //add trackpoints from start to nerest station
        return markers;
    }

    @Override
    protected List<Tip> getRouteTips(List<Marker> trackPoints) {
        List<Tip> tips = new ArrayList();
        //connect with public transport providers to get schedule
        //add tips for every station
        return tips;
    }

    @Override
    protected void logSearching(String text) {
        super.logSearching(text);
        //and send analytics data to public transport providers
    }

    @Override
    protected void saveSearch(Marker point) {
        //do not save public transport searching
    }
}