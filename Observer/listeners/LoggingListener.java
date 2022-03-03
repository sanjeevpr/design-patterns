package Observer.listeners;

public class LoggingListener implements EventListener {

    private String logFileName;
    private String message;

    public LoggingListener(String logFileName, String message) {
        this.logFileName = logFileName;
        this.message = message;
    }

    @Override
    public void update(String fileName) {
        this.logFileName = fileName;
        System.out.println("Updated " + fileName + " from LoggingListener");
    }
    
}
