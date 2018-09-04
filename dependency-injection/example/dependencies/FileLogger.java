public class FileLogger implements Logger {

    @Override
    public void logState(AppState appState) {
    	FileManager.write(appState);
    }

    @Override
    public void logClickEvent(ClickEvent clickEvent) {
    	FileManager.write(clickEvent);
    }

    @Override
    public void logError(Error error) {
    	FileManager.write(error);
    }
}