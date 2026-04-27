public class PersonApp {
    public static void main(String[] args) {
        String userName = "Marchel";
        String userAddress = "Malalayang 1";

        var person1 = new Person(userName, userAddress);
        System.out.println(person1.name);

        var person2 = new Person(userName);
        System.out.println(person2.name);

        var person3 = new Person();
        person3.name = userName;
        System.out.println(person3.name);
        person1.sayHello("Budi");
    }   
} 