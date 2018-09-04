public enum Size {

    S(1),
    M(2),
    L(3),
    XL(4);

    private int size;

    public Size(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        switch(size) {
            case 1:
                return "S";
            case 2:
                return "M";
            case 3:
                return "L";
            case 4:
                return "XL";
            default:
                return "CUSTOM";
        }
    }
}
