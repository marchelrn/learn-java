package src;
public class Scope {
    public static void main(String[] args) {
        sayHello("");
    }

    static void sayHello(String name){
        if (!name.isBlank()) {
            String hi = "Hai ";
            System.out.println(hi + name);
        } else {
            System.out.println("Please enter ur name");
        }
        System.out.println(name); // name still at the same scope
        System.out.println(name); // hi not in the same scope
    }
}
