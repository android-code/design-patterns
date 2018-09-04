public class Details {

    private Type type;
    private Texture texture;
    private String data;

    public Details(Type type) {
        this.type = type;
        loadTexture();
        loadData();
        this.texture = texture;
        this.data = data;
    }

    private void loadTexture() {
        //load texture based on the type
    }

    private void loadData() {
        //load additional data based on the type
    }

    //some methods
}