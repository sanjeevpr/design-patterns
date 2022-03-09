package Builder.CarApp.Builder;

import Builder.CarApp.Products.CarType;

public interface Builder {
    void setSeats(int seats);
    void setEngine(String engine);
    void setTripComputer(String tripComputer);
    void setGPS(String GPS);
    void setCarType(CarType carType);
}
