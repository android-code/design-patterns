public class Main {
    
    public static void main() {
        //check conditions and decide
        StorageManager storageManager = new LollipopStorageManager();
        Writer writer = new DocumentWriter(storageManager);

        //do some actions
        writer.showDocuments();
        writer.openDocumnet("Document1");
        writer.closeDocument();

        //choosen abstraction has changed
        writer = new SheetWriter(storageManager);
        //do some actions
    }
}