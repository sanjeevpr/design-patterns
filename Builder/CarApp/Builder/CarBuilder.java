package Builder.CarApp.Builder;

import Builder.CarApp.Products.Car;
import Builder.CarApp.Products.CarType;

public class CarBuilder implements Builder {
    private int seats;
    private String engine;
    private String tripComputer;
    private String GPS;
    private CarType carType;

    @Override
    public void setSeats(int seats) {
        this.setSeats(seats);    
    }

    @Override
    public void setEngine(String engine) {
        this.setEngine(engine);
    }

    @Override
    public void setTripComputer(String tripComputer) {
        this.setTripComputer(tripComputer);
    }

    @Override
    public void setGPS(String GPS) {
        this.setGPS(GPS);
    }

    @Override
    public void setCarType(CarType carType) {
        this.setCarType(carType);
    }

    public Car getResult() {
        return new Car(seats, engine, tripComputer, GPS, carType);
    }
}
