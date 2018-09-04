public class ExternalMessageProtocol {

	public void sendString(String text) {
		//implementation
	}

	public void sendBytes(byte[] bytes) {
		//implementation
	}

	public byte[] getBytes(File file) {
		return Files.readAllBytes(file.toPath());
	}

	//other methods
}