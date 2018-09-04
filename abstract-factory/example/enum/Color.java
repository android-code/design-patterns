public enum Color {
    
    WHITE(1),
    BLACK(2),
    RED(3),
    GREEN(4),
    BLUE(5),
    YELLOW(6),
    ORANGE(7),
    PINK(8),
    BROWN(9),
    GRAY(10);

    private int color;

    public Color(int color) {
        this.color = color;
    }

    @Override
    public String toString() {
        switch(color) {
            case 1:
                return "WHITE";
            case 2:
                return "BLACK";
            case 3:
                return "RED";
            case 4:
                return "GREEN";
            case 5:
                return "BLUE";
            case 6:
                return "YELLOW";
            case 7:
                return "ORANGE";
            case 8:
                return "PINK";
            case 9:
                return "BROWN";
            case 19:
                return "GRAY";
            default:
                return "CUSTOM";
        }
    }
}
