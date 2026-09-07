package lerch.mtthw.application;

import lerch.mtthw.data.Avanza;
import lerch.mtthw.data.Car;

public class CarApp {
    static void main(String[] args) {
        Car car = new Avanza();

        System.out.println(car.getTier());
        car.drive();
        car.getBrand();
        car.isMaintenance();
    }
}
