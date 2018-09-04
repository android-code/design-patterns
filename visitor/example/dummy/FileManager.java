public class FileManager {

	//some fields

	public static void write(String fileName, String content) {
		try {
			File file = new File(fileName);
			FileWriter fileWriter = new FileWriter(file);
			fileWriter.write(content);
			fileWriter.flush();
			fileWriter.close();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}

	//other methods
}