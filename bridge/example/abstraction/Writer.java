public interface Writer {

    void openDocument(String name);
    void closeDocument();
    void createDocument(String name);
    void deleteDocument(String name);
    void showDocuments();
    void showEditor(boolean isShowed);
}