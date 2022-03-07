package Factory.Dialogs;

import Factory.Button.Button;

public abstract class Dialog {
    public void render() {
        Button button = createButton();
        button.onClick();
        button.render();
    }

    public abstract Button createButton();
    
}
