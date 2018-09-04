public class Film implements Product {
	
    private String title;
    private String description;
    private String director;
    private String scenario;
    private List<Actor> actors;
    private int year;

    public Film(String title, String description, String director, String scenario, List<Actor> actors, int year) {
        this.title = title;
        this.description = description;
        this.director = director;
        this.scenario = scenario;
        this.actors = actors;
        this.year = year;
    }

    //the only change
    @Override
    public void generateFile(FileGenerator visitor) {
        visitor.createFile(this);
    }

    //getter methods
    //other methods
}