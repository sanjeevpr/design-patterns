package Builder.CarApp;

import Builder.CarApp.Builder.CarBuilder;
import Builder.CarApp.Director.Director;

public class CarApp {
    public static void main(String[] args) {
        Director director = new Director();

        CarBuilder carBuilder = new CarBuilder();
        director.constructCityCar(carBuilder);
    }
}
