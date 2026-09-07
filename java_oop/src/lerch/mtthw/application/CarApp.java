package lerch.mtthw.application;

import lerch.mtthw.data.Avanza;
import lerch.mtthw.data.Bus;
import lerch.mtthw.data.Car;

public class CarApp {
    static void main(String[] args) {
        Car car = new Avanza();

        System.out.println(car.getTier());
        car.drive();
        car.getBrand();
        car.isMaintenance();

        Car bigCar = new Bus();

        System.out.println(bigCar.getTier());
        bigCar.drive();
        System.out.println(bigCar.getBrand());
        System.out.println(bigCar.isMaintenance());
        System.out.println(bigCar.isBig());
    }
}
