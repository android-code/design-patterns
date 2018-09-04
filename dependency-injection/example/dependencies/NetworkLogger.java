public class NetworkLogger implements Logger {

    @Override
    public void logState(AppState appState) {
    	NetworkManager.send(appState);
    }

    @Override
    public void logClickEvent(ClickEvent clickEvent) {
    	NetworkManager.send(clickEvent);
    }

    @Override
    public void logError(Error error) {
    	NetworkManager.send(error);
    }
}