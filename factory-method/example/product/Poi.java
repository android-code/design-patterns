public abstract class Poi {

    PoiInfo poiInfo;

    public Poi(PoiInfo poiInfo) {
        this.poiInfo = poiInfo;
    }

    public String getName() {
        return poiInfo.getName();
    }

    public Coordinates getCoordinates() {
        return poiInfo.getCoordinates();
    }

    public abstract Icon getIcon();
    public abstract void showCardInfo();
}
