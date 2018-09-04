public class Main {

    public static void main() {
        //get pois info list from server like List<PoiInfo> poisInfo;
        List<Poi> pois = new ArrayList();
        PoiFactory poiFactory = new PoiMap(); //check if is day/night mode
        for(PoiInfo poiInfo : poisInfo) {
            pois.add(poiFactory.createPoi(poiInfo));
            //show poi icon on map
        }

        //when user click on some poi
        itemId = 0; //get itemId from click
        pois.get(itemId).showCardInfo();

        //if user click navigate on the card
        pois.get(itemId).getCoordinates();
    }
}
