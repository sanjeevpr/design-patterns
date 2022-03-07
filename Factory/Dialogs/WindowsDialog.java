package Factory.Dialogs;

import Factory.Button.Button;
import Factory.Button.WindowsButton;

public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
    
}
