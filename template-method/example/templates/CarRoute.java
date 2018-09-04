public class CarRoute extends RouteFinder {

    @Override
    protected List<Marker> getTrackPoints(Marker start, Marker destination) {
        List<Marker> markers = new ArrayList();
        //find possible roads
        //add track all track points from the road
        return markers;
    }

    @Override
    protected List<Tip> getRouteTips(List<Marker> trackPoints) {
        List<Tip> tips = new ArrayList();
        //add tips for every crossing
        return tips;
    }
}