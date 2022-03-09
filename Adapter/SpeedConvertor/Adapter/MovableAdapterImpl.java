package Adapter.SpeedConvertor.Adapter;

import Adapter.SpeedConvertor.Movable.Movable;

public class MovableAdapterImpl implements MovableAdapter {

    // Adaptee
    private Movable movable;

    public MovableAdapterImpl(Movable movable) {
        this.movable = movable;
    }

    @Override
    public double getSpeed() {
        return convertMPHtoKMPH(movable.speed());
    }

    private double convertMPHtoKMPH(double speed) {
        return speed * 1.60934;
    }
    
}
