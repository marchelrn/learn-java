package lerch.mtthw.application;

import lerch.mtthw.data.Customer;
import lerch.mtthw.data.Level;

public class EnumApp {
    static void main(String[] args) {
        Customer customer = new Customer();

        customer.setName("Marchel");
        customer.setLevel(Level.STANDARD);

        System.out.println(customer.getName());
        System.out.println(customer.getLevel());
        System.out.println(customer.getLevel().getDescription());

        String levelName = Level.STANDARD.name();
        System.out.println(levelName); // Convert menjadi String

        Level level = Level.valueOf("PREMIUM");
        System.out.println(level); // Convert menjadi enum

        for (var value : Level.values()){
            System.out.println(value); // mengembalikan seluruh isi dari enum
        }
    }
}
