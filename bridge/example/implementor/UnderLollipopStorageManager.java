public class UnderLollipopStorageManager implements StorageManager {

    private String currentFile;
    private String folderPath = "/path/to/underlollipop/folder"; //get path in specific way

    @Override
    public void readFile(String name) {
        //just open file
        currentFile = name;
    }

    @Override
    public File[] readFolder(String name) {
        File folder = new File(name);
        return folder.listFiles;
    }

    @Override
    public void writeFile(String name, String content) {
        //just write file with content
    }

    @Override
    public void writeFile(String content) {
        //just write content to current file
    }

    @Override
    public void deleteFile(String name) {
        File file = new File(name);
        file.delete();
    }
}