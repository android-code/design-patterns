public class MessageProtocolAdapter implements IMessageProtocol {

    private ExternalMessageProtocol protocol = new ExternalMessageProtocol();

    public MessageProtocolAdapter() {
        this.protocol = new ExternalMessageProtocol();
    }

    @Override
    public void sendText(String text) {
        Analytics.report("Message");
        protocol.sendString(text);
    }

    @Override
    public void sendFile(File file) {
        Analytics.report("File");
        protocol.sendBytes(protocol.getBytes(file));
    }
}