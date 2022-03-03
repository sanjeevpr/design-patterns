package Observer;

public class Editor {
    EventManager eventManager;

    public Editor() {
        this.eventManager = new EventManager();
    }

    public void openFile(String path) {
        System.out.println("Opening file in " + path);
        eventManager.notify("open", path);
    }

    public void saveFile(String path) {
        System.out.println("Saving file in " + path);
        eventManager.notify("save", path);
    }
}
