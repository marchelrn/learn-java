package lerch.mtthw.application;

import static lerch.mtthw.data.Application.PROCESSORS;
import static lerch.mtthw.data.Constant.*;
import lerch.mtthw.data.Country;
import lerch.mtthw.util.MathUtil;

public class StaticApp {
    static void main(String[] args) {
        System.out.println(APPLICATION);
        System.out.println(VERSION);

        System.out.println(
                MathUtil.sum(1,1,1,1)
        );

        Country.city city = new Country.city();
        city.setName("Manado");
        System.out.println(city.getName());

        System.out.println(PROCESSORS);
    }
}
