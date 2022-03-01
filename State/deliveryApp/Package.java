package State.deliveryApp;

import State.deliveryApp.States.OrderedState;
import State.deliveryApp.States.PackageState;

public class Package {
    private PackageState packageState;

    public Package() {
        this.packageState = new OrderedState();
    }

    public void setState(PackageState packageState) {
        this.packageState = packageState;
    }

    public void previousState() {
        this.packageState.previous(this);
    }

    public void nextState() {
        this.packageState.next(this);
    }

    public void printStatus() {
        this.packageState.printStatus();
    }
}
