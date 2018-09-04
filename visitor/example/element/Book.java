public class Book implements Product {
	
    private String title;
    private int volume;
    private String description;
    private String author;
    private String isbn;
    private int pages;

    public Book(String title, int volume, String description, String author, String isbn, int pages) {
        this.title = title;
        this.volume = volume;
        this.description = description;
        this.author = author;
        this.isbn = isbn;
        this.pages = pages;
    }

    //the only change
    @Override
    public void generateFile(FileGenerator visitor) {
        visitor.createFile(this);
    }

    //getter methods
    //other methods
}