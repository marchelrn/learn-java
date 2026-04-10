package java_basic;

public class Variable {
    public static void main(String[] args) {
        String name;
        name = "Andi";

        final int age = 25; // for constant variable 

        var city = "Jakarta"; // for flexible variable type inference

        System.out.println(name);
        System.out.println(age);
        System.out.println(city);

    }
}
