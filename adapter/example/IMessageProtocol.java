public interface IMessageProtocol {

    void sendText(String text);
    void sendFile(File file);
}