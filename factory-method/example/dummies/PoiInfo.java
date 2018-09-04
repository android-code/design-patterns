public class PoiInfo {

    private Type type;
    private Coordinates coordinates;
    private String name;

    //other fields like description, image etc

    public Type getType() {
        return type;
    }

    //some methods

    public enum Type {

        MUSEUM(1),
        SHOPPING(2),
        RESTAURANT(3);
        //more types

        private int type;

        public Type(int type) {
            this.type = type;
        }
    }
}
