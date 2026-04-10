class Person {
    String name;
    String address;
    final String country = "Indonesia";
}

public class Object {
    public static void main(String[] args) {
        var person1 = new Person();
        person1.name = "Marchel";
        person1.address = "Malalayang 1";
        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);
    }
}

