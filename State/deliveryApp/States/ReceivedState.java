package State.deliveryApp.States;

import State.deliveryApp.Package;

public class ReceivedState implements PackageState {

    @Override
    public void next(Package pkg) {
        System.out.println("This package is already delivered to the client.");
    }

    @Override
    public void previous(Package pkg) {
        pkg.setState(new DeliveredState());
    }

    @Override
    public void printStatus() {
        System.out.println("This package has been received by the client.");
    }
    
}
