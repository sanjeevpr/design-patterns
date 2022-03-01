package State.deliveryApp.States;

import State.deliveryApp.Package;

public class OrderedState implements PackageState {

    @Override
    public void next(Package pkg) {
        pkg.setState(new DeliveredState());
    }

    @Override
    public void previous(Package pkg) {
        System.out.println("Package is already in it's root state");
    }

    @Override
    public void printStatus() {
        System.out.println("Package ordered, not delivered to the recepient yet.");
    }
    
}
