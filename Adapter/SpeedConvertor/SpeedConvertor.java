package Adapter.SpeedConvertor;

import Adapter.SpeedConvertor.Adapter.MovableAdapter;
import Adapter.SpeedConvertor.Adapter.MovableAdapterImpl;
import Adapter.SpeedConvertor.Movable.BuggatiVeyron;
import Adapter.SpeedConvertor.Movable.Movable;

public class SpeedConvertor {
    public static void main(String[] args) {
        Movable buggatiVeyron = new BuggatiVeyron();
        MovableAdapter buggatiVeyronAdapter = new MovableAdapterImpl(buggatiVeyron);

        System.out.println(buggatiVeyronAdapter.getSpeed());
    }
}
