package State.deliveryApp.States;

import State.deliveryApp.Package;

public interface PackageState {
    void next(Package pkg);
    void previous(Package pkg);
    void printStatus();
}
