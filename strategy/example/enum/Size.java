public enum Size {

    SMALL(1),
    NORMAL(2),
    BIG(3);

    private int size;

    public Size(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        switch(size) {
            case 1:
                return "SMALL";
            case 2:
                return "NORMAL";
            case 3:
                return "BIG";
            default:
                return "CUSTOM";
        }
    }
}