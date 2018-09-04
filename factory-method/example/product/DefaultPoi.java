public class DefaultPoi extends Poi {

    @Override
    public Icon getIcon() {
        return new Icon("DefaultPoi.svg");
    }

    @Override
    public void showCardInfo() {
        //generate card info for Default based on PoiInfo
    }
}
