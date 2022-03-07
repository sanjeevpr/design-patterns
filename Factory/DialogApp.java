package Factory;

import Factory.Dialogs.Dialog;
import Factory.Dialogs.WebDialog;
import Factory.Dialogs.WindowsDialog;

public class DialogApp {
    public static void main(String[] args) {
        Dialog windowsDialog = new WindowsDialog();
        windowsDialog.render();

        Dialog webDialog = new WebDialog();
        webDialog.render();

    }
}