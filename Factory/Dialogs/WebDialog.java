package Factory.Dialogs;

import Factory.Button.Button;
import Factory.Button.WebButton;

public class WebDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WebButton();
    }
    
}
