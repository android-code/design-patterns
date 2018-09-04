public class ComponentWithLogs {

    private Logger logger;

    public ComponentWithLogs(Logger logger) {
    	this.logger = logger;
    }

    public void operation1() {
    	logger.logClickEvent(getClickEvent());
    	try {
    		//do stuff
    		logger.logState(getState());
    	}
    	catch (Exception exception) {
    		logger.logError(getError(exception));
    	}
    }

    //other methods
}