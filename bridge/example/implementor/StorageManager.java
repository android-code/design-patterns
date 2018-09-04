public interface StorageManager {

    void readFile(String name);
    File[] readFolder();
    void writeFile(String name, String content);
    void deleteFile(String name);
}