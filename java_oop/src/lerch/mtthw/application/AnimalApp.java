package lerch.mtthw.application;

import lerch.mtthw.data.Animal;
import lerch.mtthw.data.Cat;

public class AnimalApp {
    static void main(String[] args) {

        Animal animal = new Cat();
        animal.name = "Puss";
        animal.run();
    }
}
