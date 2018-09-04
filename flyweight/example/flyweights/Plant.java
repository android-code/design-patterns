public abstract class Plant {
    
    private Point point;
    private Data data; //consume a lot of memory

    public Plant(Point point, Data data) {
        this.point = point;
        this.data = data;
    }

    public abstract void draw();
}