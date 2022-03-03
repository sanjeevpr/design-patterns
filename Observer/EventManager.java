package Observer;

import java.util.Map;
import Observer.listeners.EventListener;
import java.util.HashMap;

public class EventManager {
    private Map<String, EventListener> listeners;

    EventManager() {
        this.listeners = new HashMap<>();
    }

    public void subscribe(String eventType, EventListener eventListener) {
        listeners.put(eventType, eventListener);
    }

    public void unsubscribe(String eventType) {
        listeners.remove(eventType);
    }

    public void notify(String eventType, String data) {
        EventListener eventListener = listeners.get(eventType);
        eventListener.update(data);
    }
}
