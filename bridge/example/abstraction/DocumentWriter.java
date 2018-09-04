public class DocumentWriter implements Writer {

    private StorageManager storageManager;

    public DocumentWriter(StorageManager storageManager) {
        this.storageManager = storageManager;
    }

    @Override
    public void openDocument(String name) {
        storageManager.readFile(path);
    }

    @Override
    public void closeDocument() {
        //if is save checked then save file
        storageManager.writeFile(content);
        showEditor(false);
    }

    @Override
    public void createDocument(String name) {
        storageManager.writeFile(name, "");
        showEditor(true);
    }

    @Override
    public void deleteDocument(String name) {
        storageManager.deleteFile(name);
    }

    @Override
    public void showDocuments() {
        File[] files = storageManager.readFolder();
        //draw files list with specific theme
    }

    @Override
    public void showEditor(boolean isShowed) {
        if(isShowed) {
            //draw editor with specific theme
        }
        else {
            //just close editor
        }
    }
}