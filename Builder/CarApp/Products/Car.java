package Builder.CarApp.Products;

public class Car {
    private int seats;
    private String engine;
    private String tripComputer;
    private String GPS;
    private CarType carType;

    public Car(int seats, String engine, String tripComputer, String GPS, CarType carType) {
        this.seats = seats;
        this.engine = engine;
        this.tripComputer = tripComputer;
        this.GPS = GPS;
        this.carType = carType;
    }

    public int getSeats() {
        return this.seats;
    }
    public void setSeats(int seats) {
        this.seats = seats;
    }
    public String getEngine() {
        return this.engine;
    }
    public void setEngine(String engine) {
        this.engine = engine;
    }
    public String getTripComputer() {
        return this.tripComputer;
    }
    public void setTripComputer(String tripComputer) {
        this.tripComputer = tripComputer;
    }
    public String getGPS() {
        return this.GPS;
    }
    public void setGPS(String GPS) {
        this.GPS = GPS;
    }
    public CarType getCarType() {
        return carType;
    }
    public void setCarType(CarType carType) {
        this.carType = carType;
    }
}
