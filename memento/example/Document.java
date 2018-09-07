public class Document {

    private String text;
    private String name;
    private long timestamp;

    public Answer(String name) {
        this.name = name;
        this.text = "";
        this.timestamp = System.currentTimeMillis();
    }

    public void setText(String text) {
        this.text = text;
        this.timestamp = System.currentTimeMillis();
    }

    public void setName(String name) {
        this.name = name;
        this.timestamp = System.currentTimeMillis();
    }

    public Memento save() {
        return new Memento(name, text, timestamp);
    }

    public void restore(Memento memento) {
        this.name = memento.name;
        this.text = memento.text;
        this.timestamp = memento.timestamp;
    }

    class Memento {

        private String name;
        private String text;
        private long timestamp;

        public Memento(String name, String text, long timestamp) {
            this.name = name;
            this.text = text;
            this.timestamp = timestamp;
        }

        public String getText() {
            return text;
        }

        public int getOption() {
            return option;
        }
    }
}