public class Messenger {

    private IMessageProtocol protocol;

    public Messenger(IMessageProtocol protocol) {
        this.protocol = protocol;
    }

    public void sendMessage(String text) {
        protocol.sendText(text);
    }

    public void sendMessage(File file) {
        protocol.sendFile(file);
    }

    public void changeStatus(String text) {
        //set and show status
    }
}