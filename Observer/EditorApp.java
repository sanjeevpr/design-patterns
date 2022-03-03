package Observer;

import Observer.listeners.EmailAlertsListener;
import Observer.listeners.EventListener;
import Observer.listeners.LoggingListener;

public class EditorApp {
    public static void main(String[] args) {
        Editor editor = new Editor();
        
        EventListener logger = new LoggingListener("/path/to/file.txt", "Someone has opened the file");
        editor.eventManager.subscribe("open", logger);

        EventListener emailAlerts = new EmailAlertsListener("admin@test.com", "Someone has saved the file");
        editor.eventManager.subscribe("save", emailAlerts);

        editor.openFile("/path/to/file.txt");
    }
}