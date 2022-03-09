package Builder.CarApp.Director;

import Builder.CarApp.Builder.Builder;
import Builder.CarApp.Products.CarType;

public class Director {
    public void constructSportsCar(Builder builder) {
        builder.setCarType(CarType.SPORTS_CAR);
        builder.setSeats(2);
        builder.setEngine("v8 Engine");
        builder.setTripComputer("Cool computer");
        builder.setGPS("Best GPS");
    }

    public void constructCityCar(Builder builder) {
        builder.setCarType(CarType.CITY_CAR);
        builder.setSeats(4);
        builder.setEngine("4 Cylinder Engine");
        builder.setTripComputer("Basic computer");
        builder.setGPS("Basic GPS");
    }

    public void constructSUV(Builder builder) {
        builder.setCarType(CarType.SUV);
        builder.setSeats(7);
        builder.setEngine("Big Engine");
        builder.setTripComputer("Awesome computer");
        builder.setGPS("Awesome GPS");
    }
}
