public class Message {

    private String text;
    private String recipient;
    private Date date;
    private File file;

    public Message(String text) {
        this.text = text;
        this.recipient = "all";
        date = getDate();
    }

    public Message(String text, String recipient) {
        this.text = text;
        this.recipient = recipient;
        date = new Date();
    }

    public Message(String text, String recipient, File file) {
        this(text, recipient);
        this.file = file;
    }

    public String getText() {
        return text;
    }

    public String getRecipient() {
        return recipient;
    }

    public Date getDate() {
        return date;
    }

    public File getFile() {
        return file;
    }
}