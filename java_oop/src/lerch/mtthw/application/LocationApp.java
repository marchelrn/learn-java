package lerch.mtthw.application;

import lerch.mtthw.data.City;

public class LocationApp {
    static void main(String[] args) {
//        var location = new Location();
        var city = new City();
        city.name = "Jakarta";

        System.out.println(city.name);
    }
}
