public class PoiMap implements PoiFactory {

    //some fields

    @Override
    public Poi createPoi(PoiInfo poiInfo) {
        switch(poiInfo.getType()) {
            case MUSEUM:
                return new Museum(poiInfo);
            case SHOPPING:
                return new Shopping(poiInfo);
            case RESTAURANT:
                return new Restaurant(poiInfo);
            default:
                return new DefaultPoi(poiInfo);
        }
    }

    //some methods
}