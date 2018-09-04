public interface Logger {

    void logState(AppState appState);
    void logClickEvent(ClickEvent clickEvent);
    void logError(Error error);
}