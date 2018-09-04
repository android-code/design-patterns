public class PoiNightMap implements PoiFactory {

    //some fields

    @Override
    public Poi createPoi(PoiInfo poiInfo) {
        switch(poiInfo.getType()) {
            case MUSEUM:
                return new MuseumDark(poiInfo);
            case SHOPPING:
                return new ShoppingDark(poiInfo);
            case RESTAURANT:
                return new RestaurantDark(poiInfo);
            default:
                return new DefaultPoi(poiInfo);
        }
    }

    //some methods
}