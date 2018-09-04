public class LollipopStorageManager implements StorageManager {

    private String currentFile;
    private String folderPath = "/path/to/lollipop/folder"; //get path in specific way

    @Override
    public void readFile(String name) {
        //check READ_EXTERNAL_STORAGE permissions
        //if OK, open file
        currentFile = name;
        //else show permissions dialog
    }

    @Override
    public File[] readFolder() {
        //check READ_EXTERNAL_STORAGE permissions
        //if OK, return files List
        File folder = new File(folderPath);
        return folder.listFiles;
        //else show permissions dialog
    }

    @Override
    public void writeFile(String name, String content) {
        //check WRITE_EXTERNAL_STORAGE permissions
        //if OK, write file
        //else show permissions dialog
    }

    @Override
    public void writeFile(String content) {
        //check WRITE_EXTERNAL_STORAGE permissions
        //just write content to current file
        //else show permissions dialog
    }

    @Override
    public void deleteFile(String name) {
        //check WRITE_EXTERNAL_STORAGE permissions
        //if OK, open file
        File file = new File(name);
        file.delete();
        //else show permissions dialog
    }
}