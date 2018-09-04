public class Game implements Product {
	
    private String title;
    private String description;
    private String producer;
    private long budget;

    public Game(String title, String description, String producer, long budger) {
        this.title = title;
        this.description = description;
        this.producer = producer;
        this.budget = budget;
    }

    //the only change
    @Override
    public void generateFile(FileGenerator visitor) {
        visitor.createFile(this);
    }

    //getter methods
    //other methods
}