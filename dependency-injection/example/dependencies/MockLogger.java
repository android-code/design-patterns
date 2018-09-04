public class MockLogger implements Logger {

    @Override
    public void logState(AppState appState) {
    	Console.log(appState.toString());
    }

    @Override
    public void logClickEvent(ClickEvent clickEvent) {
    	Console.log(clickEvent.toString());
    }

    @Override
    public void logError(Error error) {
    	Console.log(error.toString());
    }
}